package com.example.turnero_app.Controller;

import com.example.turnero_app.Entity.Turno;
import com.example.turnero_app.InterfaceService.IServiceTurno;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/turno")
public class TurnoController {
    @Autowired
    IServiceTurno service;

    @PostMapping("")
    public Turno save(@RequestBody Turno turno){
        return service.save(turno);
    }

    @PutMapping("/{id}")
    public void update(@RequestBody Turno turno, @PathVariable Long id){
        service.update(turno, id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        service.delete(id);
    }

    @GetMapping("")
    public List<Turno> findAll(){
        return service.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Turno> findById(@PathVariable Long id){
        return service.findById(id);
    }
}
