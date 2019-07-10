package com.app.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.model.Emplyee;
import com.app.repo.EmployeeRepository;
import com.app.service.EmployeeService;
@Service
public class EmployeeServiceImpl implements EmployeeService {
@Autowired
private EmployeeRepository repo;

	@Transactional
	public Integer saveEmployee(Emplyee e) {
		e=repo.save(e);
		return e.getId();
	}

	@Transactional(readOnly=true)
	public List<Emplyee> getAllEmployee() {
		
		return repo.findAll();
	}

	@Transactional
	public void deleteEmployee(Integer id) {
		repo.deleteById(id);

	}

	@Transactional(readOnly=true)
	public Emplyee getEmployeeById(Integer id) {
		Optional<Emplyee> p=repo.findById(id);
		return p.get();
	}

}
