package com.Turnero.Turnero_App.Service;

import com.Turnero.Turnero_App.Entity.Turno;
import com.Turnero.Turnero_App.IRepository.ITurnoRepository;
import com.Turnero.Turnero_App.IService.ITurnoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TurnoService implements ITurnoService {
    @Autowired
    private ITurnoRepository repository;
    @Override
    public Turno save(Turno turno){return repository.save(turno);}
    @Override
    public void update(Turno turno, Long id) {
        //Buscar si existe el dato con ese id
        Optional<Turno> optional = repository.findById(id);

        //Si existe, se actualiza
        if (optional.isPresent()) {
            Turno turnoUpdate = optional.get();
            turnoUpdate.setIdCedulaUsuario(turno.getIdCedulaUsuario());
            turnoUpdate.setCodigo(turno.getCodigo());
            turnoUpdate.setEstado(turnoUpdate.getEstado());
            turnoUpdate.setFecha(turnoUpdate.getFecha());
            turnoUpdate.setIdUsuario(turnoUpdate.getIdUsuario());
            turnoUpdate.setIdConsulta(turnoUpdate.getIdConsulta());
            turnoUpdate.setIdCiudadTurno(turnoUpdate.getIdCiudadTurno());
            turnoUpdate.setIdTurno(turno.getIdTurno());
            repository.save(turnoUpdate);
        }else{
            throw new RuntimeException("No existe el registro para actualizar");
        }
    }
    @Override
    public void delete(Long id){repository.deleteById(id);}
    @Override
    public Optional<Turno> findById( Long id) {
        return repository.findById(id);
    }
    @Override
    public List<Turno> findAll() {
        return repository.findAll();
    }
}
