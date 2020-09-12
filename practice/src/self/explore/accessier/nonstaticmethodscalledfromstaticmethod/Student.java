package self.explore.accessier.nonstaticmethodscalledfromstaticmethod;

public class Student {
	int a; //initialized to zero
	static int b; //initialized to zero only when class is loaded not for each object created.
	
	Student(){
		//Constructor incrementing static variable b
		b++;
	}
	
	public void showData(){
		// non-static method can call static method
		increment();
		System.out.println("Value of a = " + a);
		// non-static method can call static variable
		System.out.println("Value of b = " + b);
	}
	
	// static method can't call static variable
	public static void increment(){
		++b;
	}
}
