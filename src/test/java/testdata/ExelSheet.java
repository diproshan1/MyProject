package testdata;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExelSheet {
 
	public static Workbook book;
	public static Sheet sheet;
	
	
	public static Object [][] readdata (String Sheetname){
		
		FileInputStream file=null;
		
		try {
			file = new FileInputStream("C:\\Users\\Mital\\eclipse-workspace\\HRmanagement\\src\\test\\java\\testdata\\Details.xlsx");
			
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		
		
		try {
	
	   book=	  WorkbookFactory.create(file);
		/*if you want to use this class out side you need to refer it for that you need to use super variable "Workbook"
		 * 	there is two type of work book HHSF and XSSF
		 * HHSF -- before 2007 workbook
		 * XSSF- after 2007 workbook covers xlsx files 	
		 */
		}
		catch (IOException a) {
			a.printStackTrace();
		}
		
	sheet=	book.getSheet(Sheetname);
		Object [][]data =new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
		
		for (int i=0;i<sheet.getLastRowNum();i++) {
			for (int k=0;k<sheet.getRow(0).getLastCellNum();k++){
				data[i][k]=sheet.getRow(i+1).getCell(k).toString();
				
			}
		}
		return data;
		
	}
	

}
