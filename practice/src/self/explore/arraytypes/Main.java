package self.explore.arraytypes;

public class Main {
	public static void main(String[] args) {
		Number[] arr = new Number[3];
		Integer[] intergers = new Integer[3];
		arr = intergers;
		arr[0] = new Integer(0);
		// compile wrong
		// arr[1] = new Number(2);
		// runtime exception: ArrayStoreException
		// arr[1] = new Double(2);
		System.out.println(arr);
		
		Number[] numbers = new Number[3];
		numbers[0] = new Integer(0);
		numbers[1] = new Double(2);
		System.out.println(numbers);
	}
}
