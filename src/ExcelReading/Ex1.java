package ExcelReading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Ex1 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		
		File myfile=new File("D:\\SP Enterprises\\Transport.xlsx");  // at ending of path need to write file name.xlsc
		
		
		String value = WorkbookFactory.create(myfile).getSheet("July-22").getRow(1).getCell(2).getStringCellValue();
		
		System.out.println(value);

	}

}
