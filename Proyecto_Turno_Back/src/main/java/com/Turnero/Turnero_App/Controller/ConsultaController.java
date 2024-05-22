package com.Turnero.Turnero_App.Controller;

import com.Turnero.Turnero_App.Entity.Consulta;
import com.Turnero.Turnero_App.IService.IConsultaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/consulta")
public class ConsultaController {
    @Autowired
    IConsultaService service;

    @PostMapping("")
    public Consulta save(@RequestBody Consulta consulta){
        return service.save(consulta);
    }

    @PutMapping("/{id}")
    public void update(@RequestBody Consulta consulta, @PathVariable Long id){
        service.update(consulta, id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        service.delete(id);
    }

    @GetMapping("")
    public List<Consulta> findAll(){
        return service.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Consulta> findById(@PathVariable Long id){
        return service.findById(id);
    }
}
