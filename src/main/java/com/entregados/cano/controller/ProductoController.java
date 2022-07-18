package com.entregados.cano.controller;


import com.entregados.cano.model.Cliente;
import com.entregados.cano.model.Producto;
import com.entregados.cano.service.producto.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/producto")
public class ProductoController {


    @Autowired
    ProductoService productoService;

    @GetMapping("/listar")
    public List<Producto> traerProductos(){
        return productoService.traerProductos();
    }

    @PostMapping("/insertar")
    public Producto insertar(@RequestBody Producto producto) { //permite leer como clase; si no, no reconoce
        return productoService.insertar(producto);
    }

    @PutMapping("/actualizar")
    public Producto actualizar(@RequestBody Producto producto) {
        return productoService.actualizar(producto);
    }
}
