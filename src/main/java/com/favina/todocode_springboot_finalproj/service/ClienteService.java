package com.favina.todocode_springboot_finalproj.service;

import com.favina.todocode_springboot_finalproj.model.Cliente;
import com.favina.todocode_springboot_finalproj.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService implements IClienteService{

    @Autowired
    ClienteRepository cr;

    @Override
    public List<Cliente> getClientes() {
        return cr.findAll();
    }

    @Override
    public void create(Cliente cliente) {
        cr.save(cliente);
    }

    @Override
    public void delete(Long id) {
        Cliente dCliente = cr.findById(id).orElse(null);
        cr.delete(dCliente);
    }

    @Override
    public Cliente findCliente(Long id) {
        return cr.findById(id).orElse(null);
    }

    @Override
    public void editCliente(Cliente cliente) {
        cr.save(cliente);
    }
}
