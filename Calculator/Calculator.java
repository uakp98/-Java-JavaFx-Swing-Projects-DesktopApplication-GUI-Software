import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
//import javax.swing.text.JTextComponent;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class Calculator {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	//private JLabel lblNewLabel_2;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
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
	public Calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(81, 51, 86, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(285, 51, 86, 20);
		frame.getContentPane().add(textField_1);
		
		JLabel lblNewLabel = new JLabel("1st Number");
		lblNewLabel.setFont(new Font("Arial Unicode MS", Font.PLAIN, 11));
		lblNewLabel.setBounds(10, 54, 61, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblndNumber = new JLabel("2nd Number");
		lblndNumber.setFont(new Font("Arial Unicode MS", Font.PLAIN, 11));
		lblndNumber.setBounds(207, 54, 68, 14);
		frame.getContentPane().add(lblndNumber);
		
		JLabel lblNewLabel_2 = new JLabel("CALCULATOR");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_2.setBounds(152, 11, 133, 29);
		frame.getContentPane().add(lblNewLabel_2);
		
		JButton btnNewButton = new JButton("Addition");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int n,m;
				n=Integer.parseInt(textField.getText());
				m=Integer.parseInt(textField_1.getText());
				int c=n+m;
				textField_2.setText(Integer.toString(c));
			}
		});
		btnNewButton.setBounds(20, 82, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnSubstraction = new JButton("Substraction");
		btnSubstraction.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int n,m;
				n=Integer.parseInt(textField.getText());
				m=Integer.parseInt(textField_1.getText());
				int c=n-m;
				textField_2.setText(Integer.toString(c));
			}
		});
		btnSubstraction.setBounds(20, 126, 89, 23);
		frame.getContentPane().add(btnSubstraction);
		
		JButton btnMultiplication = new JButton("Multiplication");
		btnMultiplication.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int n,m;
				n=Integer.parseInt(textField.getText());
				m=Integer.parseInt(textField_1.getText());
				int c=n*m;
				textField_2.setText(Integer.toString(c));
			}
		});
		btnMultiplication.setBounds(20, 172, 89, 23);
		frame.getContentPane().add(btnMultiplication);
		
		JButton btnDivision = new JButton("Division");
		btnDivision.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int n,m;
				n=Integer.parseInt(textField.getText());
				m=Integer.parseInt(textField_1.getText());
				int c=n/m;
				textField_2.setText(Integer.toString(c));
				/*using JLable------after that add private global variable name as "private JLabel lblNewLabel_2;" and delete the class name of this JLabel object..*/
				//lblNewLabel_2.setText(Integer.toString(c));	
			}
		});
		btnDivision.setBounds(20, 213, 89, 23);
		frame.getContentPane().add(btnDivision);
		
		textField_2 = new JTextField();
		textField_2.setBounds(189, 127, 123, 43);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		/*lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_2.setBounds(321, 192, 73, 33);
		frame.getContentPane().add(lblNewLabel_2);*/
	}

}
