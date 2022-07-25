package com.entregados.cano.controller;

import com.entregados.cano.model.Cliente;
import com.entregados.cano.service.cliente.ClienteService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
// @RequiredArgsConstructor-Se puede usar en vez de @Autowired
@RequestMapping("/cliente")
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @GetMapping("/listar") // trae lista completa
    public ResponseEntity<List<Cliente>> traerCliente(){
        return ResponseEntity.ok(clienteService.traerClientes());
    }

    @PostMapping("/insertar") // inserta nuevo elemento
    //valid permite detectar que no sea nulo lo que se ingresa
    public ResponseEntity<Cliente> insertar(@Valid @RequestBody Cliente cliente) { //RB permite leer como clase; si no, no reconoce
        return ResponseEntity.ok(clienteService.insertar(cliente));
    }

    @PutMapping("/actualizar") // actualiza elemento existente o si no existe, lo crea.
    public ResponseEntity<Cliente> actualizar(@Valid @RequestBody Cliente cliente) {
        return ResponseEntity.ok(clienteService.actualizar(cliente));
    }

    @DeleteMapping("/eliminar")
    public void eliminar(@Valid @RequestBody Cliente cliente){
        clienteService.eliminar(cliente);
    }


    @DeleteMapping("/eliminardos/{dni}")
    public void eliminarPorId(@PathVariable("dni") Integer dni) {
        clienteService.eliminarPorId(dni);
    }

}
