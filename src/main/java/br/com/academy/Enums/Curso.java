package br.com.academy.Enums;

public enum Curso {
	
	ADMINISTRACAO("Adminstracao"),
	INFORMATICA("Informatica"),
	CONTABILIDADE("Contabilidade"),
	PROGRAMACAO("Programacao"),
	ENFERMAGEM("Enfermagem");
	
	private String curso;
	
	private Curso(String curso) {
		this.curso = curso;
	}
}
