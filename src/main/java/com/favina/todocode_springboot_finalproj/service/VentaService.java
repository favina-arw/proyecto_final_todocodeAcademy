package com.favina.todocode_springboot_finalproj.service;

import com.favina.todocode_springboot_finalproj.model.Venta;
import com.favina.todocode_springboot_finalproj.repository.VentaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VentaService implements IVentaService{

    @Autowired
    VentaRepository vr;

    @Override
    public List<Venta> getVentas() {
        return vr.findAll();
    }

    @Override
    public void create(Venta venta) {
        vr.save(venta);
    }

    @Override
    public void delete(Long id) {
        vr.deleteById(id);
    }

    @Override
    public Venta getVentaById(Long id) {
        return vr.findById(id).orElse(null);
    }

    @Override
    public Venta editVenta(Venta venta) {
        return vr.save(venta);
    }
}
