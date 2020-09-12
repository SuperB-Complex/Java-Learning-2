package self.explore.generics.classextends.scenario3;

public class Child<T1, T2> extends Father {

	T2 ob2;
	
	Child(T1 o, T2 o2) {
		// a warning
		// The constructor Father(Object) belongs to the raw type Father. 
		// References to generic type Father<T> should be parameterized.
		super(o);
		ob2 = o2;
	}
	
	T2 getob2() {
		return ob2;
	}

}
