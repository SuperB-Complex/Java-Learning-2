package self.explore.funtionalinterface.methodsreference.statics;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;

import self.explore.funtionalinterface.methodsreference.Person;
import self.explore.funtionalinterface.methodsreference.PersonFactory;

public class StaticMethodReference {
	public static void main(String[] args) {
	
		List<Person> persons = PersonFactory.createPersons();
		// original version
		persons.forEach(new Consumer<Person> () {
			@Override
			public void accept(Person person) {
				StaticMethodReference.printPerson(person);
			}
		});
		
		// lambda version
		persons.forEach(StaticMethodReference::printPerson);
		
		// original version
		Supplier<String> supplier2 = () -> new String("Hashhash");
		System.out.println(supplier2.get());
		
		// lambda version
		Supplier<String> supplier3 = StaticMethodReference::createString;
		System.out.println(supplier3.get());
	}
	
	public static void printPerson(Person p) {
		System.out.println(p);
	}
	
	public static String createString() {
		return new String("HashHash");
	}
}
