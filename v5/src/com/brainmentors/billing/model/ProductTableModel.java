package com.brainmentors.billing.model;

import java.util.ArrayList;

import javax.swing.table.AbstractTableModel;

public class ProductTableModel extends AbstractTableModel{
	ArrayList<Product> products;
	String cols [] = {"S.No","PROD NAME", "PRICE", "QTY", "DESC"};
	public ProductTableModel(ArrayList<Product> products){
		this.products= products;
	}
	@Override
	public int getRowCount() {
		// TODO Auto-generated method stub
		return products.size();
	}

	@Override
	public int getColumnCount() {
		// TODO Auto-generated method stub
		return cols.length;
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		// TODO Auto-generated method stub
		System.out.println("getValueAt "+rowIndex+" Col "+columnIndex);
		if(columnIndex==0) {
			return products.get(rowIndex).getId();
		}
		
			if(columnIndex==1) {
				return products.get(rowIndex).getName();
			}
		if(columnIndex==2) {
			return products.get(rowIndex).getPrice();
		}
		if(columnIndex==3) {
			return products.get(rowIndex).getQuantity();
		}
		if(columnIndex==4) {
			return products.get(rowIndex).getDesc();
		}
		return null;
	}

}
