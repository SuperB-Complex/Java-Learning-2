package self.explore.getclassandinstanceof;

import java.util.Date;

public class Test {
	public static void main(String[] args) {
		Parent parent = new Parent();
		Child1 child1 = new Child1();
		Child2 child2 = new Child2();
		GrandChild1 grandChild1 = new GrandChild1();
		GrandChild2 grandChild2 = new GrandChild2();
		
		/*
		 * child1 is an instance of Parent
			child2 is an instance of Parent
			grandChild1 is an instance of Parent
			grandChild2 is an instance of Parent
			grandChild1 is an instance of Child1
			grandChild2 is an instance of Child2
		 * */
		if (child1 instanceof Parent) {
			System.out.println("child1 is an instance of Parent");
		}
		if (child2 instanceof Parent) {
			System.out.println("child2 is an instance of Parent");
		}
		if (grandChild1 instanceof Parent) {
			System.out.println("grandChild1 is an instance of Parent");
		}
		if (grandChild2 instanceof Parent) {
			System.out.println("grandChild2 is an instance of Parent");
		}
		if (grandChild1 instanceof Child1) {
			System.out.println("grandChild1 is an instance of Child1");
		}
		if (grandChild2 instanceof Child2) {
			System.out.println("grandChild2 is an instance of Child2");
		}
		
		GenericClass<Date> genericDateClass = new GenericClass<> ();
		GenericClass<String> genericStringClass = new GenericClass<> ();
		
		/*
		 * genericDateClass is an instance of GenericClass
			genericStringClass is an instance of GenericClass
			new Date() is an instance of Date
			1. new String() is an instance of String
			2. new String() is an instance of String
		 * */
		if (genericDateClass instanceof GenericClass) {
			System.out.println("genericDateClass is an instance of GenericClass");
		}
		if (genericStringClass instanceof GenericClass) {
			System.out.println("genericStringClass is an instance of GenericClass");
		}
		// Cannot perform instanceof check against parameterized type GenericClass<Date>. 
		// Use the form GenericClass<?> instead since further generic type information will be erased at runtime
//		if (genericDateClass instanceof GenericClass<Date>) {
//			System.out.println("genericDateClass is an instance of GenericClass<Date>");
//		}
//		if (genericStringClass instanceof GenericClass<String>) {
//			System.out.println("genericStringClass is an instance of GenericClass<String>");
//		}
		if (genericDateClass.isDateInstance(new Date())) {
			System.out.println("new Date() is an instance of Date");
		}
		if (genericStringClass.isStringInstance(new String())) {
			System.out.println("1. new String() is an instance of String");
		}
		if (new String() instanceof String) {
			System.out.println("2. new String() is an instance of String");
		}
		
		// String对象是否是Object的实例
		// return true
        boolean b1 = "Sting" instanceof Object;
        // String对象是否是String的实例
        // return true
        boolean b2 = new String() instanceof String;
        // Object对象是否是String的实例
        // return false
        boolean b3 = new Object() instanceof String;
        //这句话是完全可以编译通过,只要instanceof关键字的左右两个操作数有继承或实现关系,就 可以编译通过.

        // 拆箱类型是否是装箱类型的实例
        // compile fail
        // boolean b4 = 'A' instanceof Character;
        //因为'A'是一个char类型，也就是一个基本类型，不是一个对象，instanceof只能用于对象的判断，不能用于基本类型的判断。

        // 空对象是否是String的实例
        boolean b5 = null instanceof String;//返回false
        //是instanceof特有的规则：若左操作数是null，结果就直接返回false，不再运算右操作数是什么类。这对我们的程序非常有利，
        //在使用instanceof操作符时，不用关心被判断的类（也就是左操作数）是否为null，这与我们经常用到的equals、toString方法不同。

        // 类型转换后的空对象是否是String的实例
        boolean b6 = (String) null instanceof String;//返回false
        //返回值是false，不要看这里有个强制类型转换就认为结果是true，不是的，null是一个万用类型，也可以说它没类型，即使做类型转换还是个null。

        // compile fail
        // boolean b7 = new Date() instanceof String;
        //编译通不过，因为Date类和String没有继承或实现关系，所以在编译时直接就报错了，instanceof操作符的左右操作数必须有继承或实现关系，否则编译会失败。
	}
}
