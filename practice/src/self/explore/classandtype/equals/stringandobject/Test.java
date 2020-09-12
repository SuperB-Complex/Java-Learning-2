package self.explore.classandtype.equals.stringandobject;

public class Test {
	public static void main(String[] args) {
		String i = "1sdga";
		String ii = "1sdga";
		System.out.println(i == ii);         // true
		System.out.println(ii.equals(i));    // true
		
		String j = new String("sgg34ga");
		String jj = new String("sgg34ga");
		System.out.println(j == jj);         // false
		System.out.println(jj.equals(j));    // true
		
		Object k = "1sdga";
		String kk = "1sdga";
		System.out.println(k == kk);         // true
		System.out.println(kk.equals(k));    // true
		
	}
}
