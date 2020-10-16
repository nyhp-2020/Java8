package Nested;

/*abstract class Shape {
	// already defined in this package
}*/

public class StatusReporter2 {

	static Shape.Color getDescriptiveColor(final Shape.Color color) {
		// note the use of anonymous inner classes here
		// -- specifically, there is no name for the class and we construct
		// and use the class "on the fly" in the return statement!
		return new Shape.Color() { // This is an anonymous inner class
									// after new statement
			// overrides the base class Shape.Color toString() method
			public String toString() {
				return "You selected a color with RGB values" + color;
			}
		};
	}

	public static void main(String[] args) {
		Shape.Color descriptiveColor = StatusReporter2.getDescriptiveColor(new Shape.Color(100, 101, 102));
		System.out.println(descriptiveColor);// call overridden toString()
												// method
	}
}
