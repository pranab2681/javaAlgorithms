package interview_programs;

public class FibonacciSeries {
	public static void main(String[] args) {
		//series to be printed
		int seriesToPrint = 5;
		//creating variables
		int n1 = 0, n2 = 1, n3, i;
		
		// printing 0 and 1
		System.out.print(n1 + " " + n2);

		// loop starts from 2 because 0 and 1 are already printed
		for (i = 0; i < seriesToPrint; ++i)
		{
			n3 = n1 + n2;
			System.out.print(" " + n3);
			n1 = n2;
			n2 = n3;
		}
	}
}
