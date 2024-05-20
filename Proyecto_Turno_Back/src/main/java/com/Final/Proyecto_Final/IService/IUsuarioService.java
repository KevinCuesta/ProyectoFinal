package com.Final.Proyecto_Final.IService;

import com.Final.Proyecto_Final.Entity.Usuario;

import java.util.List;
import java.util.Optional;

public interface IUsuarioService {
    List<Usuario> findAll();
    Optional<Usuario> findById(String id);
    Usuario save(Usuario usuario);
    void update(Usuario usuario, String id);
    void deleteLogical(Usuario usuario, String id);
    void delete(String id);
}
