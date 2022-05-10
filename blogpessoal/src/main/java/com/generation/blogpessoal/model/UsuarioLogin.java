package com.generation.blogpessoal.model;

public class UsuarioLogin {

	private Long id;
	
	private String nome;
	
	private String email_do_usuario;

	private String senha;
	
	private String foto;
	
	private String token;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail_do_usuario() {
		return email_do_usuario;
	}

	public void setEmail_do_usuario(String email_do_usuario) {
		this.email_do_usuario = email_do_usuario;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}
	
}
