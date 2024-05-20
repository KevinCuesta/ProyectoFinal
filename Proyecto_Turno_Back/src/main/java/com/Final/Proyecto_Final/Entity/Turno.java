package com.Final.Proyecto_Final.Entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document(collection = "turno")
public class Turno {

    @Id
    private String idTurno;

    private String idCedulaUsuario;
    private String codigo;
    private String estado;
    private Date fecha;
    private String idUsuario;
    private String idConsulta;
    private String idCiudadTurno;

    // Getters y Setters
    public String getIdTurno() {
        return idTurno;
    }

    public void setIdTurno(String idTurno) {
        this.idTurno = idTurno;
    }

    public String getIdCedulaUsuario() {
        return idCedulaUsuario;
    }

    public void setIdCedulaUsuario(String idCedulaUsuario) {
        this.idCedulaUsuario = idCedulaUsuario;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getIdConsulta() {
        return idConsulta;
    }

    public void setIdConsulta(String idConsulta) {
        this.idConsulta = idConsulta;
    }

    public String getIdCiudadTurno() {
        return idCiudadTurno;
    }

    public void setIdCiudadTurno(String idCiudadTurno) {
        this.idCiudadTurno = idCiudadTurno;
    }
}
