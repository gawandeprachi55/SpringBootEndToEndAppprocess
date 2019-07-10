package com.app.service;

import java.util.List;

import com.app.model.Emplyee;

public interface EmployeeService {
public Integer saveEmployee(Emplyee e);
public List<Emplyee> getAllEmployee();
public void deleteEmployee(Integer id);
public Emplyee getEmployeeById(Integer id);
}
