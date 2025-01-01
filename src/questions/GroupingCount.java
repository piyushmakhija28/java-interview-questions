package questions;

import java.util.Map;
import java.util.stream.Collectors;

import models.Employee;

public class GroupingCount extends CommonPart {

	public static void main(String[] args) {
		createEmployeeList();
		Map<Integer, Long> groupBySalaryCount = EMPLOYEES.stream()
				.collect(Collectors.groupingBy(Employee::getSalary, Collectors.counting()));
		groupBySalaryCount.forEach((salary, count) -> System.out.println(salary + "::" + count));
	}

}
