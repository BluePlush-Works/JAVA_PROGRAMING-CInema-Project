package com.iefp.Cinema.model;

import java.time.LocalDateTime;

public class Funcionario extends Utilizador {
    public Funcionario(String nome, String contato, String email, String senha, String perfil, Integer nFunc, LocalDateTime turno) {
        super(nome, contato, email, senha, perfil);
        this.nFunc = nFunc;
        this.turno = turno;
    }

    private Integer nFunc;
    private LocalDateTime turno;
}
