package com.brainmentors.billing.main;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.brainmentors.billing.utils.ConfigReader;
import com.brainmentors.billing.utils.ExcelReader;

public class DashBoard extends JFrame {

	private JPanel contentPane;
	
	private void doUpload() {
		JFileChooser browse = 
				new JFileChooser(ConfigReader.getValue(ConfigReader.BROWSE_PATH));
		browse.showOpenDialog(this);
		File file = browse.getSelectedFile();
		try {
			ExcelReader.readXLS(file);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(file.getPath());
	}
	
	private void createMenu() {
		JMenuBar menuBar = new JMenuBar();
		this.setJMenuBar(menuBar);
		JMenu admin =new JMenu("Admin");
		menuBar.add(admin);
		JMenuItem upload = new JMenuItem("Upload");
		upload.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				doUpload();
			}
		});
		admin.add(upload);
		admin.addSeparator();
		JMenuItem exit = new JMenuItem("Exit");
		admin.add(exit);
		
		
	}
	
	

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
		createMenu();
	}

}
