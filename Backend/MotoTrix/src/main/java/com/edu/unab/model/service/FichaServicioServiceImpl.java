package com.edu.unab.model.service;

import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.edu.unab.model.entity.FichaServicio;
import com.edu.unab.repository.FichaServicioRepository;

@Service
public class FichaServicioServiceImpl implements FichaServicioService {

	@Autowired
	private FichaServicioRepository fichaServicioRepository;
	
	
	@Override
	@Transactional(readOnly = true)
	public Iterable<FichaServicio> findAll() {
		// TODO Auto-generated method stub
		return fichaServicioRepository.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Optional<FichaServicio> findById(Integer id) {
		// TODO Auto-generated method stub
		return fichaServicioRepository.findById(id);
	}

	@Override
	@Transactional
	public FichaServicio save(FichaServicio fs) {
		// TODO Auto-generated method stub
		return fichaServicioRepository.save(fs);
	}

	@Override
	@Transactional
	public void deleteById(Integer id) {
		// TODO Auto-generated method stub
		fichaServicioRepository.deleteById(id);
	}

	
}
