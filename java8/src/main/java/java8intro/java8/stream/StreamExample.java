package java8intro.java8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample {
	private final List<Integer> integers = Arrays.asList(5, 7, 34, 12, 4, 5, 76, 2, 1, 67, 52, 74);

	private void filterAndSort() {
		integers.stream()
				.filter(i -> i % 2 == 0)
				.sorted()
				.forEach(System.out::println);
	}

	private void multiplyByTwo() {
		integers.stream()
				.map(i -> i * 2)
				.forEach(System.out::println);
	}

	private void parallelStream() {
		List<Integer> sortedIntegers = integers.stream().sorted().collect(Collectors.toList());
		System.out.println(sortedIntegers);
		sortedIntegers.parallelStream().forEach(System.out::println);
	}

	public static void main(String[] args) {
		StreamExample streamExample = new StreamExample();
		streamExample.filterAndSort();
		System.out.println("===================");
		streamExample.multiplyByTwo();
		System.out.println("===================");
		streamExample.parallelStream();
	}
}
