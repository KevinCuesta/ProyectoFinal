package com.example.turnero_app.Controller;

import com.example.turnero_app.Entity.Ciudad;
import com.example.turnero_app.InterfaceService.IServiceCiudad;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/ciudad")
public class CiudadController {
    @Autowired
    IServiceCiudad service;

    @PostMapping("")
    public Ciudad save(@RequestBody Ciudad ciudad){
        return service.save(ciudad);
    }

    @PutMapping("/{id}")
    public void update(@RequestBody Ciudad ciudad, @PathVariable Long id){
        service.update(ciudad, id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        service.delete(id);
    }

    @GetMapping("")
    public List<Ciudad> findAll(){
        return service.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Ciudad> findById(@PathVariable Long id){
        return service.findById(id);
    }
}
