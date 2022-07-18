package com.entregados.cano.controller;

import com.entregados.cano.model.Cliente;
import com.entregados.cano.service.cliente.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cliente")
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @GetMapping("/listar") // trae lista completa
    public List<Cliente> traerCliente(){
        return clienteService.traerClientes();
    }

    @PostMapping("/insertar") // inserta nuevo elemento
    public Cliente insertar(@RequestBody Cliente cliente) { //permite leer como clase; si no, no reconoce
        return clienteService.insertar(cliente);
    }

    @PutMapping("/actualizar") // actualiza elemento existente o si no existe, lo crea.
    public Cliente actualizar(@RequestBody Cliente cliente) {
        return clienteService.actualizar(cliente);
    }

    @DeleteMapping("/eliminar")
    public void eliminar(@RequestBody Cliente cliente){
        clienteService.eliminar(cliente);
    }


    @DeleteMapping("/eliminardos/{dni}")
    public void eliminarPorId(@PathVariable("dni") Integer dni) {
        clienteService.eliminarPorId(dni);
    }

}
