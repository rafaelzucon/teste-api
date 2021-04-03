package com.testeapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.testeapi.entities.GradeCurricular;

public interface GradeRepository extends JpaRepository<GradeCurricular, Integer> {

}
