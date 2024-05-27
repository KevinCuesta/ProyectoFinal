package com.example.turnero_app.InterfaceService;

import com.example.turnero_app.Entity.Ciudad;

import java.util.List;
import java.util.Optional;

public interface IServiceCiudad {
    Ciudad save(Ciudad ciudad);
    void update(Ciudad ciudad, Long id);
    void delete(Long id);
    Optional<Ciudad> findById(Long id);
    List<Ciudad> findAll();
}
