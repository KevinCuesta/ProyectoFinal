package com.example.turnero_app.Repository;

import com.example.turnero_app.Entity.Turno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface TurnoRepository extends JpaRepository<Turno, Long> {
    @Query(value = "SELECT * FROM turnos WHERE sede_id = :sedeId AND fecha_turno = :fechaTurno", nativeQuery = true)
    List<Turno> buscarPorCiudadYfechaTurno(@Param("sedeId") Long sedeId, @Param("fechaTurno") LocalDate fechaTurno);
}
