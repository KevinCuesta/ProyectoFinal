package com.Final.Proyecto_Final.Controller;

import com.Final.Proyecto_Final.Entity.Ciudad;
import com.Final.Proyecto_Final.IService.ICiudadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/ciudad")
public class CiudadController {

    @Autowired
    private ICiudadService service;

    @GetMapping()
    public List<Ciudad> findAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Ciudad> findById(@PathVariable String id) {
        return service.findById(id);
    }

    @PostMapping()
    public Ciudad save(@RequestBody Ciudad ciudad) {
        return service.save(ciudad);
    }

    @PutMapping("/{id}")
    public void update(@RequestBody Ciudad ciudad, @PathVariable String id) {
        service.update(ciudad, id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable String id) {
        service.delete(id);
    }
}


