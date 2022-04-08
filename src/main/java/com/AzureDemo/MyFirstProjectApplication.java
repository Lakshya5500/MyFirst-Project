package com.AzureDemo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
@RestController
public class MyFirstProjectApplication {
	
	@Autowired(required = false)
	private EmployeeRepo employeeRepo;

	@GetMapping("/massage")
	public String massage() {
		
		return "Congretts ! Your Application is Deployed Successfully !! Welcome to Our car Rent service";
	}
	public static void main(String[] args) {
		SpringApplication.run(MyFirstProjectApplication.class, args);
	}

	@GetMapping("/employees")
	public List<Employee> getAllEmployees() {
		return employeeRepo.findAll();
	}

	
	@PostMapping("/employee")
	public Employee addCars(@RequestBody Employee emp) {
		employeeRepo.save(emp);
		return emp;
	}
}
