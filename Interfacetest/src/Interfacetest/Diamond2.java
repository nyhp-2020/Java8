package Interfacetest;

class BaseClass {
	public void foo() {
		System.out.println("BaseClass's foo");
	}
}

interface BaseInterface {
	default public void foo() {
		System.out.println("BaseInterface's foo");
	}
}

public class Diamond2 extends BaseClass implements BaseInterface {
	//If a base class and a base interface define methods
	//with the same signature, the method
	//definition in the class is used and
	//the interface definition is ignored
	public static void main(String[] args) {
		new Diamond2().foo();
	}
}