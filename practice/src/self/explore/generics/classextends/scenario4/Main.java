package self.explore.generics.classextends.scenario4;

public class Main {
	// output is : 99199
	public static void main(String args[]) {
		Child<String, Integer> x = new Child<String, Integer>("Value is: ", 99, 100);
	    System.out.print(x.getob());
	    System.out.println(x.getob2() + x.getob());
	}
}
