package com.edu.unab.model.service;

import java.util.Optional;

import com.edu.unab.model.entity.Empleado;

public interface EmpleadoService {

	public Iterable<Empleado>findAll();
	public Optional<Empleado>findById(Integer id);
	public Empleado save(Empleado e);
	public void deleteById(Integer id);
}
