package com.Turnero.Turnero_App.Controller;

import com.Turnero.Turnero_App.Entity.Turno;
import com.Turnero.Turnero_App.IService.ITurnoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/turno")
public class TurnoController {
    @Autowired
    ITurnoService service;

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
