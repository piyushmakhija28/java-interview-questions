package questions;

import java.util.ArrayList;
import java.util.List;

import models.Employee;

public class CommonPart {

	static final List<Employee> EMPLOYEES = new ArrayList<>();
	
	static void createEmployeeList() {
		Employee piyush = new Employee(1, "Piyush Makhija", 32, 2000000);
		Employee ankit = new Employee(2, "Ankit Arora", 42, 5000000);
		Employee kashish = new Employee(3, "Kashish Mehta", 22, 2000000);
		Employee ritaj = new Employee(4, "Kumar Ritaj", 24, 1000000);
		EMPLOYEES.add(piyush);
		EMPLOYEES.add(ankit);
		EMPLOYEES.add(kashish);
		EMPLOYEES.add(ritaj);
	}
	
}
