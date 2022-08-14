package ExcelReading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class JustPractice {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		File myfile=new File("D:\\SP Enterprises\\ExcelReading.xlsx");
		
		Sheet mySheet = WorkbookFactory.create(myfile).getSheet("Sheet3");
		
		int Totalrows = mySheet.getLastRowNum();
		
		int TotalCell = mySheet.getRow(0).getLastCellNum()-1;
		
		System.out.println("This is row"+Totalrows);
        System.out.println(TotalCell);
        
        // reading all table data
        
        for(int i=0; i<=2;i++)  // for row
        {
        	for(int j=0; j<=1;j++) // for cell
        	{
        		System.out.print(mySheet.getRow(i).getCell(j).getStringCellValue()+" ");
        	}
        	System.out.println();
        }
	}

}
