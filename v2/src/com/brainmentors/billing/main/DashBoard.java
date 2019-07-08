package com.brainmentors.billing.main;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;

public class DashBoard extends JFrame {

	private JPanel contentPane;

	
	
	

	/**
	 * Create the frame.
	 */
	public DashBoard(String userid) {
		setTitle("DASHBOARD");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel welcomelbl = new JLabel("Welcome "+userid);
		welcomelbl.setForeground(Color.RED);
		welcomelbl.setFont(new Font("Lucida Grande", Font.BOLD, 18));
		welcomelbl.setBounds(22, 6, 264, 39);
		contentPane.add(welcomelbl);
	}

}
