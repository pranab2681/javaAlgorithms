package design_patterns;

public class SingletonDesignPatternImpl {
	public static void main(String[] args) {
		SingletonDesignPattern s = null;
		SingletonDesignPattern instance = s.getInstance();
		System.out.println(instance);
		
		instance.printNumber(5);
		System.out.println();
		
		SingletonDesignPattern instance2 = s.getInstance2();
		System.out.println(instance2);
		
		
		SingletonDesignPatternImpl s2 = new SingletonDesignPatternImpl();
		
		instance2.printNumber(10);
	}
	
}
