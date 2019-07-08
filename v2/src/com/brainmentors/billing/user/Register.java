package com.brainmentors.billing.user;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class Register extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;
	
	private void back() {
		this.setVisible(false);
		this.dispose();
		Login login = new Login();
		login.setVisible(true);
	}

	
	private void register() {
		String userid = textField.getText();
		
		String password = new String(passwordField.getPassword());
		UserDAO userDAO = new UserDAO();
		try {
			if(userDAO.isUserExist(userid)) {
				JOptionPane.showMessageDialog(this, "user already exist");
				return ;
			}
			boolean isAdded = userDAO.register(userid, password);
			JOptionPane.showMessageDialog(this
					, isAdded?"Record Added":"Not Added");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public Register() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 369, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Register");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setFont(new Font("Lucida Grande", Font.BOLD, 20));
		lblNewLabel.setBounds(112, 45, 119, 40);
		contentPane.add(lblNewLabel);
		
		JLabel lblUserid = new JLabel("Userid");
		lblUserid.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		lblUserid.setBounds(27, 109, 61, 16);
		contentPane.add(lblUserid);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		lblPassword.setBounds(27, 163, 84, 16);
		contentPane.add(lblPassword);
		
		textField = new JTextField();
		textField.setBounds(101, 105, 159, 26);
		contentPane.add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setEchoChar('#');
		passwordField.setBounds(112, 159, 136, 26);
		contentPane.add(passwordField);
		
		JButton btnLogin = new JButton("Register");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				register();
			}
		});
		btnLogin.setIcon(new ImageIcon(Login.class.getResource("/com/brainmentors/billing/user/login.png")));
		btnLogin.setBounds(6, 209, 119, 48);
		contentPane.add(btnLogin);
		
		JButton btnReset = new JButton("Reset");
		btnReset.setBounds(122, 219, 117, 29);
		contentPane.add(btnReset);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			back();
			}
		});
		btnBack.setBounds(8, 4, 117, 29);
		contentPane.add(btnBack);
		
		
		
	}
}
