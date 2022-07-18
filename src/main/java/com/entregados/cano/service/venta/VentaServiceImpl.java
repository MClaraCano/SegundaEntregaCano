package com.entregados.cano.service.venta;

import com.entregados.cano.dao.VentaDAO;
import com.entregados.cano.model.Venta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VentaServiceImpl implements VentaService {

    @Autowired
    VentaDAO ventaDAO;

    @Override
    public List<Venta> traerVentas() {
        return ventaDAO.findAll();
    }

    @Override
    public Venta insertar(Venta venta) {
        if (ventaDAO.existsById(venta.getId_venta())){
            return null; }
        else {
            return ventaDAO.save(venta);}
    }

    @Override
    public Venta actualizar(Venta venta) {
        return ventaDAO.save(venta);
    }
}
