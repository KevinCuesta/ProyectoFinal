package com.Turnero.Turnero_App.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "ciudad")
public class Ciudad {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idCiudadTurno;
    @Column(name = "ciudad", length = 50, nullable = false)
    private String ciudad;

    public long getIdCiudadTurno() {
        return idCiudadTurno;
    }

    public void setIdCiudadTurno(long idCiudadTurno) {
        this.idCiudadTurno = idCiudadTurno;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
}
