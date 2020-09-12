package self.explore.funtionalinterface.predicates;

import java.util.function.Predicate;

public class PersonPredicate {
	public static Predicate<Person> malePersonPredicate = p -> p.getGender().equals(Gender.MALE);
	public static Predicate<Person> femalePersonPredicate = p -> p.getGender().equals(Gender.FEMALE);
	// needs a input parameter
	public static Predicate<Person> getSpecificZip(int zip) {
		return i -> i.getAreaCode() == zip;
	}
}
