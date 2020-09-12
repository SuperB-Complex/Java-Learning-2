package self.explore.funtionalinterface.suppliers;

import java.util.function.Supplier;

public class SuppliersExercise {
	public static void main(String[] args) {
		// original version
		Supplier<String> supplier1 = new Supplier<String>() {
			@Override
			public String get() {
				return new String("Hashhash");
			}
		};
		System.out.println(supplier1.get());
		
		// lambda version
		Supplier<String> supplier2 = () -> new String("Hashhash");
		System.out.println(supplier2.get());
		
	}
}
