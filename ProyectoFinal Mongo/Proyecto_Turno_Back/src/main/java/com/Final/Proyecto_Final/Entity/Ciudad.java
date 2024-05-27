package com.Final.Proyecto_Final.Entity;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "ciudad")
public class Ciudad {

    @Id
    private String idCiudadTurno;

    private String ciudad;

    // Getters y Setters
    public String getIdCiudadTurno() {
        return idCiudadTurno;
    }

    public void setIdCiudadTurno(String idCiudadTurno) {
        this.idCiudadTurno = idCiudadTurno;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
}