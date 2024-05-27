package com.Final.Proyecto_Final.IService;

import com.Final.Proyecto_Final.Entity.Turno;

import java.util.List;
import java.util.Optional;

public interface ITurnoService {
    List<Turno> findAll();
    Optional<Turno> findById(String id);
    Turno save(Turno turno);
    void update(Turno turno, String id);
    void deleteLogical(Turno turno, String id);
    void delete(String id);
}
