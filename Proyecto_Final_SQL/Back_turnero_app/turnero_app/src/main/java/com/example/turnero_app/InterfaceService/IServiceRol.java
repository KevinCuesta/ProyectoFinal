package com.example.turnero_app.InterfaceService;

import com.example.turnero_app.Entity.Rol;

import java.util.List;
import java.util.Optional;

public interface IServiceRol {
    Rol save(Rol rol);
    void update(Rol rol, Long id);
    void delete(Long id);
    Optional<Rol> findById(Long id);
    List<Rol> findAll();
}
