package com.Turnero.Turnero_App.IService;

import com.Turnero.Turnero_App.Entity.Consulta;

import java.util.List;
import java.util.Optional;

public interface IConsultaService {
    Consulta save(Consulta consulta);
    void update(Consulta consulta, Long id);
    void delete(Long id);
    Optional<Consulta> findById(Long id);
    List<Consulta> findAll();
}
