package genericutility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility {
	/**
	 * This method is used to read string data from excel for the given sheetname and row and column.
	 * @param sheetname
	 * @param rowIndex
	 * @param colIndex
	 * @return
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	
	public String getStringDataFromExcel(String sheetname, int rowIndex, int colIndex) throws EncryptedDocumentException, IOException {
		FileInputStream fis= new FileInputStream("./src/test/resources/TestData/TestScriptData.xlsx");
		Workbook wb= WorkbookFactory.create(fis);
		return wb.getSheet(sheetname).getRow(rowIndex).getCell(colIndex).getStringCellValue();
	}
		

		public boolean getBooleanDataFromExcel(String sheetname, int rowIndex, int colIndex) throws EncryptedDocumentException, IOException {
			FileInputStream fis= new FileInputStream("./src/test/resources/TestData/TestScriptData.xlsx");
			Workbook wb= WorkbookFactory.create(fis);
			return wb.getSheet(sheetname).getRow(rowIndex).getCell(colIndex).getBooleanCellValue();
		}
			
			
			public double getNumberDataFromExcel(String sheetname, int rowIndex, int colIndex) throws EncryptedDocumentException, IOException {
				FileInputStream fis= new FileInputStream("./src/test/resources/TestData/TestScriptData.xlsx");
				Workbook wb= WorkbookFactory.create(fis);
				return wb.getSheet(sheetname).getRow(rowIndex).getCell(colIndex).getNumericCellValue();
			}
				
				public Date getDateDataFromExcel(String sheetname, int rowIndex, int colIndex) throws EncryptedDocumentException, IOException {
					FileInputStream fis= new FileInputStream("./src/test/resources/TestData/TestScriptData.xlsx");
					Workbook wb= WorkbookFactory.create(fis);
					return wb.getSheet(sheetname).getRow(rowIndex).getCell(colIndex).getDateCellValue();
	}

}
