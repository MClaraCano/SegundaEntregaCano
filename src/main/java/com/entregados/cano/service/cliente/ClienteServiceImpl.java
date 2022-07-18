package com.entregados.cano.service.cliente;

import com.entregados.cano.dao.ClienteDAO;
import com.entregados.cano.model.Cliente;
import com.entregados.cano.service.cliente.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteServiceImpl implements ClienteService {

    @Autowired
    private ClienteDAO clienteDAO;

    @Override
    public List<Cliente> traerClientes() {
        return clienteDAO.findAll();
    }

    @Override
    public Cliente insertar(Cliente cliente) {
        if (clienteDAO.existsById(cliente.getDni())){
            return null; }
        else {
        return clienteDAO.save(cliente);}
    }

    @Override
    public Cliente actualizar(Cliente cliente) {
            return clienteDAO.save(cliente);
    }

    @Override
    public void eliminarPorId(Integer dni) {
        clienteDAO.deleteById(dni);
    }

    @Override
    public void eliminar(Cliente cliente) {
        clienteDAO.delete(cliente);
    }


}
