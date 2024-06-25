package com.favina.todocode_springboot_finalproj.repository;

import com.favina.todocode_springboot_finalproj.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}
