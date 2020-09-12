package self.explore.funtionalinterface.predicates;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExercise {
	
	public static void main(String[] args) {
		// Integer
		List<Integer> list = Arrays.asList(-1, -2, -3, -4, -7, 1, 2, 6, 22, 67);
		List<Integer> filteredNegativeNumberList = getFilteredIntegerList(list, IntegerPredicate.negativeNumderPredicate);;
		filteredNegativeNumberList.forEach(System.out::println);
		List<Integer> filteredPositiveNumberList = getFilteredIntegerList(list, IntegerPredicate.positiveNumderPredicate);;
		filteredPositiveNumberList.forEach(System.out::println);
		List<Integer> filteredSpecificNumberList = getFilteredIntegerList(list, IntegerPredicate.getSpecificNumber(2));;
		filteredSpecificNumberList.forEach(System.out::println);
		
		// with customized objects
		List<Person> persons = PersonFactory.createPersons();
		List<Person> filteredList = getFilteredNumber(persons, PersonPredicate.malePersonPredicate);
		filteredList.forEach(System.out::println);
		List<Person> filteredGenderAndZipList = getFilteredNumber(persons, PersonPredicate.getSpecificZip(1102)
																	  .and(PersonPredicate.malePersonPredicate));
		filteredGenderAndZipList.forEach(System.out::println);
		List<Person> filteredGenderOrZipList = getFilteredNumber(persons, PersonPredicate.getSpecificZip(1102)
																	  .or(PersonPredicate.malePersonPredicate));
		filteredGenderOrZipList.forEach(System.out::println);
	}
	
	public static List<Person> getFilteredNumber(List<Person> persons, Predicate<Person> personPredicate) {
		List<Person> filteredPersons = new ArrayList<> ();
		for (Person p : persons) {
			if (personPredicate.test(p)) 
				filteredPersons.add(p);
		}
		return filteredPersons;
	}
	
	public static List<Integer> getFilteredIntegerList(List<Integer> list, Predicate<Integer> numberPredicate) {
		List<Integer> filteredIntegers = new ArrayList<> ();
		for (Integer i : list) {
			if (numberPredicate.test(i)) 
				filteredIntegers.add(i);
		}
		return filteredIntegers;
	}
}
