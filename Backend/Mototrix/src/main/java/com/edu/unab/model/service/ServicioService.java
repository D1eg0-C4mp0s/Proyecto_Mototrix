package com.edu.unab.model.service;

import java.util.Optional;

import com.edu.unab.model.entity.Servicio;

public interface ServicioService {

	public Iterable<Servicio>findAll();
	public Optional<Servicio>findById(Integer id);
	public Servicio save(Servicio s);
	public void deleteById(Integer id);
}
