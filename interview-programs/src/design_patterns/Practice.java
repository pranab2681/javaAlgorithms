package design_patterns;

public class Practice {
	private static Practice instance;

	private Practice() {
	}

	public static Practice getInstance() {
		if (instance == null) {
			instance = new Practice();
		}
		return instance;
	}

	public int sum(int a, int b) {
		return a + b;
	}
}
