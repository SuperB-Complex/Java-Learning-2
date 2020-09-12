package self.explore.classandtype.equals.intandinteger;

public class Test {
	public static void main(String[] args) {
		int i = 9;
		Integer ii = 9;
		System.out.println(i == ii);         // true
		System.out.println(ii.equals(i));    // true
		
		int j = 999;
		Integer jj = 999;
		System.out.println(j == jj);         // true
		System.out.println(jj.equals(j));    // true
		
		int k = 9;
		Integer kk = new Integer(9);
		System.out.println(k == kk);         // true
		System.out.println(kk.equals(k));    // true
		
		int q = 9999;
		Integer qq = new Integer(9999);
		System.out.println(q == qq);         // true
		System.out.println(qq.equals(q));    // true
		
		Integer z = -128;
		Integer zz = -128;
		System.out.println(z == zz);         // true
		System.out.println(zz.equals(z));    // true
		
		Integer g = new Integer(9);
		Integer gg = new Integer(9);
		System.out.println(g == gg);         // false
		System.out.println(gg.equals(g));    // true
		
		Integer f = 9;
		Integer ff = new Integer(9);
		System.out.println(f == ff);         // false
		System.out.println(ff.equals(f));    // true
		
		Integer p = 9999;
		Integer pp = new Integer(9999);
		System.out.println(p == pp);         // false
		System.out.println(pp.equals(p));    // true
	}
}
