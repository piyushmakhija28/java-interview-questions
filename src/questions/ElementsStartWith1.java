package questions;

import java.util.Arrays;
import java.util.List;

/**
 * 111, 134, 445, 119 find all elements start with 1
 */
public class ElementsStartWith1 {

	public static void main(String[] args) {
		List<Integer> intList = Arrays.asList(111, 134, 445, 119);
		List<Integer> filteredList = intList.stream().map(String::valueOf).filter(element -> element.startsWith("1"))
				.map(Integer::parseInt).toList();
		System.out.println(filteredList);
		int sum = filteredList.stream().mapToInt(Integer::valueOf).sum();
		System.out.println(sum);
	}

}
