package self.explore.generics.classextends.scenario5;

public class Child extends Father<String, Integer> {

	Double ob2;
	
	Child(String o, Double o2) {
		super(o);
		ob2 = o2;
	}
	
	Double getob2() {
		return ob2;
	}
	
	@Override
	public String getob(Integer o) {
		return String.valueOf(o);
	}

}
