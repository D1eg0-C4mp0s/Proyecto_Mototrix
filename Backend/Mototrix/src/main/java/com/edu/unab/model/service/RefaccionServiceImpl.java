package com.edu.unab.model.service;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.edu.unab.model.entity.Refaccion;
import com.edu.unab.repository.RefaccionRepository;

@Service
public class RefaccionServiceImpl implements RefaccionService{

	@Autowired
	private RefaccionRepository refaccionRepository;
	
	@Override
	@Transactional(readOnly = true)
	public Iterable<Refaccion> findAll() {
		// TODO Auto-generated method stub
		return refaccionRepository.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Optional<Refaccion> findById(Integer id) {
		// TODO Auto-generated method stub
		return refaccionRepository.findById(id);
	}

	@Override
	@Transactional
	public Refaccion save(Refaccion r) {
		// TODO Auto-generated method stub
		return refaccionRepository.save(r);
	}

	@Override
	@Transactional
	public void deleteById(Integer id) {
		// TODO Auto-generated method stub
		refaccionRepository.deleteById(id);
	}

}
