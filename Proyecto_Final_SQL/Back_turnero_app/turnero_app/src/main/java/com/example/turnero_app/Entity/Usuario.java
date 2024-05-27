package com.example.turnero_app.Entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "usuarios")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "numero_identificacion", length = 10, nullable = false)
    private String identificacion;

    @Column(name = "nombre", length = 150, nullable = false)
    private String nombre;

    @Column(name = "correo", length = 50, nullable = false)
    private String correo;

    @Column(name = "password", length = 50, nullable = false)
    private String password;
    @ManyToOne(optional = false)
    @JoinColumn(name = "rol_id")
    private Rol rol;
}
