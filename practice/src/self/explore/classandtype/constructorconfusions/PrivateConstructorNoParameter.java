package self.explore.classandtype.constructorconfusions;

public class PrivateConstructorNoParameter {
	private PrivateConstructorNoParameter() {}
	
	// cause you have a private constructor
	// it is unlikely to have an instance method to get the instance
//	public PrivateConstructorNoParameter getInstance() {
//		return new PrivateConstructorNoParameter();
//	}
	
	public static PrivateConstructorNoParameter getInstanceFromStaticMethod() {
		return new PrivateConstructorNoParameter();
	}
}
