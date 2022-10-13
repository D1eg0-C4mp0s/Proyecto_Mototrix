package com.edu.unab.model.service;

import java.util.Optional;

import com.edu.unab.model.entity.Insumo;

public interface InsumoService {

	public Iterable<Insumo>findAll();
	public Optional<Insumo>findById(Integer id);
	public Insumo save(Insumo i);
	public void deleteById(Integer id);
}
