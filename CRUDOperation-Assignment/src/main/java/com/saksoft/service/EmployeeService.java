package com.saksoft.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.saksoft.model.Employee;
import com.saksoft.repo.EmployeeRepo;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepo employeeRepo;
	
	public Employee getEmployee(Integer id) {
		Employee employee = this.employeeRepo.findById(id).get();
		return employee;
	}

	public Employee createEmployee(Employee emp) {
		System.out.println(emp);
		
			System.out.println(1);
			Employee save = employeeRepo.save(emp);
			System.out.println(2);
			return save;
		
		
	}

	public List<Employee> getAllEmployee() {
		List<Employee> findAll = employeeRepo.findAll();
		return findAll;
	}

	public void deleteEmployee(Integer id) {
		employeeRepo.deleteById(id);
		
	}

	public Employee updateEmployee(Employee emp) {
		int id = emp.getId();
		Employee realEmpl = employeeRepo.findById(id).get();
		realEmpl.setAge(emp.getAge());
		realEmpl.setEmail(emp.getEmail());
		realEmpl.setFirstName(emp.getFirstName());	
		realEmpl.setLastName(emp.getLastName());

		Employee save = employeeRepo.save(realEmpl);

		return save;
	}
	
}
