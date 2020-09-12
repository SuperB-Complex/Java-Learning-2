package self.explore.funtionalinterface.consumes;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumesExecise {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
		// original version
		Consumer<Integer> consumer1 = new Consumer<Integer> () {
			@Override
			public void accept(Integer t) {
				System.out.println(t);
				
			}};
		numbers.forEach(consumer1);
		// lambda version
		Consumer consumer2 = (x) -> System.out.print(x + " ");
		numbers.forEach(consumer2);
		// productive version
		numbers.forEach((x) -> System.out.println(x));
		// another productive version
		ConsumesExecise consumer3 = new ConsumesExecise();
		numbers.forEach((x) -> consumer3.printValue(x));
		
		// andThen exercise
		Consumer<Integer> consumer4 = consumer2.andThen((x) -> System.out.println("__" + x));
		numbers.forEach(consumer4);
	}
	
	public void printValue(Integer i) {
		System.out.println(i);
	}
}
