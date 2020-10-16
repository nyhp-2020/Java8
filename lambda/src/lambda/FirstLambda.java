package lambda;

interface LambdaFunction{
	void call();
}


public class FirstLambda {
	
	// a user defined functional interface (LambdaFunction interface).
	public static void main(String[] args) {
		LambdaFunction lambdaFunction = () -> System.out.println("Hello World!");
		lambdaFunction.call();
	}

}
