package com.edu.unab.model.service;

import java.util.Optional;

import com.edu.unab.model.entity.Vehiculo;

public interface VehiculoService {

	public Iterable<Vehiculo>findAll();
	public Optional<Vehiculo>findById(Integer id);
	public Vehiculo save(Vehiculo v);
	public void deleteById(Integer id);
}
