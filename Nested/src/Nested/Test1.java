package Nested;

class OuterClass{
	private static String msgstat = "Private Class message of OuterClass";
	private String msginst = "Private Instance message of OuterClass";
	public static String msgstatpu = "Public Class message of OuterClass";
	public String msginstpu = "Public Instance message of OuterClass";
	// Static nested class
	static class NestedStaticClass{
		int number = 7;  //instance memeber
		static int numstat = 9; //static member
		public void printMessage(){//instance method
			System.out.println(msgstat);
			System.out.println(number);
			System.out.println(numstat);
			//System.out.println(msginst);
			// Only static members of Outer class 
	        // is directly accessible in nested 
	        // static class  
		}
		
		public static void increment(){ //static method
			numstat++;
			//number++; //can not access (instance member)
		}
		
	}
	
	// Non-static nested class - 
    // also called Inner class 
	class InnerClass{
		//static int i = 10; //not enabled static member or method!
		int i=11; //this is OK.
		public void display(){
			// Both static and non-static members 
	        // of Outer class are accessible in 
	        // this Inner class 
			System.out.println(msgstat);
			System.out.println(msginst);
		}
	}
	
	public void print(){
		// Both static and non-static members 
        // of Outer class are accessible from OuterClass
		System.out.println(msgstat);
		System.out.println(msginst);
	}
}

public class Test1 {
	public static void main(String[] args) {
		// Create instance of nested Static class
		//(withouth an instance of OuterClass)
		OuterClass.NestedStaticClass printer =
				new OuterClass.NestedStaticClass();
		printer.printMessage();
		
		// In order to create instance of 
        // Inner class we need an Outer class 
        // instance. Let us create Outer class 
        // instance for creating 
        // non-static nested class 
		OuterClass outer = new OuterClass();
		OuterClass.InnerClass inner = outer.new InnerClass();
		inner.display();
		
		outer.print();
		
		System.out.println(outer.msgstatpu);
		System.out.println(OuterClass.msgstatpu);
		//System.out.println(OuterClass.msgstat); //not visible (if private)
		System.out.println(outer.msginstpu);
		
		//in one step
		OuterClass.InnerClass inner2 = new OuterClass().new InnerClass();
		inner2.display();
		// instance variable of printer
		System.out.println(printer.number);
		//class variable of printer (static)
		System.out.println(printer.numstat);
		//class variable of NestedStaticClass (static)
		System.out.println(OuterClass.NestedStaticClass.numstat);
		
		printer.increment();//increment of static value (numstat)
		
		// Create one more instance of nested Static class
		OuterClass.NestedStaticClass printer2 =
				new OuterClass.NestedStaticClass();
		
		System.out.println(printer2.numstat);
		System.out.println(OuterClass.NestedStaticClass.numstat);
		
		//System.out.println(OuterClass.NestedStaticClass.number);
		//OuterClass.NestedStaticClass.number;
		
		//member of non-static nested class
		System.out.println(inner2.i);
	}
}
