package com.example.turnero_app.Service;

import com.example.turnero_app.Entity.Sede;
import com.example.turnero_app.InterfaceService.IServiceSede;
import com.example.turnero_app.Repository.SedeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class SedeService implements IServiceSede {
    @Autowired
    SedeRepository sedeRepository;

    @Override
    public Sede save(Sede sede) {
        return sedeRepository.save(sede);
    }

    @Override
    public void update(Sede sede, Long id) {
        Optional<Sede> sedeOptional = sedeRepository.findById(id);
        if (sedeOptional.isPresent()) {
            Sede sedeActualizada = new Sede();
            sedeActualizada.setId(id);
            sedeActualizada.setNombre(sede.getNombre().toUpperCase());
            sedeActualizada.setDireccion(sede.getDireccion().toUpperCase());
            sedeActualizada.setCiudad(sede.getCiudad());
            sedeRepository.save(sedeActualizada);
        }else{
            throw new RuntimeException("No existe el registro para actualizar");
        }

    }

    @Override
    public void delete(Long id) {
        Optional<Sede> sedeOptional = sedeRepository.findById(id);
        if (sedeOptional.isPresent()) {
            sedeRepository.deleteById(id);
        }
    }

    @Override
    public Optional<Sede> findById(Long id) {
        return sedeRepository.findById(id);
    }

    @Override
    public List<Sede> findAll() {
        return sedeRepository.findAll();
    }

}
