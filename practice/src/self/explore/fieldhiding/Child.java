package self.explore.fieldhiding;

public class Child extends Father {

	// Hides num field in Father class
	  private int num = 200;

	  // Hides name field in Father class
	  private String name = "Jack";

	  public void print() {
	    System.out.println("num: " + num);
	    System.out.println("name: " + name);
	  }

}
