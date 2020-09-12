package self.explore.classandtype.constructorconfusions;

public class PrivateConstructorWithParameters {
	private int variable;
	private final int finalVariable = 0;
	private static int staticVariable;
	
//	private PrivateConstructorWithParameters(int variable, int finalVariable, int staticVariables) {
//		this.variable = variable;
//		this.finalVariable = finalVariable;
//		staticVariable = staticVariables;
//	}
	
	private PrivateConstructorWithParameters(int variable, int finalVariable, int staticVariables) {
		//this.getInstance(variable, finalVariable, staticVariables);
		getInstanceFromStaticMethod(variable, finalVariable, staticVariables);
	}
	
	// cause you have a private constructor
	// it is unlikely to have an instance method to get the instance
//	public PrivateConstructorWithParameters getInstance(int variable, int finalVariable, int staticVariables) {
//		return new PrivateConstructorWithParameters(variable, finalVariable, staticVariables);
//	}
	
	public static PrivateConstructorWithParameters getInstanceFromStaticMethod(int variable, int finalVariable, int staticVariables) {
		return new PrivateConstructorWithParameters(variable, finalVariable, staticVariables);
	}
}
