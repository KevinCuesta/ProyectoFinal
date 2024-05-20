package com.Final.Proyecto_Final.Service;


import com.Final.Proyecto_Final.Entity.Ciudad;
import com.Final.Proyecto_Final.IRepository.ICiudadRepository;
import com.Final.Proyecto_Final.IService.ICiudadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CiudadService implements ICiudadService {

    @Autowired
    private ICiudadRepository repository;

    @Override
    public List<Ciudad> findAll() {
        return repository.findAll();
    }

    @Override
    public Optional<Ciudad> findById(String id) {
        return repository.findById(id);
    }

    @Override
    public Ciudad save(Ciudad ciudad) {
        return repository.save(ciudad);
    }

    @Override
    public void update(Ciudad ciudad, String id) {
        Optional<Ciudad> cs = repository.findById(id);
        if (cs.isPresent()) {
            Ciudad ciudadUpdate = cs.get();
            ciudadUpdate.setCiudad(ciudad.getCiudad());
            repository.save(ciudadUpdate);
        } else {
            System.out.println("No existe la ciudad");
        }
    }

    @Override
    public void delete(String id) {
        repository.deleteById(id);
    }
}

