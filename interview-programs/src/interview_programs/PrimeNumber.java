package interview_programs;

public class PrimeNumber {
	public static void main(String[] args) {
		// number to check if it is prime or not
		int number = 13;
		String res = isPrime(number) == true ? "Yes it is prime number" : "No it is not prime number";
		System.out.println(res);
	}

	// logic to check if it is prime or not
	public static boolean isPrime(int num) {
		// pre check if the number is 0 or 1
		if (num == 0 || num == 1) {
			return false;
		}
		if (num % 2 != 0) {
			return true;
		} else {
			return false;
		}
	}
}
