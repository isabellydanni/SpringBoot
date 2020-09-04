package com.ensino.minhaEscola.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ensino.minhaEscola.model.Aluno;

@Repository
public interface AlunoRepository extends JpaRepository<Aluno, Long>{

}