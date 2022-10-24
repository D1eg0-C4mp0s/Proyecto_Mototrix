package com.edu.unab.controller;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.edu.unab.model.entity.Servicio;
import com.edu.unab.model.service.ServicioService;

@RestController
@RequestMapping("/api/servicio")
public class ServicioController {

	@Autowired
	private ServicioService servicioservice;
	
	@PostMapping
	public Servicio guardar(@RequestBody Servicio servicio) {
		return servicioservice.save(servicio);
	}
	
	@GetMapping("/{id}")
	public Optional<Servicio>buscarporID(@PathVariable Integer id){
		return servicioservice.findById(id);
	}
	
	@GetMapping("/listar")
	public Iterable<Servicio>listarTodos(){
		return servicioservice.findAll();
	}
	
	@DeleteMapping("{id}")
	public void eliminar(@PathVariable Integer id) {
		servicioservice.deleteById(id);
	}
}
