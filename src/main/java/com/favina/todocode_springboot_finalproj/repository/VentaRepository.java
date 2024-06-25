package com.favina.todocode_springboot_finalproj.repository;

import com.favina.todocode_springboot_finalproj.model.Venta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VentaRepository extends JpaRepository<Venta, Long> {
}
