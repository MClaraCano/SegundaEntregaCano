package com.entregados.cano.dao;

import com.entregados.cano.model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoDAO extends JpaRepository<Producto, Integer> {
}
