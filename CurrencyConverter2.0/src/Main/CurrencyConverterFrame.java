package Main;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.EventQueue;
import java.awt.Color;
import java.awt.Font;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CurrencyConverterFrame extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField jtxtAmount;
    private JTextField jtxtAmountConverted;

    // Constructor for creating the JFrame
    public CurrencyConverterFrame() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 1323, 876);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPane);
        contentPane.setLayout(null);
        
        JPanel panel = new JPanel();
        panel.setBackground(new Color(255, 192, 203));
        panel.setBounds(287, 11, 714, 93);
        panel.setBorder(new LineBorder(new Color(30, 144, 255), 20, true));
        contentPane.add(panel);
        panel.setLayout(null);
        
        JLabel lblNewLabel = new JLabel("Currency Converter ");
        lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 34));
        lblNewLabel.setForeground(new Color(0, 0, 0));
        lblNewLabel.setBounds(182, 24, 377, 41);
        panel.add(lblNewLabel);
        
        JPanel panel_1 = new JPanel();
        panel_1.setBackground(new Color(255, 192, 203));
        panel_1.setBounds(287, 509, 714, 93);
        panel_1.setBorder(new LineBorder(new Color(30, 144, 255), 20, true));
        contentPane.add(panel_1);
        panel_1.setLayout(null);
        
        JButton btnNewButton_1 = new JButton("Reset");
        btnNewButton_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                jtxtAmountConverted.setText("");
                jtxtAmount.setText("");
            }
        });
        btnNewButton_1.setForeground(Color.BLACK);
        btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 20));
        btnNewButton_1.setBackground(UIManager.getColor("Button.background"));
        btnNewButton_1.setBounds(297, 30, 130, 32);
        panel_1.add(btnNewButton_1);
        
        JButton btnExit = new JButton("Exit");
        btnExit.addActionListener(new ActionListener() {
            private JFrame frame;
            public void actionPerformed(ActionEvent e) {
                frame = new JFrame("Exit");
                int result = JOptionPane.showConfirmDialog(frame, "Thank you. Do you really want to exit?");
                if (result == JOptionPane.YES_OPTION) {
                    System.exit(0);
                }
            }
        });
        btnExit.setForeground(Color.BLACK);
        btnExit.setFont(new Font("Tahoma", Font.BOLD, 20));
        btnExit.setBackground(UIManager.getColor("Button.background"));
        btnExit.setBounds(537, 30, 130, 32);
        panel_1.add(btnExit);
        
        JButton btnConvert = new JButton("Convert");
        btnConvert.setForeground(Color.BLACK);
        btnConvert.setFont(new Font("Tahoma", Font.BOLD, 20));
        btnConvert.setBackground(UIManager.getColor("Button.background"));
        btnConvert.setBounds(68, 30, 130, 32);
        panel_1.add(btnConvert);
        
        JPanel panel_2 = new JPanel();
        panel_2.setBackground(new Color(255, 192, 203));
        panel_2.setBounds(287, 200, 714, 277);
        panel_2.setBorder(new LineBorder(new Color(30, 144, 255), 20, true));
        contentPane.add(panel_2);
        panel_2.setLayout(null);
        
        JLabel lblNewLabel_1 = new JLabel("Amount");
        lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 25));
        lblNewLabel_1.setBounds(57, 38, 191, 36);
        panel_2.add(lblNewLabel_1);
        
        jtxtAmount = new JTextField();
        jtxtAmount.setFont(new Font("Tahoma", Font.PLAIN, 20));
        jtxtAmount.setBounds(298, 40, 370, 34);
        panel_2.add(jtxtAmount);
        jtxtAmount.setColumns(10);
        
        JLabel lblFromCurrency = new JLabel("From Currency");
        lblFromCurrency.setFont(new Font("Tahoma", Font.PLAIN, 25));
        lblFromCurrency.setBounds(57, 94, 191, 36);
        panel_2.add(lblFromCurrency);
        
        JLabel lblToCurrency = new JLabel("To Currency");
        lblToCurrency.setFont(new Font("Tahoma", Font.PLAIN, 25));
        lblToCurrency.setBounds(57, 141, 191, 36);
        panel_2.add(lblToCurrency);
        
        JComboBox<String> jfrom = new JComboBox<>();
        jfrom.setFont(new Font("Tahoma", Font.PLAIN, 20));
        jfrom.setModel(new DefaultComboBoxModel<>(new String[] {"USD", "EUR", "JPY", "GBP", "CAD", "AUD", "CNY", "PHP", "CHF", "INR", "KRW", "MXN"}));
        jfrom.setBounds(298, 97, 370, 34);
        panel_2.add(jfrom);
        
        JComboBox<String> jto = new JComboBox<>();
        jto.setFont(new Font("Tahoma", Font.PLAIN, 20));
        jto.setModel(new DefaultComboBoxModel<>(new String[] {"USD", "EUR", "JPY", "GBP", "CAD", "AUD", "CNY", "PHP", "CHF", "INR", "KRW", "MXN"}));
        jto.setBounds(298, 144, 370, 34);
        panel_2.add(jto);
        
        JLabel lblAmountConverted = new JLabel("Amount Converted");
        lblAmountConverted.setBounds(57, 198, 216, 36);
        panel_2.add(lblAmountConverted);
        lblAmountConverted.setFont(new Font("Tahoma", Font.PLAIN, 25));
        
        jtxtAmountConverted = new JTextField();
        jtxtAmountConverted.setBounds(298, 202, 368, 34);
        panel_2.add(jtxtAmountConverted);
        jtxtAmountConverted.setFont(new Font("Tahoma", Font.PLAIN, 20));
        jtxtAmountConverted.setColumns(10);
        
        JLabel lblNewLabel_2 = new JLabel("New label");
        lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\Oliver Colao\\Desktop\\Eclips\\CurrencyConverter2.0\\src\\Main\\backround.png"));
        lblNewLabel_2.setBounds(-11, 0, 1327, 847);
        contentPane.add(lblNewLabel_2);
        
        // Action to perform conversion
        btnConvert.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    double amount = InputValidator.validateAndGetValue(jtxtAmount.getText());
                    String fromCurrency = (String) jfrom.getSelectedItem();
                    String toCurrency = (String) jto.getSelectedItem();
                    double convertedAmount = CurrencyConverterUtil.convertCurrency(amount, fromCurrency, toCurrency);
                    jtxtAmountConverted.setText(String.format("%.2f", convertedAmount));
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Please enter a valid number for the amount.");
                }
            }
        });
    }
}