package com.proyectAlex.Challenge_Foro_Alura.models;

import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;

@Entity
@Table(name = "usuario")
@Getter
@Setter
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotEmpty
    private String nombre;

    @NotEmpty
    private String email;

    @NotEmpty
    private String password;

    // Método para obtener el email
    public String getEmail() {
        return this.email;
    }
}
