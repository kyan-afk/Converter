package Main;

public class CurrencyConverter {
    // Conversion rates
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

    private static final double EUR_TO_USD = 1 / USD_TO_EUR;
    private static final double JPY_TO_USD = 1 / USD_TO_JPY;
    private static final double GBP_TO_USD = 1 / USD_TO_GBP;
    private static final double CAD_TO_USD = 1 / USD_TO_CAD;
    private static final double AUD_TO_USD = 1 / USD_TO_AUD;
    private static final double CNY_TO_USD = 1 / USD_TO_CNY;
    private static final double PHP_TO_USD = 1 / USD_TO_PHP;
    private static final double CHF_TO_USD = 1 / USD_TO_CHF;
    private static final double INR_TO_USD = 1 / USD_TO_INR;
    private static final double KRW_TO_USD = 1 / USD_TO_KRW;
    private static final double MXN_TO_USD = 1 / USD_TO_MXN;

    public double convert(double amount, String fromCurrency, String toCurrency) {
        if (fromCurrency.equals(toCurrency)) {
            return amount; // No conversion needed
        }

        double inUSD = amount;
        // Convert from any currency to USD
        switch (fromCurrency) {
            case "EUR":
                inUSD = amount * EUR_TO_USD;
                break;
            case "GBP":
                inUSD = amount * GBP_TO_USD;
                break;
            case "JPY":
                inUSD = amount * JPY_TO_USD;
                break;
            case "AUD":
                inUSD = amount * AUD_TO_USD;
                break;
            case "CAD":
                inUSD = amount * CAD_TO_USD;
                break;
            case "CNY":
                inUSD = amount * CNY_TO_USD;
                break;
            case "PHP":
                inUSD = amount * PHP_TO_USD;
                break;
            case "CHF":
                inUSD = amount * CHF_TO_USD;
                break;
            case "INR":
                inUSD = amount * INR_TO_USD;
                break;
            case "KRW":
                inUSD = amount * KRW_TO_USD;
                break;
            case "MXN":
                inUSD = amount * MXN_TO_USD;
                break;
        }

        // Convert from USD to target currency
        switch (toCurrency) {
            case "EUR":
                return inUSD * USD_TO_EUR;
            case "GBP":
                return inUSD * USD_TO_GBP;
            case "JPY":
                return inUSD * USD_TO_JPY;
            case "AUD":
                return inUSD * USD_TO_AUD;
            case "CAD":
                return inUSD * USD_TO_CAD;
            case "CNY":
                return inUSD * USD_TO_CNY;
            case "PHP":
                return inUSD * USD_TO_PHP;
            case "CHF":
                return inUSD * USD_TO_CHF;
            case "INR":
                return inUSD * USD_TO_INR;
            case "KRW":
                return inUSD * USD_TO_KRW;
            case "MXN":
                return inUSD * USD_TO_MXN;
            default:
                return inUSD; // If toCurrency is USD
        }
    }
}