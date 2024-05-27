package com.example.turnero_app.InterfaceService;

import com.example.turnero_app.Entity.Turno;

import java.util.List;
import java.util.Optional;

public interface IServiceTurno {
    Turno save(Turno turno);
    void update(Turno turno, Long id);
    void delete(Long id);
    Optional<Turno> findById(Long id);
    List<Turno> findAll();
}
