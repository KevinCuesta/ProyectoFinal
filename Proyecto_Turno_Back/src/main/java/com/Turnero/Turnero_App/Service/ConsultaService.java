package com.Turnero.Turnero_App.Service;

import com.Turnero.Turnero_App.Entity.Consulta;
import com.Turnero.Turnero_App.IRepository.IConsultaRepository;

import com.Turnero.Turnero_App.IService.IConsultaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ConsultaService implements IConsultaService {
    @Autowired
    private IConsultaRepository repository;
    @Override
    public Consulta save(Consulta consulta){return repository.save(consulta);}
    @Override
    public void update(Consulta consulta, Long id) {
        //Buscar si existe el dato con ese id
        Optional<Consulta> optional = repository.findById(id);

        //Si existe, se actualiza
        if (optional.isPresent()) {
            Consulta consultaUpdate = optional.get();
            consultaUpdate.setAsunto(consulta.getAsunto());
            repository.save(consultaUpdate);
        }else{
            throw new RuntimeException("No existe el registro para actualizar");
        }

    }
    @Override
    public void delete(Long id){repository.deleteById(id);}
    @Override
    public Optional<Consulta> findById( Long id) {
        return repository.findById(id);
    }
    @Override
    public List<Consulta> findAll() {
        return repository.findAll();
    }
}
