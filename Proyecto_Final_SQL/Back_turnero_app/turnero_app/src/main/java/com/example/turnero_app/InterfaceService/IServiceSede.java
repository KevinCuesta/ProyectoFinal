package com.example.turnero_app.InterfaceService;

import com.example.turnero_app.Entity.Sede;

import java.util.List;
import java.util.Optional;

public interface IServiceSede {
    Sede save(Sede sede);

    void update(Sede sede, Long id);

    void delete(Long id);

    Optional<Sede> findById(Long id);

    List<Sede> findAll();
}
