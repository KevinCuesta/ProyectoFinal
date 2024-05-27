package com.example.turnero_app.Service;

import com.example.turnero_app.Entity.Turno;
import com.example.turnero_app.InterfaceService.IServiceTurno;
import com.example.turnero_app.Repository.TurnoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TurnoService implements IServiceTurno {
    @Autowired
    private TurnoRepository repository;
    private Integer TIEMPO_ATENCION = 10;

    @Override
    public Turno save(Turno turno) {
        Turno nuevoTurno = new Turno();
        nuevoTurno.setFechaTurno(turno.getFechaTurno());
        nuevoTurno.setHoraInicioAtencion(turno.getHoraInicioAtencion());
        nuevoTurno.setHoraFinAtencion(turno.getHoraInicioAtencion().plusMinutes(TIEMPO_ATENCION));
        nuevoTurno.setEstado("PENDIENTE");
        nuevoTurno.setUsuario(turno.getUsuario());
        nuevoTurno.setSede(turno.getSede());
        if (verificarDisponibilidad(nuevoTurno)) {
            return repository.save(nuevoTurno);
        }
        throw new RuntimeException("Ya existe ese turno y a esa hora");
    }

    @Override
    public void update(Turno turno, Long id) {
        //Buscar si existe el dato con ese id
        Optional<Turno> optional = repository.findById(id);
        //Si existe, se actualiza
        if (optional.isPresent()) {
            Turno turnoUpdate = new Turno();
            turnoUpdate.setCodigo(id);
            turnoUpdate.setEstado(turno.getEstado());
            turnoUpdate.setFechaTurno(turno.getFechaTurno());
            turnoUpdate.setHoraInicioAtencion(turno.getHoraInicioAtencion());
            turnoUpdate.setHoraFinAtencion(turno.getHoraInicioAtencion().plusMinutes(TIEMPO_ATENCION));
            turnoUpdate.setUsuario(turno.getUsuario());
            turnoUpdate.setSede(turno.getSede());
            repository.save(turnoUpdate);
        } else {
            throw new RuntimeException("No existe el registro para actualizar");
        }
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }

    @Override
    public Optional<Turno> findById(Long id) {
        return repository.findById(id);
    }

    @Override
    public List<Turno> findAll() {
        return repository.findAll();
    }

    private Boolean verificarDisponibilidad(Turno turno) {
        List<Turno> turnosExistentes = repository.buscarPorCiudadYfechaTurno(turno.getSede().getId(),turno.getFechaTurno());
        for (Turno r : turnosExistentes) {
            if (r.getHoraInicioAtencion().isBefore(turno.getHoraFinAtencion()) && r.getHoraFinAtencion().isAfter(turno.getHoraInicioAtencion())) {
                return false;  // El turno está ocupado en el horario solicitado
            }
        }
        return true;  // El turno está disponible
    }
}
