package com.example.turnero_app.Entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "sedes")
public class Sede {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nombre", length = 20, nullable = false)
    private String nombre;

    @Column(name = "direccion", length = 20, nullable = false)
    private String direccion;

    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    @JoinColumn(name = "ciudad_id")
    private Ciudad ciudad;
}
