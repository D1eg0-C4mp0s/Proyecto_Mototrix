package com.edu.unab.model.service;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.edu.unab.model.entity.Insumo;
import com.edu.unab.repository.InsumoRepository;

@Service
public class InsumoServiceImpl implements InsumoService{

	@Autowired
	private InsumoRepository insumoRepository;
	
	@Override
	@Transactional(readOnly = true)
	public Iterable<Insumo> findAll() {
		// TODO Auto-generated method stub
		return insumoRepository.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Optional<Insumo> findById(Integer id) {
		// TODO Auto-generated method stub
		return insumoRepository.findById(id);
	}

	@Override
	@Transactional
	public Insumo save(Insumo i) {
		// TODO Auto-generated method stub
		return insumoRepository.save(i);
	}

	@Override
	@Transactional
	public void deleteById(Integer id) {
		// TODO Auto-generated method stub
		insumoRepository.deleteById(id);
	}

}
