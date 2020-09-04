package com.ensino.minhaEscola.controller;

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

import com.ensino.minhaEscola.model.Aluno;
import com.ensino.minhaEscola.repository.AlunoRepository;

@RestController
@RequestMapping("/aluno")
@CrossOrigin("*")
public class AlunoController {

	@Autowired
	private AlunoRepository repo;
	
	@GetMapping
	public ResponseEntity<List<Aluno>> findAllAluno()
	{
		return ResponseEntity.ok(repo.findAll());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Aluno> findByIdAluno(@PathVariable long id)
	{
		return repo.findById(id).map(resp -> ResponseEntity.ok(resp)).orElse(ResponseEntity.notFound().build());
	}
	
	@PostMapping
	public ResponseEntity<Aluno> post(@RequestBody Aluno aluno)
	{
		return ResponseEntity.status(HttpStatus.CREATED).body(repo.save(aluno));
	}
	
	@PutMapping
	public ResponseEntity<Aluno> put(@RequestBody Aluno aluno)
	{
		return ResponseEntity.status(HttpStatus.OK).body(repo.save(aluno));
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable long id)
	{
		repo.deleteById(id);
	}
}