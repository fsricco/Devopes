package br.com.value.projects.dominio;

import java.util.ArrayList;
import java.util.List;

public class Trilha {

	private String nome, descricao;
	private List<Curso> ListaCurso;
	private List<Aluno> ListaAlunoInscrito;
	private int id;
	private static int proximoId=1; 
	
	public Trilha(String nome, String descricao) {
		this.nome = nome;
		this.descricao = descricao;
		this.ListaCurso = new ArrayList<Curso>();
		this.ListaAlunoInscrito = new ArrayList<Aluno>();
		this.id = proximoId++;
	}

	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
        this.nome = nome;
    }
	
	public String getDescricao() {
		return descricao;
	}
	
	public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
	
	public List<Curso> getListaCurso() {
		return ListaCurso;
	}
	
	public void adicionaCursoLista(Curso curso) {
        ListaCurso.add(curso);
    }
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
        this.id = id;
    }
	
	public void modificarTrilha(Trilha trilha) {
        this.nome = trilha.nome;
        this.descricao = trilha.descricao;
        this.ListaCurso = trilha.ListaCurso;
	}
	
	
	 public void inscreverAluno(Aluno aluno) {
	        if (!ListaAlunoInscrito.contains(aluno)) {
	        	ListaAlunoInscrito.add(aluno);
	            aluno.inscreverNaTrilha(this);
	        }
	    }


	    public List<Aluno> getAlunosInscritos() {
	        return ListaAlunoInscrito;
	    }
	
}
