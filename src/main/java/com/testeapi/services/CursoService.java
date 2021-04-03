package com.testeapi.services;

import java.util.List;

import com.testeapi.entities.MapTable;

public interface CursoService {

	public List<MapTable> getCursos();

	public MapTable save(MapTable curso);

}
