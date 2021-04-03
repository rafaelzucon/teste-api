package com.testeapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.testeapi.entities.Aluno;

public interface AlunoRepository extends JpaRepository<Aluno, Integer> {

}
