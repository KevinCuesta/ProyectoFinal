package com.Final.Proyecto_Final.Service;


import com.Final.Proyecto_Final.Entity.Turno;
import com.Final.Proyecto_Final.IRepository.ITurnoRepository;
import com.Final.Proyecto_Final.IService.ITurnoService;
import com.Final.Proyecto_Final.IService.IUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class TurnoService implements ITurnoService {

    @Autowired
    private ITurnoRepository repository;

    @Autowired
    private IUsuarioService usuarioService;

    @Override
    public List<Turno> findAll() {
        return repository.findAll();
    }

    @Override
    public Optional<Turno> findById(String id) {
        return repository.findById(id);
    }

    @Override
    public Turno save(Turno turno) {
        // Verificar que el usuario exista
        if (usuarioService.findById(turno.getIdUsuario()).isEmpty()) {
            throw new RuntimeException("Usuario no existe");
        }

        // Generar código
        turno.setCodigo("T-" + (int)(Math.random() * 10000));

        // Establecer fecha actual
        turno.setFecha(new Date());

        return repository.save(turno);
    }

    @Override
    public void update(Turno turno, String id) {
        Optional<Turno> ts = repository.findById(id);
        if (ts.isPresent()) {
            Turno turnoUpdate = ts.get();
            turnoUpdate.setIdCedulaUsuario(turno.getIdCedulaUsuario());
            turnoUpdate.setCodigo(turno.getCodigo());
            turnoUpdate.setEstado(turno.getEstado());
            turnoUpdate.setFecha(new Date());
            turnoUpdate.setIdUsuario(turno.getIdUsuario());
            turnoUpdate.setIdConsulta(turno.getIdConsulta());
            turnoUpdate.setIdCiudadTurno(turno.getIdCiudadTurno());
            repository.save(turnoUpdate);
        } else {
            System.out.println("No existe el turno");
        }
    }

    @Override
    public void deleteLogical(Turno turno, String id) {
        update(turno, id);
    }

    @Override
    public void delete(String id) {
        repository.deleteById(id);
    }
}

