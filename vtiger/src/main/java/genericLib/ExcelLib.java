package genericLib;

    import java.io.File;
	import java.io.FileInputStream;
	import java.io.FileNotFoundException;
	import java.io.IOException;
	import java.time.LocalDateTime;

	import org.apache.poi.EncryptedDocumentException;
	import org.apache.poi.ss.usermodel.Workbook;
	import org.apache.poi.ss.usermodel.WorkbookFactory;
	/***
	 * 
	 * @author Sindhu
	 *
	 */

	public class ExcelLib {
		
		static String excelPath="./src/test/resources/vtiger.xlsx";
		/**
		 * This method is used to read string data from an excel file
		 * @param sheetName provide the sheet name where test data is present
		 * @param rowNum provide the row number where test data is present
		 * @param cellNum provide the cell number which you want to read
		 * @return it returns the data in that respective sheet,row,cell in the form of String
		 */
		public static String readStringData(String sheetName,int rowNum,int cellNum)  {
			Workbook workbook=null;
			File absPath=new File(excelPath);
			FileInputStream fis;
			try {
				fis=new FileInputStream(absPath);
				workbook=WorkbookFactory.create(fis);
			}catch(FileNotFoundException e) {
				e.printStackTrace();
			}catch(EncryptedDocumentException e) {
				e.printStackTrace();
			}catch(IOException e) {
				e.printStackTrace();
			}
			return workbook.getSheet(sheetName).getRow(rowNum).getCell(cellNum).getStringCellValue();
			
		}
		
		/**
		 * This method is used to read boolean data from an excel file
		 * @param sheetName provide the sheet name where test data is present
		 * @param rowNum provide the row number where test data is present
		 * @param cellNum provide the cell number which you want to read
		 * @return it returns the data in that respective sheet,row,cell in the form of boolean
		 */
		public static boolean readBooleanData(String sheetName,int rowNum,int cellNum) {
		
			Workbook workbook=null;
			File absPath=new File(excelPath);
			FileInputStream fis;
			try {
				fis=new FileInputStream(absPath);
				workbook=WorkbookFactory.create(fis);
			}catch(FileNotFoundException e) {
				e.printStackTrace();
			}catch(EncryptedDocumentException e) {
				e.printStackTrace();
			}catch(IOException e) {
				e.printStackTrace();
			}
			return workbook.getSheet(sheetName).getRow(rowNum).getCell(cellNum).getBooleanCellValue();
			
		}
		
		/**
		 * This method is used to read numeric data from an excel file
		 * @param sheetName provide the sheet name where  test data is present
		 * @param rowNum provide the row number where test data is present
		 * @param cellNum provide the cell number which you want to read
		 * @return it returns the data in that respective sheet,row,cell in the form of double
		 */
		
		//double
		public static String readNumericData(String sheetName,int rowNum,int cellNum) {
			
			Workbook workbook=null;
			File absPath=new File(excelPath);
			FileInputStream fis;
			try {
				fis=new FileInputStream(absPath);
				workbook=WorkbookFactory.create(fis);
			}catch(FileNotFoundException e) {
				e.printStackTrace();
			}catch(EncryptedDocumentException e) {
				e.printStackTrace();
			}catch(IOException e) {
				e.printStackTrace();
			}
			return workbook.getSheet(sheetName).getRow(rowNum).getCell(cellNum).toString(); //getNumericCellValue
			
		}
		
		/**
		 * This method is used to read local date and time data from an excel file
		 * @param sheetName provide the sheet name where test data is present
		 * @param rowNum provide the row number where test data is present
		 * @param cellNum provide the cell number which you want to read
		 * @return it returns the data in that respective sheet,row,cell in the form of LocalDateTime
		 */
		public static LocalDateTime readLocalTimeDate(String sheetName,int rowNum,int cellNum) {
			
			Workbook workbook=null;
			File absPath=new File(excelPath);
			FileInputStream fis;
			try {
				fis=new FileInputStream(absPath);
				workbook=WorkbookFactory.create(fis);
			}catch(FileNotFoundException e) {
				e.printStackTrace();
			}catch(EncryptedDocumentException e) {
				e.printStackTrace();
			}catch(IOException e) {
				e.printStackTrace();
			}
			return workbook.getSheet(sheetName).getRow(rowNum).getCell(cellNum).getLocalDateTimeCellValue();
			
		}
	}



