package interview_programs;

public class SwapTwoNumberWithoutThirdVariable {
	public static int[] n;
	public static void main(String[] args) {
		int arr[] = {7, 4};
		n = swap(arr);
		for (int i : n) {
			System.out.println(i);
		}
		
	}
	public static int[] swap(int[] arr) {
		arr[0] = arr[0] + arr[1];
		arr[1] = arr[0] - arr[1];
		arr[0] = arr[0] - arr[1];
		return arr;
	}
}
