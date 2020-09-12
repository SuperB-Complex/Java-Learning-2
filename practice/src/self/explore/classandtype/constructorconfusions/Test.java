package self.explore.classandtype.constructorconfusions;

/*
 * If you want to apply singleton pattern, and you choose to double check way to achieve
 * then you should have a private constructor with no parameters. And if you have features
 * needed to be initiated, then you should have a bunch of setters to do that in your 
 * getInstance method before returning the instance.
 * Also, the features should not be decorated by final, if you need a final field then this
 * field requires to be known as prior knowledge.
 * */
public class Test {
	public static void main(String[] args) {
		// program will not end
		// because in class PrivateConstructorWithParameters the constructor with parameters is calling static method
		// getInstanceFromStaticMethod, but in method getInstanceFromStaticMethod is calling the constructor
		// PrivateConstructorWithParameters privateConstructorWithParameters =  PrivateConstructorWithParameters.getInstanceFromStaticMethod(1, 1, 1);
		
		// successfully executed
		PrivateConstructorNoParameter privateConstructorNoParameter = PrivateConstructorNoParameter.getInstanceFromStaticMethod();
	}
}
