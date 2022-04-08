package com.AzureDemo;

import javax.persistence.Entity;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class Employee {

	@Id
	int EmployeeId;
	String EmployeeName;
	String Deoartment;
	String Salary;
	
	
}
