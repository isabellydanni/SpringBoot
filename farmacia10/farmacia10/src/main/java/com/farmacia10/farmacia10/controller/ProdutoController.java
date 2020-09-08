package com.farmacia10.farmacia10.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.farmacia10.farmacia10.model.Produto;
import com.farmacia10.farmacia10.repository.ProdutoRepository;

@RestController
@RequestMapping("/produto")
@CrossOrigin("*")
public class ProdutoController {
	@Autowired
	private ProdutoRepository repo;

	@GetMapping
	public ResponseEntity<List<Produto>> findAllProduto()
	{
	return ResponseEntity.ok(repo.findAll());
	}

	@GetMapping("/{id}")
	public ResponseEntity<Produto> findByIdProduto(@PathVariable long id)
	{
	return repo.findById(id).map(resp -> ResponseEntity.ok(resp)).orElse(ResponseEntity.notFound().build());
	}
	
	@PostMapping
	public ResponseEntity<Produto> post(@RequestBody Produto produto)
	{
		return ResponseEntity.status(HttpStatus.CREATED).body(repo.save(produto));
	}
	
	@PutMapping
	public ResponseEntity<Produto> put(@RequestBody Produto produto)
	{
		return ResponseEntity.status(HttpStatus.OK).body(repo.save(produto));
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable long id)
	{
		repo.deleteById(id);
	}	
	}