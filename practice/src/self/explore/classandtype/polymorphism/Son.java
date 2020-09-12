package self.explore.classandtype.polymorphism;

public class Son extends Parent {

	@Override
	void grow() {
		System.out.println("override method from parent");
	}

	void dance(){
        System.out.println("son can dance");
    }
}
