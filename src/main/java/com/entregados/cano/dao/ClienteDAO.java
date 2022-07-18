package com.entregados.cano.dao;

import com.entregados.cano.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteDAO extends JpaRepository<Cliente, Integer> {
}
