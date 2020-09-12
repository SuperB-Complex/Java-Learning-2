package self.explore.generics.classextends.scenario4;

public class Father<T> {
	
	T ob;
	
	Father(T o) {
	    ob = o;
	}
	
	// hiding
	T getob() {
	    return ob;
	}
}
