package com.Final.Proyecto_Final.Service;


import com.Final.Proyecto_Final.Entity.Usuario;
import com.Final.Proyecto_Final.IRepository.IUsuarioRepository;
import com.Final.Proyecto_Final.IService.IUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService implements IUsuarioService {

    @Autowired
    private IUsuarioRepository repository;

    @Override
    public List<Usuario> findAll() {
        return repository.findAll();
    }

    @Override
    public Optional<Usuario> findById(String id) {
        return repository.findById(id);
    }

    @Override
    public Usuario save(Usuario usuario) {
        return repository.save(usuario);
    }

    @Override
    public void update(Usuario usuario, String id) {
        Optional<Usuario> optionalUsuario = repository.findById(id);
        if (optionalUsuario.isPresent()) {
            Usuario existingUsuario = optionalUsuario.get();
            existingUsuario.setIdCedulaUsuario(usuario.getIdCedulaUsuario());
            existingUsuario.setNombre(usuario.getNombre());
            existingUsuario.setCorreo(usuario.getCorreo());
            existingUsuario.setContraseña(usuario.getContraseña());
            repository.save(existingUsuario);
        } else {
            System.out.println("Usuario no encontrado");
        }
    }

    @Override
    public void deleteLogical(Usuario usuario, String id) {
        update(usuario, id);
    }

    @Override
    public void delete(String id) {
        repository.deleteById(id);
    }
}




