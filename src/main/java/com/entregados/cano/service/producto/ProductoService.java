package com.entregados.cano.service.producto;

import com.entregados.cano.model.Cliente;
import com.entregados.cano.model.Producto;

import java.util.List;

public interface ProductoService {

    List<Producto> traerProductos();
    Producto insertar(Producto producto);
    Producto actualizar(Producto producto);

}
