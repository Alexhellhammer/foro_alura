package com.proyectAlex.Challenge_Foro_Alura.models;

import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import java.time.LocalDateTime;

@Entity
@Table(name = "topico")
@Getter
@Setter
public class Topico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotEmpty
    private String titulo;

    @Lob
    @NotEmpty
    private String mensaje;

    @NotNull
    private LocalDateTime fechaCreacion = LocalDateTime.now();

    private String estado = "ABIERTO";

    @ManyToOne
    @JoinColumn(name = "autor_id", nullable = false)
    private Usuario autor;

    @ManyToOne
    @JoinColumn(name = "curso_id")
    private Curso curso;
}


