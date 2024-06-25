package com.favina.todocode_springboot_finalproj.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter(AccessLevel.PRIVATE)
@Setter(AccessLevel.PRIVATE)
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    String  nombre;
    String apellido;
    String dni;
}