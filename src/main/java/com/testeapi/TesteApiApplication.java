package com.testeapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.testeapi.entities.MapTable;
import com.testeapi.repositories.TesteRepository;

@SpringBootApplication
public class TesteApiApplication implements CommandLineRunner {
	@Autowired
	private TesteRepository testeRepository;

	// @Autowired
	// private AlunoRepository alunoRepository;

	// @Autowired
	// private GradeRepository gradeRepository;

	// @Autowired
	// private MateriaRepository materiaRepository;

	public static void main(String[] args) {
		SpringApplication.run(TesteApiApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		MapTable tb1 = new MapTable("Graduação em T.I.", "Computacao");
		MapTable tb2 = new MapTable("Graduação em Bostologia", "Biologicas");
		MapTable tb3 = new MapTable("Graduação em Sexologia", "Saúde");
		MapTable tb4 = new MapTable("Graduação em Tretologia", "Humanas");
		MapTable tb5 = new MapTable("Graduação em Mimimi", "Humanas");
		MapTable tb6 = new MapTable("Graduação em Sexo Oral", "Humanas");
		testeRepository.save(tb1);
		testeRepository.save(tb2);
		testeRepository.save(tb3);
		testeRepository.save(tb4);
		testeRepository.save(tb5);
		testeRepository.save(tb6);

	}

}
