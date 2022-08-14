package ExcelReading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Ex5 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		File myfile=new File("D:\\SP Enterprises\\ExcelReading.xlsx");
		
		Sheet mySheet = WorkbookFactory.create(myfile).getSheet("Sheet1");
		
		// For reading complete table
		// This is called static coding
		
		for(int i=0; i<=1; i++)  //outer for loop--> for Rows
		{
			for(int j=0; j<=4; j++) //inner for loop--> for cells
			{
				String value = mySheet.getRow(i).getCell(j).getStringCellValue();
				System.out.print(value+" || ");
			}
			System.out.println();
		}
	
	}

}
