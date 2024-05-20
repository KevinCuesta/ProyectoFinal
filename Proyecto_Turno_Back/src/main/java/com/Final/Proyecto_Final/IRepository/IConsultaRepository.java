package com.Final.Proyecto_Final.IRepository;

import com.Final.Proyecto_Final.Entity.Consulta;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IConsultaRepository extends MongoRepository<Consulta, String> {
}