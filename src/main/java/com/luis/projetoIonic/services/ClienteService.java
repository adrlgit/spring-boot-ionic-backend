package com.luis.projetoIonic.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.luis.projetoIonic.domain.Cliente;
import com.luis.projetoIonic.repositories.ClienteRepository;
import com.luis.projetoIonic.services.exceptions.ObjectNotFoundException;

@Service
public class ClienteService {

	/*
	 * Esta dependência com @Autowired vai ser instanciada automaticamente pelo Spring
	 * pelo mecanismo de injeção de dependencia ou inversão de control.
	 * 
	 */
	@Autowired
	private ClienteRepository repo;
	
	/*Esta operação busca a categoria por código
	 */
	public Cliente find(Integer id) {
		Optional<Cliente> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id: " + id + ", Tipo: " + Cliente.class.getName()));
	}
}
