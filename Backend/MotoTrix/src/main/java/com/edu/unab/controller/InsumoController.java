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
import com.edu.unab.model.entity.Insumo;
import com.edu.unab.model.service.InsumoService;

@RestController
@RequestMapping("/api/insumo")
public class InsumoController {

	@Autowired
	private InsumoService insumoservice;
	
	@PostMapping
	public Insumo guardar(@RequestBody Insumo insumo) {
		return insumoservice.save(insumo);
	}
	
	@GetMapping("/id")
	public Optional<Insumo>buscarporID(@PathVariable Integer id){
		return insumoservice.findById(id);
	}
	
	@GetMapping("/listar")
	public Iterable<Insumo>listarTodos(){
		return insumoservice.findAll();
	}
	
	@DeleteMapping("{id}")
	public void eliminar(@PathVariable Integer id) {
		insumoservice.deleteById(id);
	}
}
