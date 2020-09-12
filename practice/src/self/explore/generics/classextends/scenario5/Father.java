package self.explore.generics.classextends.scenario5;

public abstract class Father<T, V> {
	
	T ob;
	
	Father(T o) {
	    ob = o;
	}
	
	public abstract T getob(V o);
}
