package com.example.turnero_app.Controller;

import com.example.turnero_app.Entity.Sede;
import com.example.turnero_app.InterfaceService.IServiceSede;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/sede")
public class SedeController {
    @Autowired
    IServiceSede iSedeService;

    @PostMapping("")
    public Sede save(@RequestBody Sede sede){
        return iSedeService.save(sede);
    }

    @PutMapping("/{id}")
    public void update(@RequestBody Sede sede, @PathVariable Long id){
        iSedeService.update(sede, id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        iSedeService.delete(id);
    }

    @GetMapping("")
    public List<Sede> findAll(){
        return iSedeService.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Sede> findById(@PathVariable Long id){
        return iSedeService.findById(id);
    }
}
