import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Currency Converter");
        System.out.println("1. EUR (Euro)");
        System.out.println("2. USD (United States Dollar)");
        System.out.println("3. GBP (British Pound)");
        System.out.println("4. JPY (Japanese Yen)");
        System.out.print("Select the base currency (1/2/3/4): ");
        int baseCurrencyChoice = scanner.nextInt();

        System.out.println("Select the target currency (1/2/3/4): ");
        int targetCurrencyChoice = scanner.nextInt();

        System.out.print("Enter the amount to convert: ");
        double amountToConvert = scanner.nextDouble();

        double exchangeRate = getExchangeRate(baseCurrencyChoice, targetCurrencyChoice);
        double convertedAmount = amountToConvert * exchangeRate;

        String[] currencies = {"EUR", "USD", "GBP", "JPY"};
        String baseCurrency = currencies[baseCurrencyChoice - 1];
        String targetCurrency = currencies[targetCurrencyChoice - 1];

        System.out.println(amountToConvert + " " + baseCurrency + " is equivalent to " + convertedAmount + " " + targetCurrency);
    }

    public static double getExchangeRate(int baseCurrencyChoice, int targetCurrencyChoice) {
      
        double[] exchangeRates = {0.85, 1.0, 0.73, 110.0};
        return exchangeRates[targetCurrencyChoice - 1] / exchangeRates[baseCurrencyChoice - 1];
    }
}
