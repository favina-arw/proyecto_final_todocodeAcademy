package com.favina.todocode_springboot_finalproj.service;

import com.favina.todocode_springboot_finalproj.model.Venta;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IVentaService {
    public List<Venta> getVentas();

    public void create(Venta venta);

    public void delete(Long id);

    public Venta getVentaById(Long id);

    public Venta editVenta(Venta venta);
}
