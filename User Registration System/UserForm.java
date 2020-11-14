package project;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.text.JTextComponent;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JComboBox;
import javax.swing.JPasswordField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.*;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;

public class UserForm extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UserForm frame = new UserForm();
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
	Connection con=null;
	protected JTextComponent textArea;
	public UserForm() {
		con=DB.dbConnect();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 529);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(222, 184, 135));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(195, 104, 156, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(195, 135, 156, 20);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(195, 165, 156, 20);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(195, 234, 156, 20);
		contentPane.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(195, 322, 156, 20);
		contentPane.add(textField_4);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(195, 265, 156, 46);
		contentPane.add(textArea);
		
		JComboBox comboBox = new JComboBox();
		comboBox.addItem("Male");
		comboBox.addItem("Female");
		comboBox.addItem("Other");
		comboBox.setBounds(195, 201, 86, 22);
		contentPane.add(comboBox);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(195, 353, 156, 20);
		contentPane.add(passwordField);
		
		JLabel lblNewLabel = new JLabel("First Name");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel.setBounds(33, 107, 68, 17);
		contentPane.add(lblNewLabel);
		
		JLabel lblLastName = new JLabel("Middle Name");
		lblLastName.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblLastName.setBounds(33, 138, 68, 14);
		contentPane.add(lblLastName);
		
		JLabel lblLastName_1 = new JLabel("Last Name");
		lblLastName_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblLastName_1.setBounds(33, 168, 68, 14);
		contentPane.add(lblLastName_1);
		
		JLabel lblGender = new JLabel("Gender");
		lblGender.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblGender.setBounds(33, 205, 68, 14);
		contentPane.add(lblGender);
		
		JLabel lblEmailId = new JLabel("E-mail Id");
		lblEmailId.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblEmailId.setBounds(33, 237, 68, 14);
		contentPane.add(lblEmailId);
		
		JLabel lblAddress = new JLabel("Address");
		lblAddress.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblAddress.setBounds(33, 282, 68, 14);
		contentPane.add(lblAddress);
		
		JLabel lblUserid = new JLabel("UserId");
		lblUserid.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblUserid.setBounds(33, 325, 68, 14);
		contentPane.add(lblUserid);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblPassword.setBounds(33, 356, 68, 14);
		contentPane.add(lblPassword);
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String first=textField.getText();
					String middle=textField_1.getText();
					String last=textField_2.getText();
					String gender=(String) comboBox.getSelectedItem();
					String email=textField_3.getText();
					String address=textArea.getText();
					String userid=textField_4.getText();
					String password=passwordField.getText();
					
					//using PreparedStatement to write parameterized query-----
					PreparedStatement pstmt=con.prepareStatement("insert into userdata(First_Name,Middle_Name,Last_Name,Gender,Email_id,Address,Userid,Password) values(?,?,?,?,?,?,?,?)");
					
					pstmt.setString(1,first);
					pstmt.setString(2,middle);
					pstmt.setString(3,last);
					pstmt.setString(4,gender);
					pstmt.setString(5,email);
					pstmt.setString(6,address);
					pstmt.setString(7,userid);
					pstmt.setString(8,password);
					pstmt.executeUpdate();
					JOptionPane.showMessageDialog(null, "Data added Successfully");
					textField.setText("");
					textField_1.setText("");
					textField_2.setText("");
					textField_3.setText("");
					textArea.setText("");
					textField_4.setText("");
					passwordField.setText("");
					
					
				}
				catch(Exception e1){
					e1.printStackTrace();
				}
			}
		});
		btnNewButton.setBounds(150, 415, 89, 23);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("User Registration Form");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1.setBounds(115, 45, 206, 32);
		contentPane.add(lblNewLabel_1);
	}
}
