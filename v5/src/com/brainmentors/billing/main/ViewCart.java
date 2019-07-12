package com.brainmentors.billing.main;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.print.PrinterException;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import com.brainmentors.billing.model.Product;
import com.brainmentors.billing.model.ProductTableModel;
import com.brainmentors.billing.utils.MailSender;

public class ViewCart extends JFrame {

	private JPanel contentPane;
	private JTable table;

	private void printIt() {
		try {
			table.print();
			MailSender.sendMail();
		} catch (PrinterException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public ViewCart(ArrayList<Product> list) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblItemsInCart = new JLabel("Items in Cart");
		lblItemsInCart.setForeground(Color.RED);
		lblItemsInCart.setHorizontalAlignment(SwingConstants.CENTER);
		lblItemsInCart.setFont(new Font("Lucida Grande", Font.BOLD, 20));
		lblItemsInCart.setBounds(96, 31, 218, 16);
		contentPane.add(lblItemsInCart);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(21, 82, 335, 190);
		contentPane.add(scrollPane);
		ProductTableModel model = new ProductTableModel(list);
		table = new JTable(model);
		scrollPane.setViewportView(table);
		
		JButton btnPrint = new JButton("Print");
		btnPrint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			printIt();
			}
		});
		btnPrint.setBounds(6, 29, 117, 29);
		contentPane.add(btnPrint);
	}
}
