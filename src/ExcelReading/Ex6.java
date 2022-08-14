package ExcelReading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Ex6 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		File myfile=new File("D:\\SP Enterprises\\ExcelReading.xlsx");
		
		Sheet mySheet = WorkbookFactory.create(myfile).getSheet("Sheet1");
		
		int totalRows = mySheet.getLastRowNum();
		
		System.out.println(totalRows);
		
	//	int Totalcells = mySheet.getRow(0).getLastCellNum()-1;  // 1st way
		short totalCells = mySheet.getRow(0).getLastCellNum();  // 2nd way
		System.out.println(totalCells);
		
		// For reading complete table---> Dynamic coding
		
		for(int i=0; i<=totalRows;i++)
		{
			for(int j=0;j<=totalCells-1;j++)  // For column(taken -1 B'coz total cell count as per excel it's count from 1)
			{
				String value = mySheet.getRow(i).getCell(j).getStringCellValue();
				System.out.print(value+" ");
			}
		     System.out.println();
		}
	
	}

}
