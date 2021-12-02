package interview_programs;

public class SelectionSort {
	public static int[] n;

	public static void main(String[] args) {
		//array to be sorted
		int[] arr = { 9, 8, 9, 8, 5, 4, 1, 2, 3, 6, 6, 9, 8, 4, 7 };
		n = selectionSort(arr);
		for (int i : n) {
			System.out.print(i + " ");
			
		}
	}
	
	//logic to sort the array
	public static int[] selectionSort(int[] a) {
		for (int i = 0; i < a.length - 1; i++) {
			int min = i;
			for (int j = i + 1; j < a.length; j++) {
				if (a[j] < a[min]) {
					min = j;
				}
			}
			if (i != min) {
				int swap = a[i];
				a[i] = a[min];
				a[min] = swap;
			}
		}
		return a;
	}
}
