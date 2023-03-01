package com.saksoft;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.ApplicationContext;

import com.saksoft.model.Employee;
import com.saksoft.repo.EmployeeRepo;

@SpringBootApplication
public class CrudOperationAssignmentApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudOperationAssignmentApplication.class, args);
		
//		EmployeeRepo EmployeeRepo = context.getBean(EmployeeRepo.class);
//		
////		Employee emp = new Employee();
////		emp.setFirstName("Raj");
////		emp.setLastName("Verma");
////		emp.setEmail("raj.verma@imagine.com");
////		emp.setId(35);
////		
////		Employee emp = EmployeeRepo.save(emp);
////		
////		System.out.println(emp); 
//		
//		Employee emp1 = new Employee();
//		emp1.s
	}

}
