package com.Turnero.Turnero_App.IRepository;

import com.Turnero.Turnero_App.Entity.Consulta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IConsultaRepository extends JpaRepository<Consulta, Long> {
}
