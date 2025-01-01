package questions;

import java.util.Map;
import java.util.stream.Collectors;

import models.Employee;

public class GroupingMappingAndJoining extends CommonPart {

	public static void main(String[] args) {
		createEmployeeList();
		Map<Integer, String> groupBySalaryEmployeeNamesJoining = EMPLOYEES.stream().collect(Collectors
				.groupingBy(Employee::getSalary, Collectors.mapping(Employee::getName, Collectors.joining(","))));
		groupBySalaryEmployeeNamesJoining
				.forEach((salary, employeeNames) -> System.out.println(salary + "::" + employeeNames));
	}

}
