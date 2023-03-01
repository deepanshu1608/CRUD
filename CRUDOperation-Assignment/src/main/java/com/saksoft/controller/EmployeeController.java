package com.saksoft.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.saksoft.model.Employee;
import com.saksoft.service.EmployeeService;

import lombok.Delegate;

@RestController
@RequestMapping("/api")
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping("/emp/{id}")
	public ResponseEntity<Employee> getEmployee(@PathVariable Integer id)
	{
		Employee employee = this.employeeService.getEmployee(id);
		
		return new ResponseEntity<>(employee,HttpStatus.OK);
	}
	
	@PostMapping("/post/emp")
	public ResponseEntity<Employee> createEmployee(@RequestBody Employee emp)
	{
		Employee employee = this.employeeService.createEmployee(emp);
		System.err.println(emp);
		
		if(employee != null)
		{
			System.out.println(3);
			return new ResponseEntity<>(employee,HttpStatus.CREATED);
		}
		
		return new ResponseEntity<>(employee,HttpStatus.BAD_REQUEST);
	}
	
	@GetMapping("/all/emp")
	public ResponseEntity<List<Employee>> getEmployee()
	{
		 List<Employee> employeeList = this.employeeService.getAllEmployee();
		
		return new ResponseEntity<>(employeeList,HttpStatus.OK);
	}
	
	@DeleteMapping ("/emp/{id}")
	public ResponseEntity<Employee> deleteEmployee(@PathVariable Integer id)
	{
		Employee employee = this.employeeService.getEmployee(id);
		 this.employeeService.deleteEmployee(id);
		
		return new ResponseEntity<>(employee,HttpStatus.OK);
	}
	
	@PutMapping("/update/emp")
	public ResponseEntity<Employee> updateEmployee(@RequestBody Employee emp)
	{
		Employee employee = this.employeeService.updateEmployee(emp);
		
		if(employee != null)
		{
			return new ResponseEntity<>(employee,HttpStatus.CREATED);
		}
		
		return new ResponseEntity<>(employee,HttpStatus.BAD_REQUEST);
	}
}
