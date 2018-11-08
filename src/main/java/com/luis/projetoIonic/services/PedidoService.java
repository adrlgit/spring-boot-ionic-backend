package com.luis.projetoIonic.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.luis.projetoIonic.domain.Pedido;
import com.luis.projetoIonic.repositories.PedidoRepository;
import com.luis.projetoIonic.services.exceptions.ObjectNotFoundException;

@Service
public class PedidoService {

	/*
	 * Esta dependência com @Autowired vai ser instanciada automaticamente pelo Spring
	 * pelo mecanismo de injeção de dependencia ou inversão de control.
	 * 
	 */
	@Autowired
	private PedidoRepository repo;
	
	/*Esta operação busca a categoria por código
	 */
	public Pedido find(Integer id) {
		Optional<Pedido> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id: " + id + ", Tipo: " + Pedido.class.getName()));
	}
}
