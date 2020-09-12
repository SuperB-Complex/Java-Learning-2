package self.explore.generics.execises.question2;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class Main {
	// compile wrong 
	// cause operator > is undefined for the argument type(s) T, T
//	public static <T> T compute(T op1, T op2) {
//		return (T)op1 + (T)op2;
//	}
	
	public static void main(String[] args) {
		List<Integer> list = new LinkedList<> ();
		// 4 results are the same
		// the below three ways are simulating the Predicate 
		System.out.println(Algorithm.countIf(list, new OddPredict()));
		System.out.println(Algorithm.countIf(list, new OddRawPredict<Integer>()));
		System.out.println(Algorithm.countIf(list, new UnaryPredict<Integer>() {
			@Override
			public boolean test(Integer obj) {
				return (obj % 2 == 0) ? false : true;
			}
		}));
		// below one is using Predicate built-in class
		System.out.println(Algorithm.countIf(list, NumberPredicate.oddNumberPredicate));
	}
	
}
