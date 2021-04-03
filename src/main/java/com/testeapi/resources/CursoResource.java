package com.testeapi.resources;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.testeapi.entities.MapTable;
import com.testeapi.entities.dto.CursoDTO;
import com.testeapi.entities.dto.mapper.CursoMapper;
import com.testeapi.services.CursoService;

@RestController
@RequestMapping("/cursos")
public class CursoResource {
	@Autowired
	private CursoService cursoService;

	@Autowired
	private CursoMapper mapper;

	@GetMapping
	public ResponseEntity<List<MapTable>> getCursos() {
		List<MapTable> lista = cursoService.getCursos();
		return ResponseEntity.ok().body(lista);
	}

	@PostMapping("/salva")
	public ResponseEntity<MapTable> saveCurso(@Valid @RequestBody CursoDTO dto) throws URISyntaxException {
		MapTable newCurso = cursoService.save(mapper.mapCursoDTO2Curso(dto));
		return ResponseEntity.created(new URI("/cursos/salva/" + newCurso.getId())).body(newCurso);

	}
}
