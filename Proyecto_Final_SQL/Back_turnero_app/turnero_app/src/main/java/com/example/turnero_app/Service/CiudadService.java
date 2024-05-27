package com.example.turnero_app.Service;

import com.example.turnero_app.Entity.Ciudad;
import com.example.turnero_app.InterfaceService.IServiceCiudad;
import com.example.turnero_app.Repository.CiudadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class CiudadService implements IServiceCiudad {
    @Autowired
    private CiudadRepository repository;
    @Override
    public Ciudad save(Ciudad ciudad){return repository.save(ciudad);}
    @Override
    public void update(Ciudad ciudad, Long id) {
        //Buscar si existe el dato con ese id
        Optional<Ciudad> optional = repository.findById(id);

        //Si existe, se actualiza
        if (optional.isPresent()) {
            Ciudad ciudadUpdate = new Ciudad();
            ciudadUpdate.setId(id);
            ciudadUpdate.setNombre(ciudad.getNombre());
            repository.save(ciudadUpdate);
        }else{
            throw new RuntimeException("No existe el registro para actualizar");
        }

    }
    @Override
    public void delete(Long id){repository.deleteById(id);}
    @Override
    public Optional<Ciudad> findById( Long id) {
        return repository.findById(id);
    }
    @Override
    public List<Ciudad> findAll() {
        return repository.findAll();
    }
}
