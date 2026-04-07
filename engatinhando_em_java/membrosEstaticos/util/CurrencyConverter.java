package membrosEstaticos.util;

public class CurrencyConverter {
    public static final double IOF = 0.06;

    public static double realToDollar(double dollarAmount, double exchangeRate){
        return dollarAmount / exchangeRate;
    }

    public static double amountToPaidInReais(double dollarAmount, double exchangeRate){
        return dollarAmount * exchangeRate * (1.0 + IOF);
    }
}
