package self.explore.generics.classextends.scenario5;

public class Main {
	// output is : 10099.0
	public static void main(String args[]) {
		Child x = new Child("Value is: ", 99.0);
	    System.out.print(x.getob(100));
	    System.out.println(x.getob2());
	}
}
