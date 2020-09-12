package self.explore.methodhiding;

public class Main {
	// the sub-class Child has static method foo () having the same name and signature 
	// as a static method in super-class Father. When we call p.foo() and c.foo() 
	// it calls foo () method in Father class 
	public static void main(String args[]) {
		Father p = new Father();
		Father c = new Child();
        System.out.println("****************Method Hiding*******************");
        p.foo(); // This will call method in parent class
        c.foo(); // This will call method in parent class
        System.out.println("****************Method overriding*******************");
        p.bar(); // This will call method in parent class
        c.bar(); // This will call method in child class
	}
}
