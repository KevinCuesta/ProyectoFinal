package com.example.turnero_app.Repository;

import com.example.turnero_app.Entity.Ciudad;
import com.example.turnero_app.Entity.Sede;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SedeRepository extends JpaRepository<Sede,Long> {
}
