package SeleniumPack;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.*;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.*;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class datadriven {
             
	public static void main(String[] args) throws IOException{
		try{
			System.setProperty("webdriver.chrome.driver","C:\\chromedriver\\chromedriver.exe");
			FileInputStream f1=new FileInputStream("C:\\test\\test.xlsx");
			XSSFWorkbook wb=new XSSFWorkbook(f1);
			XSSFSheet sh=wb.getSheetAt(0);
			Row r=sh.getRow(0);
			Cell c=r.getCell(0);
			System.out.println(c);
		    
			int rowCount=0;
			Row newRow=sh.createRow(rowCount+1);
			for(int j=0;j<r.getLastCellNum();j++)
			{
				Cell cell=newRow.createCell(j);
				cell.setCellValue("new data");
			}
			f1.close();
			FileOutputStream outputStream=new FileOutputStream("C:\\test\\test.xlsx");
			wb.write(outputStream);
			outputStream.close();
			
			//WebDriver driver=new ChromeDriver();
		     //driver.get(c.toString());
		}
		catch(FileNotFoundException e){
			e.printStackTrace();
		}
	}
}
