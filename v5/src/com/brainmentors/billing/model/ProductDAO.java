package com.brainmentors.billing.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import org.apache.commons.codec.language.bm.Rule.RPattern;

import com.brainmentors.billing.utils.CommonDAO;

public interface ProductDAO extends CommonDAO {
	
	public static Product getProductByName(String name) throws ClassNotFoundException, SQLException {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		Product product = null;
		try {
			con = CommonDAO.getConnection();
			pstmt = con.prepareStatement("select id, name, "
					+ "price, descr, imgpath,"
					+ " qt from product_mst where name=?");
			 pstmt.setString(1, name);
			 rs = pstmt.executeQuery();
			 if(rs.next()) {
				 product= new Product();
				 product.setId(rs.getInt("id"));
				 product.setName(rs.getString("name"));
				 product.setDesc(rs.getString("descr"));
				 product.setPrice(rs.getDouble("price"));
				 product.setQuantity(rs.getInt("qt"));
				 product.setPath(rs.getString("imgpath"));
			 }
				 
			
		}
		finally {
			if(rs!=null) {
				rs.close();
			}
			if(pstmt!=null) {
				pstmt.close();
			}
		}
		return product;
		
	}
	
	public static ArrayList<String> getProductNames() throws ClassNotFoundException, SQLException{
		
		ArrayList<String> names = new ArrayList<>();
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
		con = CommonDAO.getConnection();
		pstmt = con.prepareStatement("select  name from product_mst");
		rs = pstmt.executeQuery();
		while(rs.next()) {
			names.add(rs.getString("name"));
		}
		}
		finally {
			if(rs!=null) {
			rs.close();
			}
			if(pstmt!=null) {
			pstmt.close();
			}
		}
		return names;
	}
	public static boolean bulkUpload(ArrayList<Product> productList) throws ClassNotFoundException, SQLException {
		Connection con = null;
		PreparedStatement pstmt = null;
		if(productList==null) {
			return false;
		}
		if(productList.size()==0) {
			return false;
		}
		
		con = CommonDAO.getConnection();
		con.setAutoCommit(false);
		pstmt = con.prepareStatement("insert into product_mst "
				+ "(id, name, descr, price, imgpath, qt) values(?,?,?,?,?,?) ");
		for(Product product :productList) {
			pstmt.setInt(1,product.getId() );
			pstmt.setString(2, product.getName());
			pstmt.setString(3, product.getDesc());
			pstmt.setDouble(4, product.getPrice());
			pstmt.setString(5, product.getPath());
			pstmt.setInt(6, product.getQuantity());
			pstmt.addBatch();
			
		}
		
		int results[] = pstmt.executeBatch();
		boolean rollBack = false;
		for(int r : results) {
			if(r<=0) {
				rollBack = true;
				break;
			}
		}
		if(rollBack) {
			con.rollback();
			return false;
		}
		else {
		con.commit();
		return true;
		}
	}

}
