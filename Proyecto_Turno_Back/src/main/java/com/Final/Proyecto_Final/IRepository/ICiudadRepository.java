package com.Final.Proyecto_Final.IRepository;

import com.Final.Proyecto_Final.Entity.Ciudad;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICiudadRepository extends MongoRepository<Ciudad, String> {
}
