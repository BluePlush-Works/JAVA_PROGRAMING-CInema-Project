package com.iefp.Cinema.repository;

import com.iefp.Cinema.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}
