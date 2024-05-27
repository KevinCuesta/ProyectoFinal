package com.example.turnero_app.Entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "turnos")
public class Turno {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigo;

    @Column(name = "estado", length = 20, nullable = false)
    private String estado;

    @Column(name = "fecha_turno", length = 20, nullable = false)
    private LocalDate fechaTurno;

    @Column(name = "hora_inicio", length = 20, nullable = false)
    private LocalDateTime horaInicioAtencion;

    @Column(name = "hora_fin", length = 20, nullable = false)
    private LocalDateTime horaFinAtencion;

    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;

    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "sede_id")
    private Sede sede;
}
