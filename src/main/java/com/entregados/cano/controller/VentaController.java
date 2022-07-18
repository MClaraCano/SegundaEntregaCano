package com.entregados.cano.controller;


import com.entregados.cano.model.Producto;
import com.entregados.cano.model.Venta;
import com.entregados.cano.service.venta.VentaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/venta")
public class VentaController {

    @Autowired
    VentaService ventaService;


    @GetMapping("/listar")
    public List<Venta> traerVentas(){
        return ventaService.traerVentas();
    }

    @PostMapping("/insertar")
    public Venta insertar(@RequestBody Venta venta) { //permite leer como clase; si no, no reconoce
        return ventaService.insertar(venta);
    }

    @PutMapping("/actualizar")
    public Venta actualizar(@RequestBody Venta venta) {
        return ventaService.actualizar(venta);
    }
}
