package self.explore.generics.classextends.scenario2;

public class Father<T> {
	
	T ob;
	
	Father(T o) {
	    ob = o;
	}
	
	T getob() {
	    return ob;
	}
}
