package br.com.controledeestoque.model;

public class Usuario {
	private String nome;
	private String email;
	
	public Usuario(String nome, String email) {
		this.nome = nome;
		this.email = email;
	}

	//Getters
	public String getNome() {
		return nome;
	}
	
	public String getEmail() {
		return email;
	}
	
	//Setters
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
}
