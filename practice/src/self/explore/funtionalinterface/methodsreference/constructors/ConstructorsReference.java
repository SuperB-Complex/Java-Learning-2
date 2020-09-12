package self.explore.funtionalinterface.methodsreference.constructors;

import java.util.function.BiFunction;

public class ConstructorsReference {
	public static void main(String[] args) {
		// original version
		UserFactory userFactory = new UserFactory() {
			@Override
			public User createUser(int id, String name) {
				return new User(id, name);
			}
		};
		System.out.println(userFactory.createUser(1, "jj"));
		
		// lambda version
		UserFactory userFactory1 = (int id, String name) -> new User(id, name);
		System.out.println(userFactory1.createUser(1, "jj"));
		
		// productive version
		UserFactory userFactory2 = User::new;
		System.out.println(userFactory2.createUser(1, "jj"));
		
		// an alternative version
		BiFunction<Integer, String, User> userFactory3 = User::new;
		System.out.println(userFactory3.apply(1, "jj"));
	}
}
