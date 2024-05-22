package com.Turnero.Turnero_App.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "consulta")
public class Consulta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idConsulta;

    @Column(name = "asunto", length = 50, nullable = false)
    private String asunto;

    public long getIdConsulta() {
        return idConsulta;
    }

    public void setIdConsulta(long idConsulta) {
        this.idConsulta = idConsulta;
    }

    public String getAsunto() {
        return asunto;
    }

    public void setAsunto(String asunto) {
        this.asunto = asunto;
    }

}
