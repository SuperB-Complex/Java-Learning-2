package self.explore.generics.classextends.scenario3;

public class Main {
	// output is : Value is:99
	public static void main(String args[]) {
		Child<String, Integer> x = new Child<String, Integer>("Value is: ", 99);
	    System.out.print(x.getob());
	    System.out.println(x.getob2());
	}
}
