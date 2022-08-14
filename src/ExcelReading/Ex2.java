package ExcelReading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Ex2 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		File myfile=new File("D:\\SP Enterprises\\\\Transport.xlsx");
		
		String value = WorkbookFactory.create(myfile).getSheet("Sheet1").getRow(2).getCell(2).getStringCellValue();
		
		System.out.println(value);
		
		double value1 = WorkbookFactory.create(myfile).getSheet("Sheet1").getRow(2).getCell(3).getNumericCellValue();
		
		System.out.println(value1);
		
		
		
		
		

	}

}
