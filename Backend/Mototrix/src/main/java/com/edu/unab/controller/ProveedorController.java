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
import com.edu.unab.model.entity.Proveedor;
import com.edu.unab.model.service.ProveedorService;

@RestController
@RequestMapping("/api/proveedor")
public class ProveedorController {

	@Autowired
	private ProveedorService provedorservice;
	
	@PostMapping
	public Proveedor guardar(@RequestBody Proveedor provedor) {
		return provedorservice.save(provedor);
	}
	
	@GetMapping("/{id}")
	public Optional<Proveedor>buscarporID(@PathVariable Integer id){
		return provedorservice.findById(id);
	}
	
	@GetMapping("/listar")
	public Iterable<Proveedor>listarTodos(){
		return provedorservice.findAll();
	}
	
	@DeleteMapping("{id}")
	public void eliminar(@PathVariable Integer id) {
		provedorservice.deleteById(id);
	}
}
