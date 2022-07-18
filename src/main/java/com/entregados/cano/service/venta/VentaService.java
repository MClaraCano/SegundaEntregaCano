package com.entregados.cano.service.venta;

import com.entregados.cano.model.Cliente;
import com.entregados.cano.model.Venta;

import java.util.List;

public interface VentaService {

    List<Venta> traerVentas();
    Venta insertar(Venta venta);
    Venta actualizar(Venta venta);

}
