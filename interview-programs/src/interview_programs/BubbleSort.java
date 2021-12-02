package interview_programs;

public class BubbleSort {
	public static int[] n;
	public static void main(String[] args) {
		//array to be sorted
		int[] arr = {9,9,9,9,8,8,8,4,7,7,4,1,2,1,2,1,2};
		
		//length of an array
		int len = arr.length;
		
		//iterate the array twice
		for (int i = len - 1; i > 0; i--) {
			for (int j = 0; j < len -1; j++) {
				if (arr[j] > arr[j+1]) {
					n = swap(arr, j, j+1);
				}
			}
		}
		for (int i : n) {
			System.out.print(i+" ");
		}
	}
	public static int[] swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
		return arr;
	}

}
