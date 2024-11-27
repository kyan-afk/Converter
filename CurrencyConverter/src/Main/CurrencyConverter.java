package Main;

import java.awt.EventQueue;

import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.*;

public class CurrencyConverter extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField jtxtAmount;
	private JTextField jtxtAmountConverted;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CurrencyConverter frame = new CurrencyConverter();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public CurrencyConverter() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 768, 559);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(20, 11, 714, 93);
		panel.setBorder(new LineBorder(new Color(64, 128, 128), 20, true));
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Currency Converter ");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 34));
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setBounds(182, 26, 377, 41);
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(20, 413, 714, 93);
		panel_1.setBorder(new LineBorder(new Color(64, 128, 128), 20, true));
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
		
		JButton btnNewButton_1_1 = new JButton("Exit");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			
			private JFrame frame;
			public void actionPerformed(ActionEvent e) {
				
		        frame = new JFrame("Exit");
		        // Show a confirmation dialog and store the result
		        int result = JOptionPane.showConfirmDialog(frame, "Thank you. Do you really want to exit?");
		        
		        // Check if the user clicked "Yes"
		        if (result == JOptionPane.YES_OPTION) {
		            System.exit(0);

				}
		                 
			}
		});
		btnNewButton_1_1.setForeground(Color.BLACK);
		btnNewButton_1_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_1_1.setBackground(UIManager.getColor("Button.background"));
		btnNewButton_1_1.setBounds(537, 30, 130, 32);
		panel_1.add(btnNewButton_1_1);
		
		JButton btnNewButton_1_2 = new JButton("Convert");
		btnNewButton_1_2.setForeground(Color.BLACK);
		btnNewButton_1_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_1_2.setBackground(UIManager.getColor("Button.background"));
		btnNewButton_1_2.setBounds(68, 30, 130, 32);
		panel_1.add(btnNewButton_1_2);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(20, 115, 714, 227);
		panel_2.setBorder(new LineBorder(new Color(64, 128, 128), 20, true));
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Amount");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_1.setBounds(57, 38, 191, 36);
		panel_2.add(lblNewLabel_1);
		
		jtxtAmount = new JTextField();
		jtxtAmount.setFont(new Font("Tahoma", Font.PLAIN, 20));
		jtxtAmount.setBounds(298, 45, 370, 34);
		panel_2.add(jtxtAmount);
		jtxtAmount.setColumns(10);
		
		JLabel lblNewLabel_1_1 = new JLabel("From Currency");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_1_1.setBounds(57, 94, 191, 36);
		panel_2.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("To Currency");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_1_2.setBounds(57, 153, 191, 36);
		panel_2.add(lblNewLabel_1_2);
		
		JComboBox jfrom = new JComboBox();
		jfrom.setFont(new Font("Tahoma", Font.PLAIN, 20));
		jfrom.setModel(new DefaultComboBoxModel(new String[] {"from", "2", "3"}));
		jfrom.setBounds(298, 101, 370, 34);
		panel_2.add(jfrom);
		
		JComboBox jto = new JComboBox();
		jto.setFont(new Font("Tahoma", Font.PLAIN, 20));
		jto.setModel(new DefaultComboBoxModel(new String[] {"to", "1", "2"}));
		jto.setBounds(298, 155, 370, 34);
		panel_2.add(jto);
		
		jtxtAmountConverted = new JTextField();
		jtxtAmountConverted.setFont(new Font("Tahoma", Font.PLAIN, 20));
		jtxtAmountConverted.setColumns(10);
		jtxtAmountConverted.setBounds(322, 360, 368, 34);
		contentPane.add(jtxtAmountConverted);
		
		JLabel lblNewLabel_1_3 = new JLabel("Amount Converted");
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_1_3.setBounds(80, 353, 216, 36);
		contentPane.add(lblNewLabel_1_3);
	}
}
