package com.examen.mongodb.controller;



import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.examen.mongodb.model.Cliente;
import com.examen.mongodb.pojo.Response;
import com.examen.mongodb.repo.ClienteRepo;
import com.examen.mongodb.service.ClienteService;

import io.swagger.annotations.Api;


@RestController
@Api(tags = "cliente")
public class ClienteController {


	@Autowired
	ClienteRepo repo;
	
	@Autowired
	ClienteService service;
	
	@GetMapping("/clientes")
	public ResponseEntity<Response> getAllAlumnos(){
		try {
			Object response = service.getAllClientes();
			return new ResponseEntity<>(new Response(true,"Success", response),HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(new Response(false,"error: "+ e.getMessage(),null),HttpStatus.OK);
		}
	}
	@PostMapping("NutriNet/Cliente")
		public ResponseEntity<Cliente> createCliente(@RequestBody Cliente cliente){
			try {
				Cliente _cliente = repo.save(cliente);
				return new ResponseEntity<>(_cliente, HttpStatus.CREATED);
						
			} catch (Exception e) {
				return new ResponseEntity<>(null,HttpStatus.INTERNAL_SERVER_ERROR);
			}
		}
	@GetMapping("NutriNet/Cliente/{id}")
	public ResponseEntity<Cliente> getClienteById(@PathVariable("id") String id){
		Optional<Cliente> cliente = repo.findById(id);
		
		if(cliente.isPresent()) {
			return new ResponseEntity<>(cliente.get(),HttpStatus.OK);
		}else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
	@GetMapping("NutriNet/Client/{id}")
	public ResponseEntity<Cliente> getClienteAll(@PathVariable("id") String id){
		Optional<Cliente> cliente = repo.findById(id);
		
		if(cliente.isPresent()) {
			return new ResponseEntity<>(cliente.get(),HttpStatus.OK);
		}else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
	
	@PutMapping("NutriNet/Cliente/{id}")
	public ResponseEntity<Cliente> updateC(@PathVariable("id") String id, @RequestBody Cliente cliente) {
	  Optional<Cliente> clienteData = repo.findById(id);

	  if (clienteData.isPresent()) {
	    return new ResponseEntity<>(repo.save(cliente), HttpStatus.OK);
	  } else {
	    return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	  }
	}
		
}
