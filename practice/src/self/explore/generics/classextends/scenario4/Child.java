package self.explore.generics.classextends.scenario4;

public class Child<T1, T2> extends Father {

	T2 ob;
	T2 ob2;
	
	Child(T1 o, T2 o1, T2 o2) {
		// a warning
		// The constructor Father(Object) belongs to the raw type Father. 
		// References to generic type Father<T> should be parameterized.
		super(o);
		ob = o1;
		ob2 = o2;
	}
	
	T2 getob2() {
		return ob2;
	}
	
	T2 getob() {
		return ob;
	}

}
