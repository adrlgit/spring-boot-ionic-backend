package com.luis.projetoIonic.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.luis.projetoIonic.domain.Categoria;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Integer> {

	/*Esta interface erda de 'JpaRepository' esse tipo especial do spring é capas de acessar os dados
	com base em um tipo que vc  passsar. Ou seja o Objeto e o tipo do atributo identificador<Categoria, Integer>.
	Relaiza operações acesso a dados referente ao objeto categoria "CRUD".
	*/
}
