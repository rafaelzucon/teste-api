package com.testeapi.entities.dto.mapper;

import org.springframework.stereotype.Service;

import com.testeapi.entities.MapTable;
import com.testeapi.entities.dto.CursoDTO;

@Service
public class CursoMapper {

	public MapTable mapCursoDTO2Curso(CursoDTO dto) {
		MapTable curso = new MapTable(dto.getNome(), dto.getArea());
		return curso;
	}
}
