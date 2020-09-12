package self.explore.accessier.instanceblockandmain;

public class Test {
	/*
	 * instance block gets executed before constructor
	 * */
	{
		System.out.println("in isntance block");
	}
	public Test() {
		System.out.println("in constructor");
	}
	
	public static void main(String[] args) {
		System.out.println("in main");
		Test t = new Test();
	}
	
}
