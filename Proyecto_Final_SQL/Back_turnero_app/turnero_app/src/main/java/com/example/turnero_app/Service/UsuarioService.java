package com.example.turnero_app.Service;

import com.example.turnero_app.Entity.Login;
import com.example.turnero_app.Entity.Usuario;
import com.example.turnero_app.InterfaceService.IServiceUsuario;
import com.example.turnero_app.Repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
@Service
public class UsuarioService implements IServiceUsuario {
    @Autowired
    private UsuarioRepository usuarioRepository;

    @Override
    public Usuario save(Usuario usuario) {
        if (usuarioRepository.existsByCorreo(usuario.getCorreo())) {
            throw new RuntimeException("Ese correo ya existe");
        }
        return usuarioRepository.save(usuario);
    }

    @Override
    public Usuario login(Login login) {
        if (usuarioRepository.existsByCorreo(login.getCorreo())) {
            Usuario usuario = usuarioRepository.findByCorreoAndPassword(login.getCorreo(), login.getPassword());
            if(Objects.isNull(usuario)){
                throw new RuntimeException("No se encontraron coincidencias");
            }
            return usuario;
        }
        throw new RuntimeException("Ese correo no existe, crea una cuenta");
    }

    @Override
    public void update(Usuario usuario, Long id) {
        Optional<Usuario> optional = usuarioRepository.findById(id);

        //Si existe, se actualiza
        if (optional.isPresent()) {
            Usuario usuarioUpdate = new Usuario();
            usuarioUpdate.setId(id);
            usuarioUpdate.setIdentificacion(usuario.getIdentificacion());
            usuarioUpdate.setNombre(usuario.getNombre());
            usuarioUpdate.setCorreo(usuario.getCorreo());
            usuarioUpdate.setPassword(usuario.getPassword());
            usuarioUpdate.setRol(usuario.getRol());
            usuarioRepository.save(usuarioUpdate);
        } else {
            throw new RuntimeException("No existe el registro para actualizar");
        }

    }

    @Override
    public void delete(Long id) {
        usuarioRepository.deleteById(id);
    }

    @Override
    public Optional<Usuario> findById(Long id) {
        return usuarioRepository.findById(id);
    }

    @Override
    public List<Usuario> findAll() {
        return usuarioRepository.findAll();
    }

    @Override
    public List<Usuario> filtrarUsuarios(String filtro) {
        return usuarioRepository.buscarUsuarios(filtro);
    }
}
