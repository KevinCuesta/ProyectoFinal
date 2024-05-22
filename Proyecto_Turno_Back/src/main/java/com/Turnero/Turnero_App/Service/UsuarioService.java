package com.Turnero.Turnero_App.Service;

import com.Turnero.Turnero_App.Entity.Usuario;
import com.Turnero.Turnero_App.IRepository.IUsuarioRepository;
import com.Turnero.Turnero_App.IService.IUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService implements IUsuarioService {
    @Autowired
    private IUsuarioRepository repository;
    @Override
    public Usuario save(Usuario usuario){return repository.save(usuario);}
    @Override
    public void update(Usuario usuario, Long id) {
        //Buscar si existe el dato con ese id
        Optional<Usuario> optional = repository.findById(id);

        //Si existe, se actualiza
        if (optional.isPresent()) {
            Usuario usuarioUpdate = optional.get();
            usuarioUpdate.setIdCedulaUsuario(usuario.getIdCedulaUsuario());
            usuarioUpdate.setNombre(usuario.getNombre());
            usuarioUpdate.setCorreo(usuario.getCorreo());
            usuarioUpdate.setContraseña(usuario.getContraseña());
            repository.save(usuarioUpdate);
        }else{
            throw new RuntimeException("No existe el registro para actualizar");
        }

    }

    @Override
    public void delete(Long id){repository.deleteById(id);}
    @Override
    public Optional<Usuario> findById( Long id) {
        return repository.findById(id);
    }
    @Override
    public List<Usuario> findAll() {
        return repository.findAll();
    }
}
