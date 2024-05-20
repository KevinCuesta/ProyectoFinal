package com.Final.Proyecto_Final.Controller;


import com.Final.Proyecto_Final.Entity.Turno;
import com.Final.Proyecto_Final.IService.ITurnoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/turno")
public class TurnoController {

    @Autowired
    private ITurnoService service;

    @GetMapping()
    public List<Turno> findAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Turno> findById(@PathVariable String id) {
        return service.findById(id);
    }

    @PostMapping()
    public Turno save(@RequestBody Turno turno) {
        return service.save(turno);
    }

    @PutMapping("/{id}")
    public void update(@RequestBody Turno turno, @PathVariable String id) {
        service.update(turno, id);
    }

    @PutMapping("delete-logical/{id}")
    public void deleteLogical(@RequestBody Turno turno, @PathVariable String id) {
        service.update(turno, id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable String id) {
        service.delete(id);
    }
}



