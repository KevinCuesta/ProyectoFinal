package com.example.turnero_app.Service;

import com.example.turnero_app.Entity.Rol;
import com.example.turnero_app.InterfaceService.IServiceRol;
import com.example.turnero_app.Repository.RolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RolService implements IServiceRol {
    @Autowired
    RolRepository rolRepository;

    @Override
    public Rol save(Rol rol) {
        return rolRepository.save(rol);
    }

    @Override
    public void update(Rol rol, Long id) {
        Optional<Rol> rolOptional = rolRepository.findById(id);
        if (rolOptional.isPresent()) {
            Rol rolActualizado = new Rol();
            rolActualizado.setId(id);
            rolActualizado.setNombre(rol.getNombre());
            rolRepository.save(rolActualizado);
        } else {
            throw new RuntimeException("No existe el registro para actualizar");
        }

    }

    @Override
    public void delete(Long id) {
        rolRepository.deleteById(id);
    }

    @Override
    public Optional<Rol> findById(Long id) {
        return findById(id);
    }

    @Override
    public List<Rol> findAll() {
        return rolRepository.findAll();
    }
}
