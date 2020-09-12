package self.explore.generics.classextends.scenario1;

public class Child<T, V> extends Father<T> {

	V ob2;
	
	Child(T o, V o2) {
		super(o);
		ob2 = o2;
	}
	V getob2() {
		return ob2;
	}

}
