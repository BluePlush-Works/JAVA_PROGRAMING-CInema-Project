package com.iefp.Cinema.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Funcionario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nfuncionario;
    private String cargo;
    private String turno;


// Conposição

@OneToOne
@JoinColumn(name = "utilizador_id", unique = true)
private Utilizador utilizador;

}

