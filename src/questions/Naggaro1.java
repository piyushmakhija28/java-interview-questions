package questions;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Naggaro1 {

	public static void main(String[] args) {

		try {
			
			List<Integer> al = Arrays.asList(1, 3, 2, 4, 3, 1, 2);

			al = al.stream().distinct().sorted(Comparator.reverseOrder()).toList();

			System.out.println(al);

			System.out.println("a");
			
			badMethod();
			
			System.out.println("b");
			
		}catch(Exception e) {
			System.exit(0);
			System.out.println("c");
		}finally {
			System.out.println("d");
		}
		
	}

	private static void badMethod() {
		throw new RuntimeException();
	}

}
