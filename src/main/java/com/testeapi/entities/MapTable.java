package com.testeapi.entities;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.PostPersist;
import javax.persistence.PrePersist;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.sun.istack.NotNull;

@Entity
@Table(name = "curso")
public class MapTable implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(name = "nome_curso", nullable = false)
	private String nome;

	@Column(nullable = true)
	private String area;

	@JsonFormat(pattern = "dd/MM/yyyy HH:mm")
	@CreationTimestamp
	@Column(name = "data_criacao")
	private LocalDateTime dataCriacao;

	@JsonFormat(pattern = "dd/MM/yyyy HH:mm:ss")
	@UpdateTimestamp
	@Column(name = "data_atualizacao")
	private LocalDateTime dataAtualizacao;

	@NotNull
	private String usuario;

	@Transient
	private BigDecimal valorDoCurso;

	@OneToMany(mappedBy = "curso")
	private List<Aluno> alunos = new ArrayList<>();

	@PostPersist
	private void aposPersistirDados() {
		this.nome = this.nome + "POST";
	}

	@PrePersist
	private void antesPersistirDados() {
		this.usuario = "Admin";
	}

	public MapTable() {
		// TODO Auto-generated constructor stub
	}

	public MapTable(String nome) {
		super();
		this.nome = nome;
	}

	public MapTable(String nome, String area) {
		super();
		this.nome = nome;
		this.area = area;
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

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public LocalDateTime getDataCriacao() {
		return dataCriacao;
	}

	public void setDataCriacao(LocalDateTime dataCriacao) {
		this.dataCriacao = dataCriacao;
	}

	public LocalDateTime getDataAtualizacao() {
		return dataAtualizacao;
	}

	public void setDataAtualizacao(LocalDateTime dataAtualizacao) {
		this.dataAtualizacao = dataAtualizacao;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public BigDecimal getValorDoCurso() {
		return valorDoCurso;
	}

	public void setValorDoCurso(BigDecimal valorDoCurso) {
		this.valorDoCurso = valorDoCurso;
	}

	public List<Aluno> getAlunos() {
		return alunos;
	}

	public void setAlunos(List<Aluno> alunos) {
		this.alunos = alunos;
	}

	@Override
	public String toString() {
		return "MapTable [id=" + id + ", nome=" + nome + ", area=" + area + "]";
	}
}
