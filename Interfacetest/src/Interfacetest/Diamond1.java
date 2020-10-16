package Interfacetest;

interface Interface1 {
	default public void foo() {
		System.out.println("Interface1's foo");
	}
}

interface Interface2 {
	default public void foo() {
		System.out.println("Interface2's foo");
	}
}

public class Diamond1 implements Interface1, Interface2 {
	//override foo
	public void foo() {
		Interface1.super.foo();
		Interface2.super.foo();
		System.out.println("Diamond1's foo");
	}

	public static void main(String[] args) {
		new Diamond1().foo();
	}
}