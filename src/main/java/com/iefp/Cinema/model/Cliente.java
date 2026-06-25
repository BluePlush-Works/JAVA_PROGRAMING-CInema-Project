package com.iefp.Cinema.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nif;


    //Composição

    @OneToOne
    @JoinColumn(name = "utilizador_id", unique = true)
    private Utilizador utilizador;
}



