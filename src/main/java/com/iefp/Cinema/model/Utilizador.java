package com.iefp.Cinema.model;

public class Utilizador {

    private String nome;
    private String contato;
    private String email;
    private String senha;
    private String perfil; //Funcionario-Utilizador

    public Utilizador(String nome, String contato, String email, String senha, String perfil) {
        this.nome = nome;
        this.contato = contato;
        this.email = email;
        this.senha = senha;
        this.perfil = perfil;
    }

    public String getNome() {
        return nome;
    }

    public String getContato() {
        return contato;
    }

    public String getEmail() {
        return email;
    }

    public String getSenha() {
        return senha;
    }

    public String getPerfil() {
        return perfil;
    }
}
