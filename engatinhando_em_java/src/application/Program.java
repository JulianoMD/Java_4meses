package src.application;

import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		
		double xA, xB, xC, yA, yB, yC, areaTrianguloX, areaTrianguloY;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the measures of triangle X: ");
		xA = sc.nextDouble();
		xB = sc.nextDouble();
		xC = sc.nextDouble();
		
		System.out.println("Enter the measures of triangle Y: ");
		yA = sc.nextDouble();
		yB = sc.nextDouble();
		yC = sc.nextDouble();
		
		double p = (xA + xB + xC) / 2.0;
		areaTrianguloX = Math.sqrt(p * (p - xA) * (p - xB) * (p -  xC));
		
		p = (yA + yB + yC) / 2.0;
		areaTrianguloY = Math.sqrt(p * (p - yA) * (p - yB) * (p -  yC));
		
		System.out.printf("Area of triangle X: %.4f%n", areaTrianguloX);
		System.out.printf("Area of triangle Y: %.4f%n", areaTrianguloY);
		
		if (areaTrianguloX > areaTrianguloY) {
			System.out.println("Larger area: X");
		}else {
			System.out.println("Larger area: Y");
		}
		sc.close();
	}
}
