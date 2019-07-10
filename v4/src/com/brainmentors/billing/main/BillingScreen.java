package com.brainmentors.billing.main;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.SQLException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import com.brainmentors.billing.model.Product;
import com.brainmentors.billing.model.ProductDAO;

public class BillingScreen extends JFrame {

	private JPanel contentPane;

	
	/**
	 * Create the frame.
	 */
	JComboBox comboBox = new JComboBox();
	private void fillCombo() {
		try {
			comboBox.addItem("Select Item");
			for(String name : ProductDAO.getProductNames()) {
				comboBox.addItem(name);
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	void search() {
		String selectedItem = (String)comboBox.getSelectedItem();
		System.out.println("Selected Item is "+selectedItem);
		try {
			Product product = ProductDAO.getProductByName(selectedItem);
			productPhoto.setIcon(new ImageIcon(BillingScreen.class.getResource(product.getPath())));
			productname.setText(product.getName());
			productprice.setText(String.valueOf(product.getPrice()));
			productdesc.setText(product.getDesc());
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	void askForClose() {
		int choice = JOptionPane.showConfirmDialog(this, "Do u want to leave this window","brain mentors",JOptionPane.YES_NO_OPTION);
		if(choice == JOptionPane.YES_OPTION) {
			this.setVisible(false);
			this.dispose();
		}
		
	}
	JLabel productPhoto = new JLabel("");
	JLabel productname = new JLabel("");
	JLabel productprice = new JLabel("");
	JLabel productdesc = new JLabel("");
			
	public BillingScreen() {
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				askForClose();
			}
		});
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		fillCombo();
		comboBox.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		comboBox.setBounds(160, 29, 180, 27);
		contentPane.add(comboBox);
		
		JLabel lblChooseItem = new JLabel("Choose Item");
		lblChooseItem.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		lblChooseItem.setBounds(18, 33, 142, 23);
		contentPane.add(lblChooseItem);
		
		JButton btnSearch = new JButton("Search");
		btnSearch.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				search();
				
			}
		});
		btnSearch.setBounds(231, 58, 117, 29);
		contentPane.add(btnSearch);
		
		
		productPhoto.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		productPhoto.setHorizontalAlignment(SwingConstants.CENTER);
		productPhoto.setBounds(10, 126, 400, 400);
		contentPane.add(productPhoto);
		
		productname.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		productname.setHorizontalAlignment(SwingConstants.CENTER);
		productname.setBounds(500, 126, 171, 27);
		contentPane.add(productname);
		
		
		productprice.setHorizontalAlignment(SwingConstants.CENTER);
		productprice.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		productprice.setBounds(500, 178, 171, 27);
		contentPane.add(productprice);
		
		
		productdesc.setHorizontalAlignment(SwingConstants.CENTER);
		productdesc.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		productdesc.setBounds(500, 227, 171, 27);
		contentPane.add(productdesc);
	}
}
