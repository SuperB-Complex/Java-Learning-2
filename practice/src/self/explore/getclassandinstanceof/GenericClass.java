package self.explore.getclassandinstanceof;

import java.util.Date;

public class GenericClass<T> {
	
	public GenericClass() {}

	public boolean isDateInstance(T t) {
		return t instanceof Date;
	}
	
	public boolean isStringInstance(T t) {
		return t instanceof String;
	}
}
