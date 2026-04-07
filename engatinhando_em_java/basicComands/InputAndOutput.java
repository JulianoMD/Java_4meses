package basicComands;

import java.util.Scanner;

public class InputAndOutput {
public static void main(String[] args) {

	// Comandos de saida de dados
	String product1 = "Computer";
	String product2 = "Office Desk";

	int age = 30;
	int code = 5290;
	char gender = 'F';

	double price1 = 2100.0;
	double price2 = 650.50;
	double measure = 53.234567;

	IO.println("Products: ");
	System.out.printf("%s, which price is  $ %f %n", product1, price1);
	System.out.printf("%s, which price is $ %f %n%n", product2, price2);
	System.out.printf("Record: %d years old, code %d and gender: %s %n%n", age, code, gender);
	System.out.printf("Measure with  eight decimal places: %.9f %n", measure);
	System.out.printf("Rouded (three decimal places): %.3f %n", measure);
	System.out.printf("US decimal point: %.2f %n", measure);

	// Comandos de entrada de dados

	Scanner sc = new Scanner(System.in);

	String x;
	int y;
	double z;

	System.out.println("Enter a string: ");
	x = sc.nextLine();
	System.out.println("Enter an integer: ");
	y = sc.nextInt();
	System.out.println("Enter a double: ");
	z = sc.nextDouble();
	
	IO.println("You entered: " + x);
	IO.println("You entered: " + y);
	IO.println("You entered: " + z);
	
	int a;
	String s1, s2, s3;
	
	IO.println("Test 2: Enter an integer: ");
	a = sc.nextInt();
	sc.nextLine(); // Consume the remaining newline character
	IO.println("Test 2: Enter three strings: ");
	s1 = sc.nextLine();
	s2 = sc.nextLine();
	s3 = sc.nextLine();
	
	IO.println("You entered: " + a);
	IO.println("You entered: " + s1);
	IO.println("You entered: " + s2);
	IO.println("You entered: " + s3);
	
	
	sc.close();
}
}