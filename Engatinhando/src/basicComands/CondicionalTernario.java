package src.basicComands;

import java.util.Scanner;

public class CondicionalTernario {
	public static void main(String[] args) {

		int a = 10;
		int b = 20;

		// Syntax: (condition) ? expression_if_true : expression_if_false;
		int max = (a > b) ? a : b; 

		IO.println("The maximum of " + a + " and " + b + " is: " + max);

		// Using ternary operator to check if a number is even or odd
		String name = (10 != 3) ? "Barbara" : "Isabella";

		System.out.printf("The name is: %s%n", name);

		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the price of the product: ");
		
		double price = sc.nextDouble();
		double discount;
		
		if (price < 20.0)
			discount = 0; // no discount for prices less than 20
		else
			discount = price * 0.05; // 5% discount for prices 20 or more
		System.out.printf("%nDiscount: %.2f%n", discount);
		System.out.println("Final price: " + (price - discount));

		// Using ternary operator to calculate discount
		double discount2 = (price < 20.0) ? price : price * 0.05;
		System.out.printf("%nDiscount using ternary operator: %.2f%n", discount2);
		System.out.println("Final price: " + (price - discount2));

		sc.close();
	}
}
