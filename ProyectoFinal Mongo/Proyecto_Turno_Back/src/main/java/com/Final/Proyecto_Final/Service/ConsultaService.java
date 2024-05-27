package com.Final.Proyecto_Final.Service;


import com.Final.Proyecto_Final.Entity.Consulta;
import com.Final.Proyecto_Final.IRepository.IConsultaRepository;
import com.Final.Proyecto_Final.IService.IConsultaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ConsultaService implements IConsultaService {

    @Autowired
    private IConsultaRepository repository;

    @Override
    public List<Consulta> findAll() {
        return repository.findAll();
    }

    @Override
    public Optional<Consulta> findById(String id) {
        return repository.findById(id);
    }

    @Override
    public Consulta save(Consulta consulta) {
        return repository.save(consulta);
    }

    @Override
    public void update(Consulta consulta, String id) {
        Optional<Consulta> optionalConsulta = repository.findById(id);
        if (optionalConsulta.isPresent()) {
            Consulta existingConsulta = optionalConsulta.get();
            existingConsulta.setAsunto(consulta.getAsunto());
            repository.save(existingConsulta);
        } else {
            System.out.println("Consulta no encontrada");
        }
    }

    @Override
    public void delete(String id) {
        repository.deleteById(id);
    }
}
