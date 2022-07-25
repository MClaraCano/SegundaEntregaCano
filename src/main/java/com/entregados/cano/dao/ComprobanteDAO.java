package com.entregados.cano.dao;

import com.entregados.cano.model.Comprobante;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ComprobanteDAO extends JpaRepository<Comprobante, Integer> {
}
