package com.example.turnero_app.InterfaceService;

import com.example.turnero_app.Entity.Login;
import com.example.turnero_app.Entity.Usuario;

import java.util.List;
import java.util.Optional;

public interface IServiceUsuario {
    Usuario save(Usuario usuario);
    Usuario login(Login login);
    void update(Usuario usuario, Long id);
    void delete(Long id);
    Optional<Usuario> findById(Long id);
    List<Usuario> findAll();
    List<Usuario> filtrarUsuarios(String filtro);
}
