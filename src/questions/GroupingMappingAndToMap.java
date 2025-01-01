package questions;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import models.Employee;

public class GroupingMappingAndToMap extends CommonPart {

	public static void main(String[] args) {
		createEmployeeList();
		Map<Integer, Map<Long, String>> employeeMapGroupBySalary = EMPLOYEES.stream()
				.collect(Collectors.groupingBy(Employee::getSalary,
						Collectors.mapping(Function.identity(), Collectors.toMap(Employee::getId, Employee::getName))));
		employeeMapGroupBySalary.forEach((salary, empMap) -> {
			System.out.println(salary + ":::");
			empMap.forEach((id, name) -> {
				System.out.println(+id + "::" + name);
			});
		});
	}

}
