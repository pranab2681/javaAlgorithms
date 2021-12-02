package interview_programs;

public class ArmstrongNumber {
	public static void main(String[] args) {
		// enter number
		int number = 153;
		String res = isArmstrongNumber(number) == true ? "Yes, It's Armstrong" : "No! It's not";
		System.out.println(res);
	}

	public static boolean isArmstrongNumber(int num) {
		int n = num;
		int r, sum = 0,temp;
		temp = n;

		while (n > 0) {
			r = n % 10;
			sum = sum + (r * r * r);
			n = n / 10;
		}

		return temp == sum ? true : false;
	}
}
