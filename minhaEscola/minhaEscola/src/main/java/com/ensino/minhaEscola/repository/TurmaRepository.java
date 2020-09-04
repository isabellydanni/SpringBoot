package com.ensino.minhaEscola.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ensino.minhaEscola.model.Turma;

@Repository
public interface TurmaRepository extends JpaRepository<Turma, Long>{

}