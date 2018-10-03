package com.luis.projetoIonic.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.luis.projetoIonic.domain.Categoria;
import com.luis.projetoIonic.repositories.CategoriaRepository;

@Service
public class CategoriaService {

	/*
	 * Esta dependência com @Autowired vai ser instanciada automaticamente pelo Spring
	 * pelo mecanismo de injeção de dependencia ou inversão de control.
	 * 
	 */
	@Autowired
	private CategoriaRepository repo;
	
	/*Esta operação busca a categoria por código
	 */
	public Categoria buscar(Integer id) {
		Optional<Categoria> obj = repo.findById(id);
		return obj.orElse(null);
	}
}
