package questions;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * 111, 134, 119, 125, 199 its second largest number to find.
 */
public class ElementSecondLargestArray {

	public static void main(String[] args) {
		List<Integer> intList = Arrays.asList(111, 134, 119, 125, 199);
		List<Integer> reverseOrderList = intList.stream().sorted(Comparator.reverseOrder()).toList();
		System.out.println(reverseOrderList);
		System.out.println("Second largest number is " + reverseOrderList.get(1));
	}

}
