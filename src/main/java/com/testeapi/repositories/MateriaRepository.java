package com.testeapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.testeapi.entities.Materia;

public interface MateriaRepository extends JpaRepository<Materia, Integer> {

}
