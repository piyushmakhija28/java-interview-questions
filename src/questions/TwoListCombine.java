package questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/**
 * List 1 :- sam, john, jil List 2 :- josh, jane,sam Output :- sam, john, jil,
 * josh, jane
 */
public class TwoListCombine {

	public static void main(String[] args) {
		List<String> namesList1 = new ArrayList<>();
		namesList1.add("sam");
		namesList1.add("john");
		namesList1.add("jil");
		List<String> nameList2 = Arrays.asList("josh", "jane", "sam");
		namesList1.addAll(nameList2);
		Set<String> namesSet = new LinkedHashSet<>(namesList1);
		System.out.println(namesSet);
	}

}
