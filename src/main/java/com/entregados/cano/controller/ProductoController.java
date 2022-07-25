package com.entregados.cano.controller;


import com.entregados.cano.model.Cliente;
import com.entregados.cano.model.Producto;
import com.entregados.cano.service.producto.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/producto")
public class ProductoController {


    @Autowired
    ProductoService productoService;

    @GetMapping("/listar")
    public ResponseEntity<List<Producto>> traerProductos(){
        return ResponseEntity.ok(productoService.traerProductos());
    }

    @PostMapping("/insertar")
    public ResponseEntity<Producto> insertar(@Valid @RequestBody Producto producto) { //permite leer como clase; si no, no reconoce
        return ResponseEntity.ok(productoService.insertar(producto));
    }

    @PutMapping("/actualizar")
    public ResponseEntity<Producto> actualizar(@Valid @RequestBody Producto producto) {
        return ResponseEntity.ok(productoService.actualizar(producto));
    }
}
