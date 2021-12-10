package interview_programs;

public class PatternPrint {
	public static void main(String[] args) {
		leftAngleTriangle();
		rightAngleTriangle();
	}

	public static void leftAngleTriangle() {
		for (int i = 0; i <= 5; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print('*');
			}
			System.out.println();
		}
	}

	public static void rightAngleTriangle() {
		for (int i = 0; i <= 5; i++) {
			for (int j = 0; j <=5; j++) {
				if (i==0 && j==5 || i==1 && j==4 ||
					i==1 && j==5 || i==2 && j==5 ||
					i==2 && j==4 || i==2 && j==3 ||
					i==3 && j==5 || i==3 && j==4 ||
					i==3 && j==3 || i==3 && j==2 ||
					i==4 && j==5 || i==4 && j==4 ||
					i==4 && j==3 || i==4 && j==2 ||
					i==4 && j==1 || i==5
					) {
					System.out.print('*');					
				}else {
					System.out.print(' ');
				}
			}
			System.out.println();
		}
	}

}
