package com.Turnero.Turnero_App.IService;

import com.Turnero.Turnero_App.Entity.Turno;

import java.util.List;
import java.util.Optional;

public interface ITurnoService {
    Turno save(Turno turno);
    void update(Turno turno, Long id);
    void delete(Long id);
    Optional<Turno> findById(Long id);
    List<Turno> findAll();
}
