package com.examen.mongodb.repo;

import java.util.List;
import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.examen.mongodb.model.Cliente;


public interface ClienteRepo extends MongoRepository<Cliente, String> {
	List<Cliente> findAll();
}
