package com.Turnero.Turnero_App.IService;

import com.Turnero.Turnero_App.Entity.Ciudad;

import java.util.List;
import java.util.Optional;

public interface ICiudadService {
    Ciudad save(Ciudad ciudad);
    void update(Ciudad ciudad, Long id);
    void delete(Long id);
    Optional<Ciudad> findById(Long id);
    List<Ciudad> findAll();
}
