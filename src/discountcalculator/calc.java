package discountcalculator;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class calc {

	private JFrame frame;
	private JTextField text1;
	private JTextField text2;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calc window = new calc();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public calc() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 350);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("PRICIPAL AMOUNT");
		lblNewLabel.setBounds(48, 89, 135, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("DISCOUNT  PERCENTAGE");
		lblNewLabel_1.setBounds(49, 138, 146, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		text1 = new JTextField();
		text1.setBounds(245, 86, 86, 20);
		frame.getContentPane().add(text1);
		text1.setColumns(10);
		
		text2 = new JTextField();
		text2.setBounds(245, 135, 86, 20);
		frame.getContentPane().add(text2);
		text2.setColumns(10);
		
		JButton btnNewButton = new JButton("CALCULATE");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int lblNewLabel=Integer.parseInt(text1.getText());
				int lblNewLabel_1=Integer.parseInt(text2.getText());
				int net = (lblNewLabel*lblNewLabel_1)/100;
				int price = lblNewLabel - net;
				textField_2.setText(String.valueOf(price));
			}
		});
		btnNewButton.setBounds(114, 176, 123, 23);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_2 = new JLabel("DISCOUNT CALCULATOR");
		lblNewLabel_2.setBounds(126, 36, 188, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Rs");
		lblNewLabel_3.setBounds(341, 89, 46, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("%");
		lblNewLabel_4.setBounds(341, 138, 46, 14);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("NET PRICE");
		lblNewLabel_5.setBounds(48, 230, 100, 14);
		frame.getContentPane().add(lblNewLabel_5);
		
		textField_2 = new JTextField();
		textField_2.setBounds(245, 227, 86, 20);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("Rs");
		lblNewLabel_6.setBounds(341, 230, 46, 14);
		frame.getContentPane().add(lblNewLabel_6);
	}
}
