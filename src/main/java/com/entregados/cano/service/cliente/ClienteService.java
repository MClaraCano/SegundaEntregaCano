package com.entregados.cano.service.cliente;

import com.entregados.cano.model.Cliente;

import java.util.List;

public interface ClienteService {

    List<Cliente> traerClientes();
    Cliente insertar(Cliente cliente);
    Cliente actualizar(Cliente cliente);
    void eliminarPorId(Integer dni);
    void eliminar(Cliente cliente);

}
