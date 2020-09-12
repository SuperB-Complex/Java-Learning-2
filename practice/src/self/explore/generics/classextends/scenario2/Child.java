package self.explore.generics.classextends.scenario2;

public class Child<T, V> extends Father<T> {
	V ob;
	V ob2;
	
	Child(T o, V o2, V o3) {
		super(o);
		ob2 = o2;
		ob = o3;
	}
	
	V getob2() {
		return ob2;
	}
	
	// you can't write V getob()
	// cause it doesn't compile
	// The return type is incompatible with Father<T>.getob()
	V getob3() {
		return ob;
	}

}
