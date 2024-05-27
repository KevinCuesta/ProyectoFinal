package com.example.turnero_app.Controller;

import com.example.turnero_app.Entity.Login;
import com.example.turnero_app.Entity.Usuario;
import com.example.turnero_app.InterfaceService.IServiceUsuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/usuario")
public class UsuarioController {
    @Autowired
    IServiceUsuario service;

    @PostMapping("")
    public Usuario save(@RequestBody Usuario usuario) {
        return service.save(usuario);
    }

    @PostMapping("/login")
    public Usuario save(@RequestBody Login request) {
        return service.login(request);
    }

    @PutMapping("/{id}")
    public void update(@RequestBody Usuario usuario, @PathVariable Long id) {
        service.update(usuario, id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }

    @GetMapping("")
    public List<Usuario> findAll() {
        return service.findAll();
    }

    @GetMapping("search")
    public List<Usuario> filtrar(@Param("filtro") String filtro) {
        return service.filtrarUsuarios(filtro);
    }

    @GetMapping("/{id}")
    public Optional<Usuario> findById(@PathVariable Long id) {
        return service.findById(id);
    }
}
