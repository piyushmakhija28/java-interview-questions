package questions;

import java.util.Map;
import java.util.stream.Collectors;

import models.Employee;

public class GroupBySalaryAndEmployeeAgeSumming extends CommonPart {

	public static void main(String[] args) {
		createEmployeeList();
		Map<Integer, Integer> groupingEmployeesBySalaryAndValueAsSummingOfEmployeeAge = EMPLOYEES.stream()
				.collect(Collectors.groupingBy(Employee::getSalary, Collectors.summingInt(Employee::getAge)));
		groupingEmployeesBySalaryAndValueAsSummingOfEmployeeAge.forEach((salary, sumOfAge) -> {
			System.out.println(salary + "::" + sumOfAge);
		});
	}

}
