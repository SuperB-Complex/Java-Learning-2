package self.explore.copy.collections.linkedlist;

import java.util.LinkedList;
import java.util.List;

import tta.basics.daythree.one.Shape;

public class Test {
	public static void main(String[] args) {
		// copy like this will get index out of boundary exception
		// and it is not recommend to do something like this:
		/*
		 * List<String> copyOflist = new LinkedList<> ();
		 * copyOflist.add(new String());list.add(new String());
		 * list.add(new String());list.add(new String());
		 * */
		// because most time you are having customized type
		// and you can't initiate that type without necessary parameters
//		List<String> list = new LinkedList<> ();
//		list.add("qq1");list.add("qq2");list.add("qq3");list.add("qq4");
//		List<String> copyOflist = new LinkedList<> ();
//		Collections.copy(copyOflist, list);
		
		LinkedList<String> list = new LinkedList<> ();
		list.add("qq1");list.add("qq2");list.add("qq3");list.add("qq4");
		LinkedList<String> copyOflist1 = (LinkedList)list.clone();
		LinkedList<String> copyOflist2 = (LinkedList<String>)list.clone();
		LinkedList<Object> copyOflis3 = (LinkedList)list.clone();
		LinkedList<Integer> copyOflis4 = (LinkedList)list.clone();
		LinkedList<Double> copyOflis5 = (LinkedList)list.clone();
	}
}
