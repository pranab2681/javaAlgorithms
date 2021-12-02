package interview_programs;

public class RemoveDuplicate extends BubbleSort {
	public static int[] n;
	public static void main(String[] args) {
		//array to be sorted and applicable for remove duplicates
		int arr[] = { 9, 9, 8, 8, 7, 8, 9, 4, 4, 1, 1, 1, 1, 8 };
		
		//array length
		int len = arr.length;

		//iterating array for bubble sort
		for (int i = len - 1; i > 0; i--) {
			for (int j = 0; j < len - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					n = swap(arr, j, j + 1);
				}
			}
		}
		//calling the method for removing the duplicate from the sorted array
		int newLen = removeDuplicate(arr, len);
		
		for (int i = 0; i < newLen; i++) {
			System.out.print(n[i]);
		}
		
	}
	
	//remove duplicate logic
	public static int removeDuplicate(int[] arr, int len) {
		int[] temp = new int[len];
		int j = 0;
		
		for (int i = 0; i < len -1; i++) {
			if (arr[i] != arr[i+1]) {
				temp[j++] = arr[i];
			}
		}
		temp[j++] = arr[len-1];
		for (int i = 0; i < j; i++) {
			arr[i] = temp[i];
		}
		
		return j;
	}
}
