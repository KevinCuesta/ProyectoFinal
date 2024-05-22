package com.Turnero.Turnero_App.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "usuario")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idUsuario;

    @Column(name = "idcedulausuario", length = 10, nullable = false)
    private String idCedulaUsuario;
    @Column(name = "nombre", length = 150, nullable = false)
    private String nombre;
    @Column(name = "correo", length = 50, nullable = false)
    private String correo;
    @Column(name = "contraseña", length = 50, nullable = false)
    private String contraseña;


    public long getId() {
        return idUsuario;
    }

    public void setId(long id) {
        this.idUsuario = id;
    }

    public String getIdCedulaUsuario() {
        return idCedulaUsuario;
    }

    public void setIdCedulaUsuario(String idCedulaUsuario) {
        this.idCedulaUsuario = idCedulaUsuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
}
