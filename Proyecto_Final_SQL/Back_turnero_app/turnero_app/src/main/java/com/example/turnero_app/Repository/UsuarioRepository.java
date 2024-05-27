package com.example.turnero_app.Repository;

import com.example.turnero_app.Entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario,Long> {
    Usuario findByCorreoAndPassword(String correo, String password);
    Boolean existsByCorreo(String correo);
    @Query(value = "SELECT * FROM usuarios WHERE nombre Like %:filtro% OR numero_identificacion LIKE %:filtro% OR correo LIKE %:filtro%", nativeQuery = true)
    List<Usuario> buscarUsuarios (@Param("filtro") String filtro);
}
