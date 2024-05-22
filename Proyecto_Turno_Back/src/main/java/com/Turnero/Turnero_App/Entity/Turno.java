package com.Turnero.Turnero_App.Entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "turno")
public class Turno {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idTurno;

    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "idCedulaUsuario", nullable = false)
    private Usuario idCedulaUsuario;
    @Column(name = "codigo", length = 50, nullable = false)
    private String codigo;
    @Column(name = "estado", length = 50, nullable = false)
    private String estado;
    @Column(name = "fecha", length = 50, nullable = false)
    private Date fecha;
    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "idUsuario", nullable = false)
    private Usuario idUsuario;
    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "idConsulta", nullable = false)
    private Consulta idConsulta;
    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "idCiudadTurno", nullable = false)
    private Ciudad idCiudadTurno;

    public long getIdTurno() {
        return idTurno;
    }

    public void setIdTurno(long idTurno) {
        this.idTurno = idTurno;
    }

    public Usuario getIdCedulaUsuario() {
        return idCedulaUsuario;
    }

    public void setIdCedulaUsuario(Usuario idCedulaUsuario) {
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

    public Usuario getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Usuario idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Consulta getIdConsulta() {
        return idConsulta;
    }

    public void setIdConsulta(Consulta idConsulta) {
        this.idConsulta = idConsulta;
    }

    public Ciudad getIdCiudadTurno() {
        return idCiudadTurno;
    }

    public void setIdCiudadTurno(Ciudad idCiudadTurno) {
        this.idCiudadTurno = idCiudadTurno;
    }
}
