package self.explore.generics.execises.question2;

import java.util.function.Predicate;

public class NumberPredicate {
	// compile wrong
//	public static OddPredict<Integer> oddNumberPredicate = x -> {
//		x = x % 2;
//		return x == 0 ? false : true;
//	};
	
	
	public static Predicate<Integer> oddNumberPredicate = x -> x % 2 == 0 ? false : true;
}
