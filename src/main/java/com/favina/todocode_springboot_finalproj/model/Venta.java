package com.favina.todocode_springboot_finalproj.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;
@Entity
@Getter(AccessLevel.PRIVATE)
@Setter(AccessLevel.PRIVATE)
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Venta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Column(name = "codigo_venta")
    Long codigoVenta;
    Double total;

    @OneToMany
    @JoinColumn(name = "venta_id")
    List<Producto> listaProducto;

    @ManyToOne(targetEntity = Cliente.class)
    Cliente cliente;
}
