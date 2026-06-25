package com.iefp.Cinema.repository;

import com.iefp.Cinema.model.Utilizador;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UtilizadorRepository extends JpaRepository<Utilizador, Long> {

    Boolean existsByEmail(String email);
}
