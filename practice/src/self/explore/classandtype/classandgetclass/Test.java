package self.explore.classandtype.classandgetclass;

public class Test {
	public static void main(String[] args) {
		Class classr1 = Classr.class;
		// getClass method is an instance method
		// Class classr2 = Classr.getClass();
		Class classr2 = new Classr().getClass();
		
		Class abstractClass1 = AbstractClass.class;
		// Abstract class can't be initiated, even it has constructor
		// Class abstractClass12 = new AbstractClass().getClass();
		
		Class interfacer1 = Interfacer1.class;
		// Interface can't be initiated
		
		Class classImplementInterface1 = ClassImplementInterface1.class;
		Class classImplementInterface2 = new ClassImplementInterface1().getClass();
		Class classImplementInterface11 = ClassImplementInterface2.class;
		Class classImplementInterface22 = new ClassImplementInterface2().getClass();
		
		Class classImplementInterfaces1 = ClassImplementInterfaces.class;
		Class classImplementInterfaces2 = new ClassImplementInterfaces().getClass();
		
		Class classExtendsAbstractClass1 = ClassExtendsAbstractClass1.class;
		Class classExtendsAbstractClass2 = new ClassExtendsAbstractClass1().getClass();
		Class classExtendsAbstractClass11 = ClassExtendsAbstractClass2.class;
		Class classExtendsAbstractClass22 = new ClassExtendsAbstractClass2().getClass();
		
		/*
		 * classr1: class self.explore.classandtype.classandgetclass.Classr
			classr2: class self.explore.classandtype.classandgetclass.Classr
			abstractClass1: class self.explore.classandtype.classandgetclass.AbstractClass
			interfacer1: interface self.explore.classandtype.classandgetclass.Interfacer
			classImplementInterface1: class self.explore.classandtype.classandgetclass.ClassImplementInterface1
			classImplementInterface2: class self.explore.classandtype.classandgetclass.ClassImplementInterface1
			classImplementInterface11: class self.explore.classandtype.classandgetclass.ClassImplementInterface2
			classImplementInterface22: class self.explore.classandtype.classandgetclass.ClassImplementInterface2
			classExtendsAbstractClass1: class self.explore.classandtype.classandgetclass.ClassExtendsAbstractClass1
			classExtendsAbstractClass2: class self.explore.classandtype.classandgetclass.ClassExtendsAbstractClass1
			classExtendsAbstractClass11: class self.explore.classandtype.classandgetclass.ClassExtendsAbstractClass2
			classExtendsAbstractClass22: class self.explore.classandtype.classandgetclass.ClassExtendsAbstractClass2
		 * */
//		System.out.println("classr1: " + classr1);
//		System.out.println("classr2: " + classr2);
//		System.out.println("abstractClass1: " + abstractClass1);
//		System.out.println("interfacer1: " + interfacer1);
//		System.out.println("classImplementInterface1: " + classImplementInterface1);
//		System.out.println("classImplementInterface2: " + classImplementInterface2);
//		System.out.println("classImplementInterface11: " + classImplementInterface11);
//		System.out.println("classImplementInterface22: " + classImplementInterface22);
//		System.out.println("classExtendsAbstractClass1: " + classExtendsAbstractClass1);
//		System.out.println("classExtendsAbstractClass2: " + classExtendsAbstractClass2);
//		System.out.println("classExtendsAbstractClass11: " + classExtendsAbstractClass11);
//		System.out.println("classExtendsAbstractClass22: " + classExtendsAbstractClass22);
		
		/*
		 * classr1: self.explore.classandtype.classandgetclass.Classr
			classr2: self.explore.classandtype.classandgetclass.Classr
			abstractClass1: self.explore.classandtype.classandgetclass.AbstractClass
			interfacer1: self.explore.classandtype.classandgetclass.Interfacer
			classImplementInterface1: self.explore.classandtype.classandgetclass.ClassImplementInterface1
			classImplementInterface2: self.explore.classandtype.classandgetclass.ClassImplementInterface1
			classImplementInterface11: self.explore.classandtype.classandgetclass.ClassImplementInterface2
			classImplementInterface22: self.explore.classandtype.classandgetclass.ClassImplementInterface2
			classExtendsAbstractClass1: self.explore.classandtype.classandgetclass.ClassExtendsAbstractClass1
			classExtendsAbstractClass2: self.explore.classandtype.classandgetclass.ClassExtendsAbstractClass1
			classExtendsAbstractClass11: self.explore.classandtype.classandgetclass.ClassExtendsAbstractClass2
			classExtendsAbstractClass22: self.explore.classandtype.classandgetclass.ClassExtendsAbstractClass2
		 * */
//		System.out.println("classr1: " + classr1.getName());
//		System.out.println("classr2: " + classr2.getName());
//		System.out.println("abstractClass1: " + abstractClass1.getName());
//		System.out.println("interfacer1: " + interfacer1.getName());
//		System.out.println("classImplementInterface1: " + classImplementInterface1.getName());
//		System.out.println("classImplementInterface2: " + classImplementInterface2.getName());
//		System.out.println("classImplementInterface11: " + classImplementInterface11.getName());
//		System.out.println("classImplementInterface22: " + classImplementInterface22.getName());
//		System.out.println("classExtendsAbstractClass1: " + classExtendsAbstractClass1.getName());
//		System.out.println("classExtendsAbstractClass2: " + classExtendsAbstractClass2.getName());
//		System.out.println("classExtendsAbstractClass11: " + classExtendsAbstractClass11.getName());
//		System.out.println("classExtendsAbstractClass22: " + classExtendsAbstractClass22.getName());
		
		/*
		 * classr1: package self.explore.classandtype.classandgetclass
			classr2: package self.explore.classandtype.classandgetclass
			abstractClass1: package self.explore.classandtype.classandgetclass
			interfacer1: package self.explore.classandtype.classandgetclass
			classImplementInterface1: package self.explore.classandtype.classandgetclass
			classImplementInterface2: package self.explore.classandtype.classandgetclass
			classImplementInterface11: package self.explore.classandtype.classandgetclass
			classImplementInterface22: package self.explore.classandtype.classandgetclass
			classExtendsAbstractClass1: package self.explore.classandtype.classandgetclass
			classExtendsAbstractClass2: package self.explore.classandtype.classandgetclass
			classExtendsAbstractClass11: package self.explore.classandtype.classandgetclass
			classExtendsAbstractClass22: package self.explore.classandtype.classandgetclass
		 * */
//		System.out.println("classr1: " + classr1.getPackage());
//		System.out.println("classr2: " + classr2.getPackage());
//		System.out.println("abstractClass1: " + abstractClass1.getPackage());
//		System.out.println("interfacer1: " + interfacer1.getPackage());
//		System.out.println("classImplementInterface1: " + classImplementInterface1.getPackage());
//		System.out.println("classImplementInterface2: " + classImplementInterface2.getPackage());
//		System.out.println("classImplementInterface11: " + classImplementInterface11.getPackage());
//		System.out.println("classImplementInterface22: " + classImplementInterface22.getPackage());
//		System.out.println("classExtendsAbstractClass1: " + classExtendsAbstractClass1.getPackage());
//		System.out.println("classExtendsAbstractClass2: " + classExtendsAbstractClass2.getPackage());
//		System.out.println("classExtendsAbstractClass11: " + classExtendsAbstractClass11.getPackage());
//		System.out.println("classExtendsAbstractClass22: " + classExtendsAbstractClass22.getPackage());
		
		/*
		 * classr1: class java.lang.Object
			classr2: class java.lang.Object
			abstractClass1: class java.lang.Object
			interfacer1: null
			classImplementInterface1: class java.lang.Object
			classImplementInterface2: class java.lang.Object
			classImplementInterface11: class java.lang.Object
			classImplementInterface22: class java.lang.Object
			classExtendsAbstractClass1: class self.explore.classandtype.classandgetclass.AbstractClass
			classExtendsAbstractClass2: class self.explore.classandtype.classandgetclass.AbstractClass
			classExtendsAbstractClass11: class self.explore.classandtype.classandgetclass.AbstractClass
			classExtendsAbstractClass22: class self.explore.classandtype.classandgetclass.AbstractClass
		 * */
//		System.out.println("classr1: " + classr1.getSuperclass());
//		System.out.println("classr2: " + classr2.getSuperclass());
//		System.out.println("abstractClass1: " + abstractClass1.getSuperclass());
//		System.out.println("interfacer1: " + interfacer1.getSuperclass());
//		System.out.println("classImplementInterface1: " + classImplementInterface1.getSuperclass());
//		System.out.println("classImplementInterface2: " + classImplementInterface2.getSuperclass());
//		System.out.println("classImplementInterface11: " + classImplementInterface11.getSuperclass());
//		System.out.println("classImplementInterface22: " + classImplementInterface22.getSuperclass());
//		System.out.println("classExtendsAbstractClass1: " + classExtendsAbstractClass1.getSuperclass());
//		System.out.println("classExtendsAbstractClass2: " + classExtendsAbstractClass2.getSuperclass());
//		System.out.println("classExtendsAbstractClass11: " + classExtendsAbstractClass11.getSuperclass());
//		System.out.println("classExtendsAbstractClass22: " + classExtendsAbstractClass22.getSuperclass());
		
		/*
		 * classr1: [Ljava.lang.Class;@41975e01
			classr2: [Ljava.lang.Class;@c2e1f26
			abstractClass1: [Ljava.lang.Class;@dcf3e99
			interfacer1: [Ljava.lang.Class;@6d9c638
			classImplementInterface1: [Ljava.lang.Class;@7dc5e7b4
			classImplementInterface2: [Ljava.lang.Class;@1ee0005
			classImplementInterfaces1: [Ljava.lang.Class;@75a1cd57
			classImplementInterfaces2: [Ljava.lang.Class;@3d012ddd
			classImplementInterface11: [Ljava.lang.Class;@6f2b958e
			classImplementInterface22: [Ljava.lang.Class;@1eb44e46
			classExtendsAbstractClass1: [Ljava.lang.Class;@6504e3b2
			classExtendsAbstractClass2: [Ljava.lang.Class;@515f550a
			classExtendsAbstractClass11: [Ljava.lang.Class;@626b2d4a
			classExtendsAbstractClass22: [Ljava.lang.Class;@5e91993f
		 * */
//		System.out.println("classr1: " + classr1.getInterfaces());
//		System.out.println("classr2: " + classr2.getInterfaces());
//		System.out.println("abstractClass1: " + abstractClass1.getInterfaces());
//		System.out.println("interfacer1: " + interfacer1.getInterfaces());
//		System.out.println("classImplementInterface1: " + classImplementInterface1.getInterfaces());
//		System.out.println("classImplementInterface2: " + classImplementInterface2.getInterfaces());
//		System.out.println("classImplementInterfaces1: " + classImplementInterface1.getInterfaces());
//		System.out.println("classImplementInterfaces2: " + classImplementInterface2.getInterfaces());
//		System.out.println("classImplementInterface11: " + classImplementInterface11.getInterfaces());
//		System.out.println("classImplementInterface22: " + classImplementInterface22.getInterfaces());
//		System.out.println("classExtendsAbstractClass1: " + classExtendsAbstractClass1.getInterfaces());
//		System.out.println("classExtendsAbstractClass2: " + classExtendsAbstractClass2.getInterfaces());
//		System.out.println("classExtendsAbstractClass11: " + classExtendsAbstractClass11.getInterfaces());
//		System.out.println("classExtendsAbstractClass22: " + classExtendsAbstractClass22.getInterfaces());
	}
}
