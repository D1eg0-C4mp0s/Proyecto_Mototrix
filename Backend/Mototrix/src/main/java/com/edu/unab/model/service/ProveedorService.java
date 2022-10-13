package com.edu.unab.model.service;

import java.util.Optional;

import com.edu.unab.model.entity.Proveedor;

public interface ProveedorService {

	public Iterable<Proveedor>findAll();
	public Optional<Proveedor>findById(Integer id);
	public Proveedor save(Proveedor p);
	public void deleteById(Integer id);
}
