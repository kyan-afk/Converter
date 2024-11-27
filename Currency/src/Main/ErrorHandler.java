package Main;

import javax.swing.JOptionPane;

public class ErrorHandler {
    public void showError(String message) {
        JOptionPane.showMessageDialog(null, message, "Input Error", JOptionPane.ERROR_MESSAGE);
    }
}