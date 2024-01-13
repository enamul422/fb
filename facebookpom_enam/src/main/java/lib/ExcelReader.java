package lib;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {

	Sheet sh;
	
	public ExcelReader(String filename, String sheetname) throws IOException {
		FileInputStream fis = new FileInputStream(filename);
		Workbook wb = new XSSFWorkbook(fis);
		sh = wb.getSheet(sheetname);
		
		
	}
	
	
	public Object[][] excelToArray() {
		Object[][] t;
		
		int totalRows = sh.getPhysicalNumberOfRows();
		int totalCols = sh.getRow(0).getPhysicalNumberOfCells();
		
		t = new Object[totalRows-1][totalCols];
		
		
		//reading start from row 1 in excel sheet.
		
			for(int r =1; r< totalRows ; r=r+1) {
			
				for(int col=0;col<totalCols ; col=col+1) {
				
					Cell c = sh.getRow(r).getCell(col);
					
					
				//E. get the cell value and print into console:
				if(c.getCellType()==Cell.CELL_TYPE_STRING) {
					String value = c.getStringCellValue();
					t[r-1][col] = value;
				}
				else {
					//Numberic part: convert double to int:
					//int to char:
					if(c.getNumericCellValue()%1 == 0) {
						String v =""+(int)c.getNumericCellValue();
						t[r-1][col] = v;
					}
					else {
						String d = ""+c.getNumericCellValue();
						t[r-1][col] = d;
					}
					
					
					
				}
				
				
				
			}
		}
		
		return t;
	}

}
