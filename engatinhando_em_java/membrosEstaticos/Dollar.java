package membrosEstaticos;

import membrosEstaticos.util.CurrencyConverter;

import java.util.Scanner;

public class Dollar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("What is the dollar exchange rate? ");
        double exchangeRate = sc.nextDouble();
        System.out.print("How many dollars will be bought? ");
        double dollars = sc.nextDouble();
        double amountToPaid = CurrencyConverter.amountToPaidInReais(dollars, exchangeRate);
        System.out.printf("Amount to be paid in reais = %.2f%n", amountToPaid);

        sc.close();
    }
}
