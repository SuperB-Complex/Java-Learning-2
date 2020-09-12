package self.explore.methodhiding;

public class Child extends Father {

	// Hiding
    public static void foo() {
        System.out.println("Inside foo method in child class");
    }
 
    // Overriding
    public void bar() {
        System.out.println("Inside bar method in child class");
    }

}
