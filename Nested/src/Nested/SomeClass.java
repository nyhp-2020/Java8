package Nested;

public class SomeClass {
	Object someFunction() {
		return new Object() {
			@Override
			public String toString(){
				return "Anonymous!";
			};
		};
	}

	public static void main(String[] args) {
		SomeClass sc = new SomeClass();
		System.out.println(sc.someFunction());
	}
}
