package self.explore.generics.classextends.scenario1;

public class Father<T> {
	
	T ob;
	
	Father(T o) {
	    ob = o;
	}
	
	T getob() {
	    return ob;
	}
}
