package com.Final.Proyecto_Final.Controller;

import com.Final.Proyecto_Final.Entity.Consulta;
import com.Final.Proyecto_Final.IService.IConsultaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/consulta")
public class ConsultaController {

    @Autowired
    private IConsultaService service;

    @GetMapping()
    public List<Consulta> findAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Consulta> findById(@PathVariable String id) {
        return service.findById(id);
    }

    @PostMapping()
    public Consulta save(@RequestBody Consulta consulta) {
        return service.save(consulta);
    }

    @PutMapping("/{id}")
    public void update(@RequestBody Consulta consulta, @PathVariable String id) {
        service.update(consulta, id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable String id) {
        service.delete(id);
    }
}