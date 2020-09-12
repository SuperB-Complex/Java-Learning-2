package self.explore.generics.listtypenotpolymorphism;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
	public static void main(String[] args) {
//		List<Animal> animals = new ArrayList<> ();
//		List<Dog> dogs = new ArrayList<> ();
		// compile wrong
//		animals = dogs;
		
//		List<Dog> dogs = new ArrayList<> ();
		// compile wrong
//		List<Animal> animals = dogs;
		
		List<Dog> dogs = new ArrayList<> ();
		dogs.add(new Dog("hahhah"));
		List<? extends Animal> animals = dogs;
		// compile wrong
		// animals.add(new Cat("hahhah"));
		// compile wrong
		// animals.add(new Dog("hahhah"));
		// compile wrong
		// animals.add(new Animal("hahhah"));
		Dog dog = (Dog) animals.get(0);
		Animal animal = (Dog) animals.get(0);
		Cat cat = (Cat) animals.get(0);
		
		List<Animal> aanimals = new ArrayList<> ();
		List<? super Dog> adogs = aanimals;
		adogs.add(new Dog("hahhah"));
		// compile wrong
		// adogs.add(new Animal("hahhah"));
		adogs.add((Dog) new Animal("hahhah"));
		// compile wrong
		// dogs.add(new Cat("hahhah"));
		Object aobj = adogs.get(0);
		// compile wrong
		// Dog dog = dogs.get(0);
		Dog adog = (Dog) dogs.get(0);
		Cat acat = (Cat) adogs.get(0);
		Animal dogAnimal1 = (Dog) adogs.get(0);
		Animal dogAnimal2 = (Cat) adogs.get(0);
		Animal dogAnimal3 = (Animal) adogs.get(0);
		
		List<Dog> aadogs = new ArrayList<> ();
		// compile wrong
		// dogs.add(new Animal("a"));
		aadogs.add((Dog)new Animal("a"));
		aadogs.add(new Dog("a"));
		Animal dog0_0 = aadogs.get(0);
		Dog dog0_1 = aadogs.get(0);
		// compile wrong
		// Cat dog0_2 = aadogs.get(0);
		
		List<Animal> aaanimals = new ArrayList<> ();
		aaanimals.add(new Animal("a"));
		aaanimals.add(new Dog("a"));
		aaanimals.add(new Cat("a"));
		Animal animal0 = aaanimals.get(0);
		Animal animal1_0 = aaanimals.get(1);
		// compile wrong
		// Dog animal1_1 = aaanimals.get(1);
		Dog animal1_1 = (Dog)aaanimals.get(1);
		Animal animal1_2 = aaanimals.get(1);
		// compile wrong
		// Cat animal2_1 = aaanimals.get(2);
		Cat animal2_1 = (Cat)aaanimals.get(2);
		Animal animal2_2 = aaanimals.get(2);
	}
}
