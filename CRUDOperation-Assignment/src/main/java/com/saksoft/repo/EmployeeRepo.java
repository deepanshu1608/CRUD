package com.saksoft.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.saksoft.model.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Integer> {

}
