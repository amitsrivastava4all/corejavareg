package com.brainmentors.billing.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;

import com.brainmentors.billing.model.Product;


public interface ExcelReader {
	
	public static ArrayList<Product> readXLS(File file) throws IOException {
		boolean isFirstPass = true;
		ArrayList<Product> productList = new ArrayList<>();
		if(!file.exists()) {
			return null;
		}
		FileInputStream fs = new FileInputStream(file);
		HSSFWorkbook workBook = new HSSFWorkbook(fs);
		HSSFSheet sheet = workBook.getSheetAt(9);
		Iterator<Row> rows = sheet.rowIterator();
		
		while(rows.hasNext()) {
			int cellCounter = 1;
			Row currentRow = rows.next();
			if(isFirstPass) {
				isFirstPass = false;
				continue;
			}
			Iterator<Cell> cells = currentRow.cellIterator();
			Product product = new Product();
			while(cells.hasNext()) {
				Cell currentCell = cells.next();
				switch(cellCounter) {
				case 1:
					product.setId((int)currentCell.getNumericCellValue());
					break;
				case 2:
					product.setName(currentCell.getStringCellValue());
					break;
				case 3:
					product.setDesc(currentCell.getStringCellValue());
					break;
				case 4:
					product.setPrice(currentCell.getNumericCellValue());
					break;
				case 5:
					product.setPath(currentCell.getStringCellValue());
					break;
				case 6:
					product.setQuantity((int)currentCell.getNumericCellValue());
					break;
				}
				cellCounter++;
				
//				if(currentCell.getCellType()==CellType.STRING) {
//					System.out.println(currentCell.getStringCellValue());
//				}
//				else
//				if(currentCell.getCellType()==CellType.NUMERIC) {	
//					System.out.println(currentCell.getNumericCellValue());	
//				}
			} // Cell Loop Ends
			productList.add(product);
		} // Row Loop Ends
		workBook.close();
		fs.close();
		return productList;
	}

}
