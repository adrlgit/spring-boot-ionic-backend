package com.luis.projetoIonic.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.luis.projetoIonic.domain.Categoria;

@RestController
@RequestMapping(value="/categorias")
public class CategoriaResource {

	@RequestMapping(method=RequestMethod.GET)
	public List<Categoria> listar() {
		
		Categoria cat = new Categoria();
		cat.setId(1);
		cat.setNome("Informatica");
		Categoria cat2 = new Categoria(2, "Escritório");
		
		//Criação do array liste pois o liste como
		List<Categoria> lista = new ArrayList<>();
		lista.add(cat);
		lista.add(cat2);
		
		return lista;
	}
}
