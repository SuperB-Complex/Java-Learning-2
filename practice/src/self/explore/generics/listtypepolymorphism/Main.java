package self.explore.generics.listtypepolymorphism;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<Integer> ll = new ArrayList<> ();
		LinkedList<Integer> linkedlist = (LinkedList<Integer>) ll;
		// compile wrong
		// ArrayList<Integer> arraylist = ll;
		ArrayList<Integer> arraylist = (ArrayList<Integer>) ll;
	}
}
