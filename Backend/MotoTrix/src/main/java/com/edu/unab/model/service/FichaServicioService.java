package com.edu.unab.model.service;

import java.util.Optional;

import com.edu.unab.model.entity.FichaServicio;

public interface FichaServicioService {

	public Iterable<FichaServicio>findAll();
	public Optional<FichaServicio>findById(Integer id);
	public FichaServicio save(FichaServicio fs);
	public void deleteById(Integer id);
}
