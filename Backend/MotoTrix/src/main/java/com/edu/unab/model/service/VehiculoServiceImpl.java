package com.edu.unab.model.service;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.edu.unab.model.entity.Vehiculo;
import com.edu.unab.repository.VehiculoRepository;

@Service
public class VehiculoServiceImpl implements VehiculoService{
	
	@Autowired
	private VehiculoRepository vehiculoRepository;

	@Override
	@Transactional(readOnly = true)
	public Iterable<Vehiculo> findAll() {
		// TODO Auto-generated method stub
		return vehiculoRepository.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Optional<Vehiculo> findById(Integer id) {
		// TODO Auto-generated method stub
		return vehiculoRepository.findById(id);
	}

	@Override
	@Transactional
	public Vehiculo save(Vehiculo v) {
		// TODO Auto-generated method stub
		return vehiculoRepository.save(v);
	}

	@Override
	@Transactional
	public void deleteById(Integer id) {
		// TODO Auto-generated method stub
		vehiculoRepository.deleteById(id);
	}

}
