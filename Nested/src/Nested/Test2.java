package Nested;

class Outer {
	static int i=0; // it's OK.
	public void outerMethod() {
		//static int i=0; Variables can not be static here in local scope!
		
		//effectively final
		String str = "value";
		//final
		final String str1 = "value1";
		//str = "urzurtzu";
		//str can not be modified from anywhere if it referenced from local inner scope
		//So it must be effectively final...
		
		//str1 = "jhfghjfghj"; //not possible because it is final
		System.out.println("outerMethod");
		System.out.println(str);
		// local inner class. It can not be static
		class LocalInner {
			String listr = str; //*
			private void innerMethod() {
				//Local variable str defined in an enclosing scope (outerMethod)
				//must be final or effectively final
				//IF it referenced from local inner class... (see *)
				
				//str = "erqwer"; //not possible //*
				//str1 = "poiu"; //not possible
				listr = str1; //
				System.out.println(str + str1 + listr); //*
			}
		}
		//Variables accessed by local inner classes are considered
		//effectively final.
		
		LocalInner localinner = new LocalInner();
		localinner.innerMethod();
	}
	
	public void outherMethod2(){
		//unkownn type...
		//LocalInner localinner2 = new LocalInner();
	}
}

public class Test2 {
	public static void main(String[] args) {
		Outer outer = new Outer();
		outer.outerMethod();
		//unkonwn type...
		//LocalInner localinner2 = new LocalInner();
	}
}
