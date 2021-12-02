package interview_programs;

public class NumberPalindrome {
	public static void main(String[] args) {
		int number = 133;// It is the number variable to be checked for palindrome
		String res = isPalindrome(number) == true ? "Yes, number is palindrome" : "No not Palindrome";
		System.out.println(res);
	}

	public static boolean isPalindrome(int n) {

		int r, sum = 0, temp;

		temp = n;
		while (n > 0) {
			r = n % 10; // getting remainder
			sum = (sum * 10) + r;
			n = n / 10;
		}
		return temp == sum ? true : false;
	}
}
