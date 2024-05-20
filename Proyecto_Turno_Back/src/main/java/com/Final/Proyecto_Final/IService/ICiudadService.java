package com.Final.Proyecto_Final.IService;

import com.Final.Proyecto_Final.Entity.Ciudad;

import java.util.List;
import java.util.Optional;

public interface ICiudadService {
    List<Ciudad> findAll();
    Optional<Ciudad> findById(String id);
    Ciudad save(Ciudad ciudad);
    void update(Ciudad ciudad, String id);
    void delete(String id);
}