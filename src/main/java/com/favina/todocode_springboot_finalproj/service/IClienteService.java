package com.favina.todocode_springboot_finalproj.service;

import com.favina.todocode_springboot_finalproj.model.Cliente;

import java.util.List;

public interface IClienteService {

    public List<Cliente> getClientes();

    public void create(Cliente cliente);

    public void delete(Long id);

    public Cliente findCliente(Long id);

    public void editCliente(Cliente cliente);

}
