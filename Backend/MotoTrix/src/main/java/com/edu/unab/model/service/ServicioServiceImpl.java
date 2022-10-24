package com.edu.unab.model.service;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.edu.unab.model.entity.Servicio;
import com.edu.unab.repository.ServicioRepository;

@Service
public class ServicioServiceImpl implements ServicioService{

	@Autowired
	private ServicioRepository servicioRepository;
	
	@Override
	@Transactional(readOnly = true)
	public Iterable<Servicio> findAll() {
		// TODO Auto-generated method stub
		return servicioRepository.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Optional<Servicio> findById(Integer id) {
		// TODO Auto-generated method stub
		return servicioRepository.findById(id);
	}

	@Override
	@Transactional
	public Servicio save(Servicio s) {
		// TODO Auto-generated method stub
		return servicioRepository.save(s);
	}

	@Override
	@Transactional
	public void deleteById(Integer id) {
		// TODO Auto-generated method stub
		servicioRepository.deleteById(id);
	}

}
