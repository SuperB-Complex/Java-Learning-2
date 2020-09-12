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
		
		// String�����Ƿ���Object��ʵ��
		// return true
        boolean b1 = "Sting" instanceof Object;
        // String�����Ƿ���String��ʵ��
        // return true
        boolean b2 = new String() instanceof String;
        // Object�����Ƿ���String��ʵ��
        // return false
        boolean b3 = new Object() instanceof String;
        //��仰����ȫ���Ա���ͨ��,ֻҪinstanceof�ؼ��ֵ����������������м̳л�ʵ�ֹ�ϵ,�� ���Ա���ͨ��.

        // ���������Ƿ���װ�����͵�ʵ��
        // compile fail
        // boolean b4 = 'A' instanceof Character;
        //��Ϊ'A'��һ��char���ͣ�Ҳ����һ���������ͣ�����һ������instanceofֻ�����ڶ�����жϣ��������ڻ������͵��жϡ�

        // �ն����Ƿ���String��ʵ��
        boolean b5 = null instanceof String;//����false
        //��instanceof���еĹ��������������null�������ֱ�ӷ���false�����������Ҳ�������ʲô�ࡣ������ǵĳ���ǳ�������
        //��ʹ��instanceof������ʱ�����ù��ı��жϵ��ࣨҲ��������������Ƿ�Ϊnull���������Ǿ����õ���equals��toString������ͬ��

        // ����ת����Ŀն����Ƿ���String��ʵ��
        boolean b6 = (String) null instanceof String;//����false
        //����ֵ��false����Ҫ�������и�ǿ������ת������Ϊ�����true�����ǵģ�null��һ���������ͣ�Ҳ����˵��û���ͣ���ʹ������ת�����Ǹ�null��

        // compile fail
        // boolean b7 = new Date() instanceof String;
        //����ͨ��������ΪDate���Stringû�м̳л�ʵ�ֹ�ϵ�������ڱ���ʱֱ�Ӿͱ����ˣ�instanceof�����������Ҳ����������м̳л�ʵ�ֹ�ϵ����������ʧ�ܡ�
	}
}
