package com.edu.unab.model.service;

import java.util.Optional;

import com.edu.unab.model.entity.Refaccion;

public interface RefaccionService {

	public Iterable<Refaccion>findAll();
	public Optional<Refaccion>findById(Integer id);
	public Refaccion save(Refaccion r);
	public void deleteById(Integer id);
}
