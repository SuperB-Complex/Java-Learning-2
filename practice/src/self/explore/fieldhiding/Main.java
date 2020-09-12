package self.explore.fieldhiding;

public class Main {
	
	// A field declaration, static or non-static, 
	// in a class hides the inherited field with 
	// the same name in its superclass.
	public static void main(String args[]) {
		Child child = new Child();
		child.print();
	}
}
