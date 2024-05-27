package com.Final.Proyecto_Final.IService;

import com.Final.Proyecto_Final.Entity.Consulta;

import java.util.List;
import java.util.Optional;

public interface IConsultaService {
    List<Consulta> findAll();
    Optional<Consulta> findById(String id);
    Consulta save(Consulta consulta);
    void update(Consulta consulta, String id);
    void delete(String id);
}