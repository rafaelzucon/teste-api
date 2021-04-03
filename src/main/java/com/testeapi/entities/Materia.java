package com.testeapi.entities;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "materia")
public class Materia implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(nullable = false)
	private String nome;

	@ManyToMany
	@JoinTable(name = "grade_materia", joinColumns = {
			@JoinColumn(name = "materia_id", referencedColumnName = "id") }, inverseJoinColumns = {
					@JoinColumn(name = "grade_id", referencedColumnName = "id") })
	private Set<GradeCurricular> grades = new HashSet<>();

	public Materia() {
		// TODO Auto-generated constructor stub
	}

	public Materia(String nome, Set<GradeCurricular> grades) {
		super();
		this.nome = nome;
		this.grades = grades;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Set<GradeCurricular> getGrades() {
		return grades;
	}

	public void setGrades(Set<GradeCurricular> grades) {
		this.grades = grades;
	}

}
