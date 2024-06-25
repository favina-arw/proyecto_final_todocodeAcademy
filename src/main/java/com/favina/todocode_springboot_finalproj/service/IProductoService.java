package com.favina.todocode_springboot_finalproj.service;

import com.favina.todocode_springboot_finalproj.model.Producto;

import java.util.List;

public interface IProductoService {

    public List<Producto> getProductos();

    public void create(Producto producto);

    public void delete(Long id);

    public Producto findProducto(Long id);

    public Producto editProducto(Producto producto);
}
