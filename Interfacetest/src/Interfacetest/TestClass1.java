package Interfacetest;

interface TestInterface {
	// abstract method
	public void square(int a);

	// default method
	default void show() {
		System.out.println("Default Method Executed");
	}

	// static method
	static void showstatic() {
		System.out.println("Static Method Executed");
	}
}

public class TestClass1 implements TestInterface {

	// implementation of square abstract method
	public void square(int a) {
		System.out.println(a * a);
	}

	public static void main(String args[]) {
		TestClass1 d = new TestClass1();
		d.square(4);

		// default method executed
		d.show();

		// Static method executed
		TestInterface.showstatic();
	}
}
