package com.testeapi.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.testeapi.entities.MapTable;
import com.testeapi.repositories.TesteRepository;
import com.testeapi.services.CursoService;

@Service
public class CursoServiceImpl implements CursoService {

	@Autowired
	private TesteRepository cursoRepository;

	@Override
	public List<MapTable> getCursos() {

		return cursoRepository.findAll();
	}

	@Override
	public MapTable save(MapTable curso) {

		return cursoRepository.save(curso);
	}

}
