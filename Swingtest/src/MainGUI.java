import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.util.Scanner;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.JTextArea;

public class MainGUI {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainGUI window = new MainGUI();
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
	public MainGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("SwingTest");
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		

		
		JLabel label = new JLabel("請輸入發牌人數： ");
		label.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		label.setBounds(80, 10, 140, 16);
		frame.getContentPane().add(label);
		
		textField = new JTextField();
		textField.setBounds(206, 6, 130, 26);
		frame.getContentPane().add(textField);
		textField.setColumns(16);

		
		
		JTextArea textArea = new JTextArea();
		textArea.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		textArea.setText("");
		textArea.setBounds(88, 60, 248, 140);
		frame.getContentPane().add(textArea);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Poker poker = new Poker();
				String A = textField.getText();
				String B = textArea.getText();
				int num = Integer.parseInt(A); 
				for(int a=1 ; a<= num ; a++) {
					
					B = B + poker.pokerRandom() +"\n";
					textArea.setText(B);
					//poker.pokerRandom();
				}
			
				
				
			}
		});
		btnNewButton.setBounds(149, 232, 117, 29);
		frame.getContentPane().add(btnNewButton);
		
		
		
	}
}
