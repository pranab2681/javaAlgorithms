package interview_programs;

public class FindWhichNumberIsMissingFromAnArray {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 9 };
		int res = findMissingNumber(arr);
		System.out.println(res);
	}
	public static int findMissingNumber(int arr[]) {
		int n = arr.length;
		int sum = ((n+1) * (n+2)) /2 ;
		for (int i = 0; i < n; i++) {
			sum = sum - arr[i];
		}
		return sum;
	}
}
