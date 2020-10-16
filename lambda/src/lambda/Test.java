package lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

@FunctionalInterface
interface Square 
{ 
    int calculate(int x); 
} 

class Test {
	public static void main(String args[]) {
		// create anonymous inner class object
		new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("New thread created");
			}
		}).start();
		
		// builtin functional interface (Runnable interface)
		// functional interface using lambda expressions
		// lambda expression to create the object 
	    new Thread(()-> 
	       {System.out.println("New thread created");}).start();
	    
	    int a = 5; 
	    
	    // a user defined functional interface (Square interface).
        // lambda expression to define the calculate method 
        Square sq = (int x)->x*x;
              
        // parameter passed and return type must be 
        // same as defined in the prototype 
        int ans = sq.calculate(a); 
        System.out.println(ans);
        
        
     // create a list of strings 
        List<String> names = 
            Arrays.asList("Geek","GeeksQuiz","g1","QA","Geek2");
        
        // builtin functional interface (predicate interface)
        // declare the predicate type as string and use 
        // lambda expression to create object 
        Predicate<String> p = (s)->s.startsWith("G"); 
  
        // Iterate through the list 
        for (String st:names) 
        { 
            // call the test method 
            if (p.test(st)) 
                System.out.println(st); 
        }
      
     
     //the lambda expression implements Consumer Functional Interface.
     // Creating an ArrayList with elements 
        // {1, 2, 3, 4} 
		ArrayList<Integer> arrL = new ArrayList<Integer>(); 
        arrL.add(1); 
        arrL.add(2); 
        arrL.add(3); 
        arrL.add(4); 
  
        // Using lambda expression to print all elements 
        // of arrL 
        arrL.forEach(n -> System.out.println(n)); 
  
        // Using lambda expression to print even elements 
        // of arrL 
        arrL.forEach(n -> { if (n%2 == 0) System.out.println(n); }); 
	}
}
