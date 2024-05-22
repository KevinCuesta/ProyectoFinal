package com.Turnero.Turnero_App.IRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.Turnero.Turnero_App.Entity.Turno;
import org.springframework.stereotype.Repository;

@Repository
public interface ITurnoRepository extends JpaRepository<Turno, Long> {
}
