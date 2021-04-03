package com.testeapi.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.testeapi.entities.MapTable;

public interface TesteRepository extends JpaRepository<MapTable, Integer> {

	List<MapTable> findByNome(String nome);

	List<MapTable> findByNomeContaining(String valor);

	List<MapTable> findByNomeLike(String valor);

	List<MapTable> findByNomeContainingIgnoreCase(String valor);

	List<MapTable> findByNomeLikeIgnoreCase(String valor);

}
