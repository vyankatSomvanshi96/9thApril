package ExcelReading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Ex4 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		File myfile=new File("D:\\SP Enterprises\\ExcelReading.xlsx");
		
		 Sheet mySheet = WorkbookFactory.create(myfile).getSheet("Sheet1");
		
		//Reading multiple data from single row
		
		for(int i=0; i<=4; i++)  // mention column index size b'cos row is constant
		{
			String value = mySheet.getRow(0).getCell(i).getStringCellValue();
			System.out.println(value);
		}
		
		//reading multiple data from single column
		
		for(int i=0; i<=1;i++)
		{
			String value = mySheet.getRow(i).getCell(0).getStringCellValue();
			System.out.println(value);
		}
	
	}

}
