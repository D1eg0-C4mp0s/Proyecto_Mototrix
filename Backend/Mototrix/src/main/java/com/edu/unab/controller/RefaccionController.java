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
import com.edu.unab.model.entity.Refaccion;
import com.edu.unab.model.service.RefaccionService;

@RestController
@RequestMapping("/api/refaccion")
public class RefaccionController {

	@Autowired
	private RefaccionService refaccionservice;
	
	@PostMapping
	public Refaccion guardar(@RequestBody Refaccion refaccion) {
		return refaccionservice.save(refaccion);
	}
	
	@GetMapping("/{id}")
	public Optional<Refaccion>buscarporID(@PathVariable Integer id){
		return refaccionservice.findById(id);
	}
	
	@GetMapping("/listar")
	public Iterable<Refaccion>listarTodos(){
		return refaccionservice.findAll();
	}
	
	@DeleteMapping("{id}")
	public void eliminar(@PathVariable Integer id) {
		refaccionservice.deleteById(id);
	}
}
