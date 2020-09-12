package self.verify;

public class QuckSort {
	public void quickSortNodes(int[] input, int left, int right) {
		if (input == null || left >= right || input.length <= 1) 
			return;
		int pivot = this.divide(input, left, right);
		this.quickSortNodes(input, left, pivot - 1);
		this.quickSortNodes(input, pivot, right);
	}
	
	private int divide(int[] input, int left, int right) {
		int record = left;
		for (int i = left; i < right; i++) {
			if (input[i] < input[right - 1]) {
				this.swap(input, i, record++);
			}
		}
		this.swap(input, right - 1, record++);
		return record;
	}
	
	private void swap(int[] input, int left, int right) {
		int temp = input[left];
		input[left] = input[right];
		input[right] = temp;
	}
	
	public static void main(String[] args) {
		int[] arr = new int[] {3, 7, 8, 5, 2, 1, 1, 1, 9, 5, 4};
		QuckSort qc = new QuckSort();
		qc.quickSortNodes(arr, 0, arr.length);
		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");
		
	}
}
