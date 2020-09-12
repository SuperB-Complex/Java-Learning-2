package self.explore.generics.classextends.scenario2;

public class Main {
	// output is : Value is:199
	public static void main(String args[]) {
		Child<String, Integer> x = new Child<String, Integer>("Value is: ", 99, 100);
	    System.out.print(x.getob());
	    System.out.println(x.getob2() + x.getob3());
	}
}
