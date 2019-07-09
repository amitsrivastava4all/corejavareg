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
		ArrayList<Product> productList = new ArrayList<>();
		if(!file.exists()) {
			return null;
		}
		FileInputStream fs = new FileInputStream(file);
		HSSFWorkbook workBook = new HSSFWorkbook(fs);
		HSSFSheet sheet = workBook.getSheetAt(9);
		Iterator<Row> rows = sheet.rowIterator();
		while(rows.hasNext()) {
			Row currentRow = rows.next();
			Iterator<Cell> cells = currentRow.cellIterator();
			while(cells.hasNext()) {
				Cell currentCell = cells.next();
				if(currentCell.getCellType()==CellType.STRING) {
					System.out.println(currentCell.getStringCellValue());
				}
				else
				if(currentCell.getCellType()==CellType.NUMERIC) {	
					System.out.println(currentCell.getNumericCellValue());	
				}
			}
		}
		workBook.close();
		fs.close();
		return productList;
	}

}
