package com.Turnero.Turnero_App.IRepository;

import com.Turnero.Turnero_App.Entity.Ciudad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICiudadRepository extends JpaRepository<Ciudad,Long> {
}
