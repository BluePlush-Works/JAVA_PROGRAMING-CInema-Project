package com.iefp.Cinema.model;

public class Cliente extends Utilizador {
    private Integer nif;

    public Cliente(String nome, String contato, String email, String senha, String perfil, Integer nif) {
        super(nome, contato, email, senha, perfil);
        this.nif = nif;
    }

    public Integer getNif() {
        return nif;
    }
}
