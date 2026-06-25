package com.iefp.Cinema.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Utilizador {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)

    private Long id;
    private String nome;
    private String contato;

    @Column(unique = true)
    private String email;
    private String senha;
    private String perfil; //Funcionario-Utilizador


}
