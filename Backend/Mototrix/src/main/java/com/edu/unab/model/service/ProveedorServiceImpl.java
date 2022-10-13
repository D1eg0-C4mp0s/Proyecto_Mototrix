package com.edu.unab.model.service;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.edu.unab.model.entity.Proveedor;
import com.edu.unab.repository.ProveedorRepository;

@Service
public class ProveedorServiceImpl implements ProveedorService{

	@Autowired
	private ProveedorRepository proveedorRepository;
	
	@Override
	@Transactional(readOnly = true)
	public Iterable<Proveedor> findAll() {
		// TODO Auto-generated method stub
		return proveedorRepository.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Optional<Proveedor> findById(Integer id) {
		// TODO Auto-generated method stub
		return proveedorRepository.findById(id);
	}

	@Override
	@Transactional
	public Proveedor save(Proveedor p) {
		// TODO Auto-generated method stub
		return proveedorRepository.save(p);
	}

	@Override
	@Transactional
	public void deleteById(Integer id) {
		// TODO Auto-generated method stub
		proveedorRepository.deleteById(id);
	}

}
