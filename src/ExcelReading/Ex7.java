package ExcelReading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Ex7 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		File myfile=new File("D:\\SP Enterprises\\ExcelReading.xlsx"); // at ending of path need to write file name.xlsc
		
		Workbook myWorkBook = WorkbookFactory.create(myfile);
		
		Sheet mySheet = myWorkBook.getSheet("Sheet2");
		
		int totalRows = mySheet.getLastRowNum();
		int totalCells = mySheet.getRow(0).getLastCellNum()-1;
		
		// All kind of data reading,---> dynamic
		
		for(int i=0; i<=totalRows;i++)
		{
			for(int j=0; j<=totalCells; j++)
			{
				Cell myCells = mySheet.getRow(i).getCell(j);
				CellType cellDataType = myCells.getCellType();
				
				if(cellDataType==CellType.STRING)
				{
					String value = myCells.getStringCellValue();
					System.out.print(value+" ");
				}
				
				
				else if (cellDataType==CellType.NUMERIC) 
				{
					double value1 = myCells.getNumericCellValue();
					System.out.print(value1+" ");
				}
				
				
				else if (cellDataType==CellType.BOOLEAN) 
				{
				    boolean value2 = myCells.getBooleanCellValue();
					System.out.print(value2+" ");	
				}
				else if (cellDataType==CellType.BLANK)
				{
										
				}
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
		

	}

}
