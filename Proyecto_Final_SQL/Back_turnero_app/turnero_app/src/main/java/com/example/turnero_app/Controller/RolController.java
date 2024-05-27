package com.example.turnero_app.Controller;

import com.example.turnero_app.Entity.Rol;
import com.example.turnero_app.InterfaceService.IServiceRol;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/rol")
public class RolController {
    @Autowired
    IServiceRol iServiceRol;
    @PostMapping("")
    public Rol save(@RequestBody Rol rol){
        return iServiceRol.save(rol);
    }

    @PutMapping("/{id}")
    public void update(@RequestBody Rol rol, @PathVariable Long id){
        iServiceRol.update(rol, id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        iServiceRol.delete(id);
    }

    @GetMapping("")
    public List<Rol> findAll(){
        return iServiceRol.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Rol> findById(@PathVariable Long id){
        return iServiceRol.findById(id);
    }
}
