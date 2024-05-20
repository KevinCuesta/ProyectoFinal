package com.Final.Proyecto_Final.IRepository;

import com.Final.Proyecto_Final.Entity.Turno;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ITurnoRepository extends MongoRepository<Turno, String> {
}
