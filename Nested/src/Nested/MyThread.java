package Nested;

public class MyThread {
	public static void main(String[] args) {
		// Here we are using Anonymous Inner class
		// that extends a class i.e. Here a Thread class
		Thread t1 = new Thread() {
			public void run() {
				System.out.println("Child Thread");
			}
		};
		t1.start();
		System.out.println("Main Thread");
		
		
		//Here we are using Anonymous Inner class 
        //that implements a interface i.e. Here Runnable interface 
        Runnable r = new Runnable() 
        { 
            public void run() 
            { 
                System.out.println("Child Thread"); 
            } 
        }; 
        Thread t2 = new Thread(r); 
        t2.start(); 
        System.out.println("Main Thread");
        
        
        //Here we are using Anonymous Inner class 
        //that define inside argument, here constructor argument 
        Thread t3 = new Thread(new Runnable() 
        { 
            public void run() 
            { 
                System.out.println("Child Thread"); 
            } 
        }); 
          
        t3.start(); 
          
        System.out.println("Main Thread"); 
	}
}
