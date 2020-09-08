package com.farmacia10.farmacia10.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.farmacia10.farmacia10.model.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {

}
