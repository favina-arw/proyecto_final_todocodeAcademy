package com.favina.todocode_springboot_finalproj.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter(AccessLevel.PRIVATE)
@Setter(AccessLevel.PRIVATE)
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Column(name = "codigo_producto")
    Long codigoProducto;

    String nombre;
    String marca;
    Double costo;

    @Column(name = "cantidad_disponible")
    Double cantidadDisponible;
}
