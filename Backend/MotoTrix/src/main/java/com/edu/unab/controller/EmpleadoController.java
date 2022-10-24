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
import com.edu.unab.model.entity.Empleado;
import com.edu.unab.model.service.EmpleadoService;

@RestController
@RequestMapping("/api/empleado")
public class EmpleadoController {

	@Autowired
	private EmpleadoService empleadoservice;
	
	@PostMapping
	public Empleado guardar(@RequestBody Empleado empleado) {
		return empleadoservice.save(empleado);
	}
	
	@GetMapping("/{id}")
	public Optional<Empleado>buscarporID(@PathVariable Integer id){
		return empleadoservice.findById(id);
	}
	
	@GetMapping("/listar")
	public Iterable<Empleado>listarTodos(){
		return empleadoservice.findAll();
	}
	
	@DeleteMapping("{id}")
	public void eliminar(@PathVariable Integer id) {
		empleadoservice.deleteById(id);
	}
}
