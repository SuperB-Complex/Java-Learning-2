package self.explore.funtionalinterface.predicates;

import java.util.function.Predicate;

public class IntegerPredicate {
	public static Predicate<Integer> negativeNumderPredicate = x -> x < 0;
	public static Predicate<Integer> positiveNumderPredicate = x -> x > 0;
	// needs a input parameter
	public static Predicate<Integer> getSpecificNumber(Integer data) {
		return x -> x == data;
	};
}
