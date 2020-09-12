package self.explore.classandtype.polymorphism;

public class Test {
	public static void main(String[] args) {
		//上转型，用父类的引用子类的对象
        Parent p=new Son();
        //调用父类中有的方法
        p.grow();
        //p.dance();这里会报错，因为父类中没有dance()方法

        //对进行过上转型的对象，进行强制下转型
        Son s=(Son)p;
        //调用子类中的方法
        s.dance();
	}
}
