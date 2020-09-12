package self.explore.generics.execises.question2;

import java.util.Collection;
import java.util.function.Predicate;

public class Algorithm {
	
	public static <T> int countIf(Collection<T> c, UnaryPredict<T> p) {
        int count = 0;
        for (T elem : c)
            if (p.test(elem))
                ++count;
        return count;
    }
	
	public static <T> int countIf(Collection<T> c, Predicate<T> p) {
        int count = 0;
        for (T elem : c)
            if (p.test(elem))
                ++count;
        return count;
    }
}
