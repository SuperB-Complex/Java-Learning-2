package self.explore.streams.intstream;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class IntStreamOperations {
	   public static void main(String[] args)
	   {
	      int[] values = {3, 10, 6, 1, 4, 8, 2, 5, 9, 7};

	      // display original values
	      System.out.print("Original values: ");
	      IntStream.of(values)
	               .forEach(value -> System.out.printf("%d ", value));
	      System.out.println();

	      // count, min, max, sum and average of the values
	      System.out.printf("%nCount: %d%n", IntStream.of(values).count());
	      System.out.printf("Min: %d%n", 
	         IntStream.of(values).min().getAsInt());
	      System.out.printf("Max: %d%n", 
	         IntStream.of(values).max().getAsInt());
	      System.out.printf("Sum: %d%n", IntStream.of(values).sum());
	      System.out.printf("Average: %.2f%n", 
	         IntStream.of(values).average().getAsDouble());

	      // sum of values with reduce method
	      System.out.printf("%nSum via reduce method: %d%n", 
	         IntStream.of(values)                      
	                  .reduce(0, (x, y) -> x + y));
	      
	      // sum of squares of values with reduce method
	      System.out.printf("Sum of squares via reduce method: %d%n", 
	         IntStream.of(values)                   
	                  .reduce(0, (x, y) -> x + y * y));
	      
	      // product of values with reduce method
	      System.out.printf("Product via reduce method: %d%n", 
	         IntStream.of(values)
	                  .reduce(1, (x, y) -> x * y));
	      
	      // even values displayed in sorted order
	      System.out.printf("%nEven values displayed in sorted order: "); 
	      IntStream.of(values)
	               .filter(value -> value % 2 == 0)
	               .sorted()
	               .forEach(value -> System.out.printf("%d ", value));
	      System.out.println();
	   
	      // odd values multiplied by 10 and displayed in sorted order
	      System.out.printf(
	         "Odd values multiplied by 10 displayed in sorted order: "); 
	      IntStream.of(values)
	               .filter(value -> value % 2 != 0)
	               .map(value -> value * 10)
	               .sorted()
	               .forEach(value -> System.out.printf("%d ", value));
	      System.out.println();

	      // sum range of integers from 1 to 10, exlusive
	      System.out.printf("%nSum of integers from 1 to 9: %d%n",
	         IntStream.range(1, 10).sum());

	      // sum range of integers from 1 to 10, inclusive
	      System.out.printf("Sum of integers from 1 to 10: %d%n",
	         IntStream.rangeClosed(1, 10).sum());
	      
	      String[] strings = 
	          {"Red", "orange", "Yellow", "green", "Blue", "indigo", "Violet"};

	       // display original strings
	       System.out.printf("Original strings: %s%n", Arrays.asList(strings));

	       // strings in uppercase
	       System.out.printf("strings in uppercase: %s%n",
	          Arrays.stream(strings)
	                .map(String::toUpperCase)
	                .collect(Collectors.toList()));

	       // strings greater than "m" (case insensitive) sorted ascending
	       System.out.printf("strings greater than m sorted ascending: %s%n",
	          Arrays.stream(strings)
	                .filter(s -> s.compareToIgnoreCase("m") > 0)
	                .sorted(String.CASE_INSENSITIVE_ORDER)
	                .collect(Collectors.toList()));

	       // strings greater than "m" (case insensitive) sorted descending
	       System.out.printf("strings greater than m sorted descending: %s%n",
	          Arrays.stream(strings)
	                .filter(s -> s.compareToIgnoreCase("m") > 0)
	                .sorted(String.CASE_INSENSITIVE_ORDER.reversed())
	                .collect(Collectors.toList()));
	   } 
}
