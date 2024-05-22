package com.Turnero.Turnero_App.Service;

import com.Turnero.Turnero_App.Entity.Ciudad;
import com.Turnero.Turnero_App.Entity.Consulta;
import com.Turnero.Turnero_App.IRepository.ICiudadRepository;
import com.Turnero.Turnero_App.IRepository.IConsultaRepository;
import com.Turnero.Turnero_App.IService.ICiudadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CiudadService implements ICiudadService {
    @Autowired
    private ICiudadRepository repository;
    @Override
    public Ciudad save(Ciudad ciudad){return repository.save(ciudad);}
    @Override
    public void update(Ciudad ciudad, Long id) {
        //Buscar si existe el dato con ese id
        Optional<Ciudad> optional = repository.findById(id);

        //Si existe, se actualiza
        if (optional.isPresent()) {
            Ciudad ciudadUpdate = optional.get();
            ciudadUpdate.setCiudad(ciudad.getCiudad());
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
