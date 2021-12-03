package design_patterns;

public class SingletonDesignPattern {

	private volatile static SingletonDesignPattern obj = null;
	
	private SingletonDesignPattern() {}
	//without synchronized
	public static SingletonDesignPattern getInstance() {
		if (obj == null) {
			obj = new SingletonDesignPattern();
		}
		return obj;
	}
	//with synchronized
	public static SingletonDesignPattern getInstance2() {
		if (obj == null) {
			synchronized (SingletonDesignPatternImpl.class) {
				if (obj == null) {
					obj = new SingletonDesignPattern();
				}
			}
		}
		return obj;
	}
	
	
	public void printNumber(int m) {
		for (int i = 0; i <= m; i++) {
			System.out.print(i+ " ");
		}
	}
}
