package self.explore.accessier.nonstaticmethodscalledfromstaticmethod;

public class Test {
	public static void main(String args[]){
	     Student s1 = new Student();
	     s1.showData();
	     Student s2 = new Student();
	     s2.showData();
	     Student.b++;
	     s1.showData();
	  }
}
