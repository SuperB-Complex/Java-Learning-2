package self.explore.generics.classextends.scenario3;

public class Father<T> {
	
	T ob;
	
	Father(T o) {
	    ob = o;
	}
	
	T getob() {
	    return ob;
	}
}
