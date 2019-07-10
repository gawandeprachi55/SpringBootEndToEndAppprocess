package com.app.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.model.Emplyee;

public interface EmployeeRepository extends JpaRepository<Emplyee, Integer> {

}
