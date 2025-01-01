package questions;

import java.util.Map;
import java.util.stream.Collectors;

import models.Employee;

public class GroupBySalaryAndEmployeeAgeAverage extends CommonPart {

	public static void main(String[] args) {
		createEmployeeList();
		Map<Integer, Double> groupingEmployeesBySalaryAndValueAsSummingOfEmployeeAge = EMPLOYEES.stream()
				.collect(Collectors.groupingBy(Employee::getSalary, Collectors.averagingInt(Employee::getAge)));
		groupingEmployeesBySalaryAndValueAsSummingOfEmployeeAge.forEach((salary, averageOfAge) -> {
			System.out.println(salary + "::" + averageOfAge);
		});
	}

}
