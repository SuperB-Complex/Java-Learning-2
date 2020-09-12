package self.explore.classandtype.equals.stringbuilderandstringbuffer;

public class Test {
	public static void main(String[] args) {
		StringBuilder i = new StringBuilder("1sdga");
		StringBuilder ii = new StringBuilder("1sdga");
		System.out.println(i == ii);                   // false
		System.out.println(ii.equals(i));              // false
		
		StringBuffer j = new StringBuffer("sgg34ga");
		StringBuffer jj = new StringBuffer("sgg34ga");
		System.out.println(j == jj);                   // false
		System.out.println(jj.equals(j));              // false
		
		String k = i.toString();
		String kk = ii.toString();
		System.out.println(k == kk);                   // false
		System.out.println(kk.equals(k));              // true
		
		String q = j.toString();
		String qq = jj.toString();
		System.out.println(q == qq);                   // false
		System.out.println(qq.equals(q));              // true
		
	}
}
