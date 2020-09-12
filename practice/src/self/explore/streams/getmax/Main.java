package self.explore.streams.getmax;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) {
		List<Integer> number = Arrays.asList(1, 2, 3, 9, 23, 64, 2);
		
		// use IntStream
		OptionalInt max1 = number.stream().mapToInt(Integer::intValue).max();
		Integer m1 = max1.getAsInt();
		
		// specify the natural order comparator
		Optional<Integer> max2 = number.stream().max(Comparator.naturalOrder());
		Integer m2 = max2.get();
		
		// use reduce
		Optional<Integer> max3_0 = number.stream().reduce(Integer::max);
		Integer m3_0 = max3_0.get();
		Optional<Integer> max3_1 = number.stream().reduce(BinaryOperator.maxBy(Comparator.naturalOrder()));
		Integer m3_1 = max3_1.get();
		Optional<Integer> max3_2 = number.stream().reduce(BinaryOperator.maxBy((x, y) -> (x > y) ? 1 : ((x == y) ? 0 : -1)));
		Integer m3_2 = max3_2.get();
		Optional<Integer> max3_4 = number.stream().reduce(BinaryOperator.maxBy(Integer::compare));
		Integer m3_4 = max3_4.get();
		// doesn't return right
		Optional<Integer> max3_3 = number.stream().reduce(BinaryOperator.maxBy(Integer::max));
		Integer m3_3 = max3_3.get();
		
		// use collector
		Optional<Integer> max4 = number.stream().collect(Collectors.maxBy(Comparator.naturalOrder()));
		Integer m4 = max4.get();
		
		// use IntSummaryStatistics
		int max5 = number.stream().collect(Collectors.summarizingInt(Integer::intValue)).getMax();

		System.out.println(m1);
		System.out.println(m2);
		System.out.println(m3_0);
		System.out.println(m3_1);
		System.out.println(m3_2);
		System.out.println(m3_3);
		System.out.println(m3_4);
		System.out.println(m4);
		System.out.println(max5);
		
	}
}
