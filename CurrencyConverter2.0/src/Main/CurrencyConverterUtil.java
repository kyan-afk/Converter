package Main;

public class CurrencyConverterUtil {
    // Conversion rates based on 1 USD
    private static final double USD_TO_EUR = 1.0531;
    private static final double USD_TO_JPY = 151.55;
    private static final double USD_TO_GBP = 0.792;
    private static final double USD_TO_CAD = 1.4064;
    private static final double USD_TO_AUD = 1.5403;
    private static final double USD_TO_CNY = 7.16;
    private static final double USD_TO_PHP = 56.25;
    private static final double USD_TO_CHF = 0.884;
    private static final double USD_TO_INR = 83.15;
    private static final double USD_TO_KRW = 1327.89;
    private static final double USD_TO_MXN = 17.35;

    public static double convertCurrency(double amount, String fromCurrency, String toCurrency) {
        double rateFromUSD = getRateFromUSD(fromCurrency);
        double rateToUSD = getRateToUSD(toCurrency);

        // Convert the amount to USD first and then to the target currency
        double amountInUSD = amount * rateFromUSD;
        return amountInUSD * rateToUSD;
    }

    private static double getRateFromUSD(String currency) {
        switch (currency) {
            case "USD": return 1;
            case "EUR": return 1 / USD_TO_EUR;
            case "JPY": return 1 / USD_TO_JPY;
            case "GBP": return 1 / USD_TO_GBP;
            case "CAD": return 1 / USD_TO_CAD;
            case "AUD": return 1 / USD_TO_AUD;
            case "CNY": return 1 / USD_TO_CNY;
            case "PHP": return 1 / USD_TO_PHP;
            case "CHF": return 1 / USD_TO_CHF;
            case "INR": return 1 / USD_TO_INR;
            case "KRW": return 1 / USD_TO_KRW;
            case "MXN": return 1 / USD_TO_MXN;
            default: return 0;
        }
    }

    private static double getRateToUSD(String currency) {
        switch (currency) {
            case "USD": return 1;
            case "EUR": return USD_TO_EUR;
            case "JPY": return USD_TO_JPY;
            case "GBP": return USD_TO_GBP;
            case "CAD": return USD_TO_CAD;
            case "AUD": return USD_TO_AUD;
            case "CNY": return USD_TO_CNY;
            case "PHP": return USD_TO_PHP;
            case "CHF": return USD_TO_CHF;
            case "INR": return USD_TO_INR;
            case "KRW": return USD_TO_KRW;
            case "MXN": return USD_TO_MXN;
            default: return 0;
        }
    }
}