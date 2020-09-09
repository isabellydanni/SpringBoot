package org.generation.redeSocial.repository;

import java.util.List;

import org.generation.redeSocial.model.Postagem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostagemRepository extends JpaRepository<Postagem, Long>{

	//findAll-Busca todos / ByTitulo-Pelo título / Containing-Like do sql / IgnoreCase-Desconsidera maiúsculo e minúsculo
	public List<Postagem> findAllByDescricaoContainingIgnoreCase (String tema);
}
