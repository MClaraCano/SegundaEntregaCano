package com.entregados.cano.dao;

import com.entregados.cano.model.Venta;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VentaDAO extends JpaRepository<Venta, Integer> {
}
