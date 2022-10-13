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
import com.edu.unab.model.entity.Vehiculo;
import com.edu.unab.model.service.VehiculoService;

@RestController
@RequestMapping("/api/vehiculos")
public class VehiculoController {

	@Autowired
	private VehiculoService vehiculoservice;
	
	@PostMapping
	public Vehiculo guardar(@RequestBody Vehiculo vehiculo) {
		return vehiculoservice.save(vehiculo);
	}
	
	@GetMapping("/{id}")
	public Optional<Vehiculo>buscarporID(@PathVariable Integer id){
		return vehiculoservice.findById(id);
	}
	
	@GetMapping("/listar")
	public Iterable<Vehiculo>listarTodos(){
		return vehiculoservice.findAll();
	}
	
	@DeleteMapping("{id}")
	public void eliminar(@PathVariable Integer id) {
		vehiculoservice.deleteById(id);
	}
}
