package java8intro.java8.functional;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ComparatorExample {
	private void sortInts() {
		Integer[] ints = { 5, 6, 7, 3, 32, 4, 154, 456, 13, 9 };
		Arrays.sort(ints, (o1, o2) -> Integer.compare(o1, o2));
		for (Integer i : ints) {
			System.out.println(i);
		}
	}

	private void sortStrings() {
		List<String> strings = Arrays.asList("b", "d", "x", "cs", "a", "yz");
		Collections.sort(strings, String::compareTo);
		for (String s : strings) {
			System.out.println(s);
		}
	}

	public static void main(String[] args) {
		ComparatorExample example = new ComparatorExample();
		example.sortInts();
		System.out.println("===================");
		example.sortStrings();
	}
}
