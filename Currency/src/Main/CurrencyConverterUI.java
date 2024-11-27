package Main;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

    public class CurrencyConverterUI {
    private CurrencyConverter converter;
    private ErrorHandler errorHandler;

    public CurrencyConverterUI() {
        converter = new CurrencyConverter();
        errorHandler = new ErrorHandler();

        JFrame frame = new JFrame("Currency Converter");
        JPanel panel = new JPanel();
        JComboBox<String> jfrom = new JComboBox<>(getCurrencies());
        JComboBox<String> jto = new JComboBox<>(getCurrencies());
        JTextField jtxtAmount = new JTextField(10);
        JTextField jtxtAmountConverted = new JTextField(10);
        JButton btnConvert = new JButton("Convert");

        panel.add(new JLabel("From:"));
        panel.add(jfrom);
        panel.add(new JLabel("To:"));
        panel.add(jto);
        panel.add(new JLabel("Amount:"));
        panel.add(jtxtAmount);
        panel.add(new JLabel("Converted Amount:"));
        panel.add(jtxtAmountConverted);
        panel.add(btnConvert);

        btnConvert.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    String amountStr = jtxtAmount.getText().trim();
                    if (amountStr.isEmpty() || amountStr.contains(" ")) {
                        throw new IllegalArgumentException("Amount cannot be empty or whitespace.");
                    }

                    double amount = Double.parseDouble(amountStr);
                    if (amount < 0) {
                        throw new IllegalArgumentException("Amount cannot be negative.");
                    }

                    String fromCurrency = (String) jfrom.getSelectedItem();
                    String toCurrency = (String) jto.getSelectedItem();
                    double convertedAmount = converter.convert(amount, fromCurrency, toCurrency);
                    jtxtAmountConverted.setText(String.format("%.2f", convertedAmount));

                } catch (NumberFormatException ex) {
                    errorHandler.showError("Please enter a valid number for the amount.");
                } catch (IllegalArgumentException ex) {
                    errorHandler.showError(ex.getMessage());
                } catch (Exception ex) {
                    errorHandler.showError("An unexpected error occurred: " + ex.getMessage());
                }
            }
        });

        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        frame.add(panel);
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    private String[] getCurrencies() {
        return new String[] {"USD", "EUR", "GBP", "JPY", "AUD", "CAD", "CNY", "PHP", "CHF", "INR", "KRW", "MXN"};
    }
}