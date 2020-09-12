package self.explore.streams.groupingbyandpartitioningby;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Test {
	
	public static List<Person> populateWithData() {
		List<Person> list = new ArrayList<> ();
		
		Person person1 = new Person("person1", "US");
		Person person2 = new Person("person2", "US");
		Person person3 = new Person("person3", "Brazil");
		Person person4 = new Person("person4", "US");
		Person person5 = new Person("person5", "Brazil");
		Person person6 = new Person("person6", "US");
		Person person7 = new Person("person7", "Germany");
		Person person8 = new Person("person8", "US");
		
		list.add(person1);
		list.add(person2);
		list.add(person3);
		list.add(person4);
		list.add(person5);
		list.add(person6);
		list.add(person7);
		list.add(person8);
		
		return list;
	}
	
	public static void main(String[] args) {
		List<Person> persons = populateWithData();
		System.out.println("------------------obtain US and noon-US based persons using partitioningBy & groupingBy------------------");
		System.out.println(persons.stream().collect(Collectors.partitioningBy((Person p) -> p.getCountry().equals("US"))));
		System.out.println(persons.stream().collect(Collectors.groupingBy((Person p) -> p.getCountry().equals("US"))));
		System.out.println("------------------count US based persons using partitioningBy & groupingBy------------------");
		System.out.println(persons.stream().collect(Collectors.partitioningBy((Person p) -> p.getCountry().equals("US"), Collectors.counting())));
		System.out.println(persons.stream().collect(Collectors.groupingBy((Person p) -> p.getCountry().equals("US"), Collectors.counting())));
		System.out.println("------------------obtain the person in each country and count them using groupingBy------------------");
		System.out.println(persons.stream().collect(Collectors.groupingBy((Person p) -> p.getCountry())));
		System.out.println(persons.stream().collect(Collectors.groupingBy((Person p) -> p.getCountry(), Collectors.counting())));
		System.out.println("------------------obtain US and non-US based persons using partitioningBy & map names to uppercase using mapping------------------");
		System.out.println(persons.stream().collect(Collectors.partitioningBy((Person p) -> p.getCountry().equals("US"), Collectors.mapping(p -> p.getName().toUpperCase(), Collectors.toList()))));
		System.out.println("------------------obtain the persons in each country using groupingBy & map names to upppercase using mapping------------------");
		System.out.println(persons.stream().collect(Collectors.groupingBy((Person p) -> p.getCountry().equals("US"), Collectors.mapping(p -> p.getName().toUpperCase(), Collectors.toList()))));
	}
	
}
