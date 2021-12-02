package interview_programs;

public class InsertionSort {
	public static int[] n;

	public static void main(String[] args) {
		int[] a = { 9,8,7,5,1,2,4 };
		n = insertionSort(a);
		for (int i : n) {
			System.out.print(i + " ");
		}

	}

	public static int[] insertionSort(int[] a) {
		for (int i = 0; i <= a.length - 1; i++) {
			int value = a[i];
			int j = i - 1;
			while (j >= 0 && a[j] > value) {
				a[j + 1] = a[j];
				j = j - 1;
			}
			a[j + 1] = value;
		}
		return a;
	}

}
