package ExcelReading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Ex3 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		File myfile=new File("D:\\SP Enterprises\\Transport.xlsx");
				
		Workbook myWorkBook = WorkbookFactory.create(myfile);
		
		Sheet mySheet = myWorkBook.getSheet("Sheet1");
		
		// Reading numerical
		
	    Cell myCell = mySheet.getRow(2).getCell(3);
		
		System.out.println(myCell.getCellType());  // For which type of cell
		System.out.println(myCell.getNumericCellValue());
		
		// Reading Boolean value
		
		Cell myCell1 = mySheet.getRow(3).getCell(2);
		
		System.out.println(myCell1.getCellType());
		System.out.println(myCell1.getBooleanCellValue());
		
		//Reading String value
		
		String value3 = mySheet.getRow(2).getCell(2).getStringCellValue();
		
		System.out.println(value3);
		
		
		
		

	}

}
