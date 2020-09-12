package self.explore.funtionalinterface.methodsreference.instances;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;

import self.explore.funtionalinterface.methodsreference.Person;
import self.explore.funtionalinterface.methodsreference.PersonFactory;
import self.explore.funtionalinterface.methodsreference.statics.StaticMethodReference;

public class InstanceMethodReference {
	public static void main(String[] args) {
		
		List<Person> persons = PersonFactory.createPersons();
		// original version
		persons.forEach(new Consumer<Person> () {
			@Override
			public void accept(Person person) {
				new InstanceMethodReference().printPerson(person);
			}
		});
		
		// lambda version
		InstanceMethodReference instance1 = new InstanceMethodReference();
		persons.forEach(instance1::printPerson);
		
		// original version
		Supplier<String> supplier2 = () -> new String("Hashhash");
		System.out.println(supplier2.get());
		
		// lambda version
		InstanceMethodReference instance2 = new InstanceMethodReference();
		Supplier<String> supplier3 = instance2::createString;
		System.out.println(supplier3.get());
	}
	
	public void printPerson(Person p) {
		System.out.println(p);
	}
	
	public String createString() {
		return new String("HashHash");
	}
}
