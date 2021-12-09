package interview_programs;

public class Print_0_1_0_1 {
	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			int n;
			if (i % 2 == 0) {
				n = 0;
				for (int j = 1; j <= 5; j++) {
					System.out.print(n);
					n = (n == 0) ? 1 : 0;
				}
			} else {
				n = 1;
				for (int j = 1; j <= 5; j++) {
					System.out.print(n);
					n = (n == 0) ? 1 : 0;
				}
			}
			System.out.println();
		}
	}
}
