package self.explore.accessier.staticmethodscalledfromnonstaticmethod;

public class Student {
	int a; //initialized to zero
	static int b; //initialized to zero only when class is loaded not for each object created.
	
	Student(){
		//Constructor incrementing static variable b
		b++;
	}
	
	// static method can't call non-static method
//	public static void increment(){
//		this.showData();
//	}
	
	// static method can't call non-static variable
//	public static void increment(){
//		a++;
//	}
}
