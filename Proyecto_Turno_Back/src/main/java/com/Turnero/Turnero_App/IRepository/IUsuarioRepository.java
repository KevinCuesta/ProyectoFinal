package com.Turnero.Turnero_App.IRepository;

import com.Turnero.Turnero_App.Entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUsuarioRepository extends JpaRepository<Usuario, Long> {
}
