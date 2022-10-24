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

import com.edu.unab.model.entity.FichaServicio;
import com.edu.unab.model.service.FichaServicioService;

@RestController
@RequestMapping("/api/fichaservicio")
public class FichaServicioController {

	@Autowired
	private FichaServicioService fichaServicioService;
	
	@PostMapping
	public FichaServicio guardar(@RequestBody FichaServicio fs) {
		return fichaServicioService.save(fs);
	}
	
	@GetMapping("/{id}")
	public Optional<FichaServicio>buscarporID(@PathVariable Integer id){
		return fichaServicioService.findById(id);
	}
	
	@GetMapping("/listar")
	public Iterable<FichaServicio>listarTodos(){
		return fichaServicioService.findAll();
	}
	
	@DeleteMapping("{id}")
	public void eliminar(@PathVariable Integer id) {
		fichaServicioService.deleteById(id);
	}	
}
