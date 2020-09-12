package self.explore.generics.execises.question2;

public class OddRawPredict<T> implements UnaryPredict<T> {
	@Override
	public boolean test(T obj) {
		if (obj instanceof Integer) {
			return ((Integer)obj % 2 == 0 ? false : true);
		} 
		throw new IllegalArgumentException();
	}

}
