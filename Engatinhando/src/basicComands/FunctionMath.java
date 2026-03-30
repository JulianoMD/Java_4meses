package src.basicComands;

public class FunctionMath {
	public static void main(String[] args) {
		
		double x = 4.0;
		double y = 2.0;
		double z = -3.5;
		
		double a = Math.sqrt(x); // square root of x
		double b = Math.pow(x, y); // x raised to the power of y
		double c = Math.abs(z); // value as absolute
		double d = Math.ceil(z); // smallest integer greater than or equal to x
		double e = Math.floor(z); // largest integer less than or equal to x
		
		IO.println("Square root of " + x + " is: " + a);
		IO.println(x + " raised to the power of " + y + " is: " + b);
		IO.println("Absolute value of " + z + " is: " + c);
		IO.println("Ceiling of " + z + " is: " + d);
		IO.println("Floor of " + z + " is: " + e);
		
		
		// Delta = b^2 - 4ac
		double delta = Math.pow(y, 2.0) - 4 * x * z; // calculate the discriminant
		
		double x1 = (-y + Math.sqrt(delta)) / (2 * x); // calculate the first root
		double x2 = (-y - Math.sqrt(delta)) / (2 * x); // calculate
		
		System.out.printf("The roots of the equation are x1: %n" + x1 + "%nand x2: " + x2);
		
	}
}
