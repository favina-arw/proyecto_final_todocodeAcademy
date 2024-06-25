package com.favina.todocode_springboot_finalproj.service;

import com.favina.todocode_springboot_finalproj.model.Producto;
import com.favina.todocode_springboot_finalproj.repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductoService implements IProductoService{

    @Autowired
    ProductoRepository pr;

    @Override
    public List<Producto> getProductos() {
        return pr.findAll();
    }

    @Override
    public void create(Producto producto) {
        pr.save(producto);
    }

    @Override
    public void delete(Long id) {
        pr.deleteById(id);
    }

    @Override
    public Producto findProducto(Long id) {
        return pr.findById(id).orElse(null);
    }

    @Override
    public Producto editProducto(Producto producto) {
        return pr.save(producto);
    }
}
