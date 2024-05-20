package com.Final.Proyecto_Final.IRepository;

import com.Final.Proyecto_Final.Entity.Usuario;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUsuarioRepository extends MongoRepository<Usuario, String> {
}