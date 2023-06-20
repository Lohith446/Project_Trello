package com.trello.Project.Genaricutility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility {
	/**
	 * This method is used to read the string data from the excel sheet.
	 * @author Lohith
	 * @return cellstringvalue
	 * @throws IOException 
	 * @throws FileNotFoundException 
	 * @throws EncryptedDocumentException 
	 */

	
	
	
	public String readStringData(String SheetName, int rowIndex , int columnIndex) throws EncryptedDocumentException, FileNotFoundException, IOException {
	Workbook workBook = WorkbookFactory.create(new FileInputStream("./test/src/resources/trelloworkbook"));
	String value = workBook.getSheet(SheetName).getRow(rowIndex).getCell(columnIndex).getStringCellValue();
	return value;
	}
	
	/**
	 * This method is used to read the string data from the excel sheet.
	 * @author Lohith
	 * @return cellstringvalue
	 * @throws IOException 
	 * @throws FileNotFoundException 
	 * @throws EncryptedDocumentException 
	 */ 
	public double sellNumericData(String SheetName, int rowIndex , int columnIndex) throws EncryptedDocumentException, FileNotFoundException, IOException {
	Workbook workBook = WorkbookFactory.create(new FileInputStream("./test/src/resources/trelloworkbook"));
	double value = workBook.getSheet(SheetName).getRow(rowIndex).getCell(columnIndex).getNumericCellValue();
	return value;	
	}
}
	
