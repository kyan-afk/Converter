package Main;

public class InputValidator {
    public static double validateAndGetValue(String input) throws NumberFormatException {
        double value;
        try {
            value = Double.parseDouble(input);
            if (value < 0) {
                throw new NumberFormatException("Negative values are not allowed");
            }
        } catch (NumberFormatException e) {
            throw new NumberFormatException("Invalid number entered: " + input);
        }
        return value;
    }
}
