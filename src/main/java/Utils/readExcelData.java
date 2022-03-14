package Utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.math.BigDecimal;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class readExcelData {
	

 public static void main(String arg[]) throws IOException {
	 
	 FileInputStream file=new FileInputStream
			 ("C:\\Users\\User\\Desktop\\DOMINATORS\\FashionWebsiteAutomation\\TestData\\import.xlsx");
	 
	 XSSFWorkbook w=new XSSFWorkbook(file);
	 XSSFSheet xs=w.getSheet("sheet1");
	
	
	 XSSFRow r0= xs.getRow(0);
	 String name=r0.getCell(1).toString();
	 System.out.println(name);
	 
	 
	 XSSFRow r1= xs.getRow(1);
	 String lname=r1.getCell(1).toString();
	 System.out.println(lname);
	 
	 
	 /*XSSFRow r2= xs.getRow(2);
	 double pass=r2.getCell(1).getNumericCellValue();
	 BigDecimal passw=new BigDecimal(pass);
	 String password=passw.toString();
	 System.out.println(password);*/
	 
	 XSSFRow r3= xs.getRow(3);
	 String company=r3.getCell(1).toString();
	 System.out.println(company);
	
	 
 
 }
 }
	 
	

