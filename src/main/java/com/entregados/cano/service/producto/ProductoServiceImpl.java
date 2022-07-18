package com.entregados.cano.service.producto;

import com.entregados.cano.dao.ProductoDAO;
import com.entregados.cano.model.Producto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductoServiceImpl implements ProductoService {

    @Autowired
    ProductoDAO productoDAO;

    @Override
    public List<Producto> traerProductos() {
        return productoDAO.findAll();
    }

    @Override
    public Producto insertar(Producto producto) {
        if (productoDAO.existsById(producto.getId_producto())){
            return null; }
        else {
            return productoDAO.save(producto);}
    }

    @Override
    public Producto actualizar(Producto producto) {
        return productoDAO.save(producto);
    }
}
