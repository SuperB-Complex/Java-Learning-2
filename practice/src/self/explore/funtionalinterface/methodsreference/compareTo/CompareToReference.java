package self.explore.funtionalinterface.methodsreference.compareTo;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.BiFunction;

public class CompareToReference {
	public static void main(String[] args) {
		// original version
		List<Integer> number1 = Arrays.asList(1, 2, 3, 9, 23, 64, 2);
		number1.sort(new Comparator<Integer> () {
			@Override
			public int compare(Integer i1, Integer i2) {
				return i1 - i2;
			}
		});
		number1.forEach(System.out::println);
		
		// lambda version
		List<Integer> number2 = Arrays.asList(1, 2, 3, 9, 23, 64, 2);
		number2.sort((Integer i1, Integer i2) -> i1.compareTo(i2));
		number2.forEach(System.out::println);
		
		// concise version
		List<Integer> number3 = Arrays.asList(1, 2, 3, 9, 23, 64, 2);
		// Arbitrary object of a specific type
		number3.sort(Integer::compareTo);
		number3.forEach(System.out::println);
		
		// another example
		// original version
		BiFunction<Integer, Integer, Integer> summation1 = 
				new BiFunction<Integer, Integer, Integer> () {
					@Override
					public Integer apply(Integer i1, Integer i2) {
						return i1.sum(i1, i2);
					}
		};
		System.out.println(summation1.apply(1, 2));
		
		// lambda version
		BiFunction<Integer, Integer, Integer> summation2 = Integer::sum;
		System.out.println(summation2.apply(1, 2));
	}
}
