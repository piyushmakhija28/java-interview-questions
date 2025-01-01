package questions;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import models.Employee;

public class GroupingMapping extends CommonPart {

	public static void main(String[] args) {
		createEmployeeList();
		Map<Integer, List<String>> groupBySalaryEmployeeNames = EMPLOYEES.stream().collect(
				Collectors.groupingBy(Employee::getSalary, Collectors.mapping(Employee::getName, Collectors.toList())));
		groupBySalaryEmployeeNames
				.forEach((salary, employeeNames) -> System.out.println(salary + "::" + employeeNames));
	}

}
