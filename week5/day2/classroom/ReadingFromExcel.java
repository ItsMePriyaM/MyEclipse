package week5.day2.classroom;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;
@Test
public class ReadingFromExcel {


		// TODO Auto-generated method stub

		public String[][] readData() throws IOException
		{
		XSSFWorkbook wbook=new XSSFWorkbook("D:/MyLearnings/LearningReadingFromExcel/inputData.xlsx");

		//Step 1 : get into the sheet
		XSSFSheet ws = wbook.getSheet("Sheet1");
		
		//Step 2 : get into the row
		XSSFRow row = ws.getRow(1);
		//to get no. of rows
		int rows = ws.getLastRowNum();
		System.out.println(rows);
		//to get no. of columns 
		short columns = ws.getRow(0).getLastCellNum();
		System.out.println(columns);
		//step 3 : get into the column
	
		
		//step 4 : get the data
		String[][] data=new String[rows][columns];
		for(int i=1;i<=rows;i++)
		{
			XSSFRow allrows = ws.getRow(i);
			for(int j=0;j<columns;j++)
			{
				XSSFCell cell = allrows.getCell(j);
				String stringCellValue = cell.getStringCellValue();
				System.out.println(stringCellValue);
				data[i-1][j]=stringCellValue;
			}
		}
		
		
		wbook.close();
		return data;
		}
}




