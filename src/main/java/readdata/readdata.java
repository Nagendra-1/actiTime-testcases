package readdata;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class readdata {

	public static void main(String[] args) throws Exception   {
		// TODO Auto-generated method stub

		
		File f=new File("C:\\textdata\\testing data.xlsx");
		FileInputStream fis=new FileInputStream(f);
	XSSFWorkbook w=new XSSFWorkbook(fis);
		//XSSFSheet s1=w.getSheet("Sheet1");
		//to get the sheet(name)
		
		/*String ss=w.getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
		System.out.println(ss);
		
		String s3=w.getSheet("Sheet1").getRow(1).getCell(1).getStringCellValue();
		System.out.println(s3);*/
		XSSFSheet s2=w.getSheet("Sheet1");
				 s2.createRow(3).createCell(1).setCellValue("www.google.com");
				 s2.createRow(4).createCell(1).setCellValue("testing");
				 s2.createRow(5).createCell(1).setCellValue("pass");  
				 s2.createRow(6).createCell(1).setCellValue("pass");
				 s2.createRow(7).createCell(1).setCellValue("pass");
				 s2.createRow(8).createCell(1).setCellValue("fail");
				 s2.createRow(9).createCell(1).setCellValue("pass");
				 s2.createRow(10).createCell(1).setCellValue("pass");
				 s2.createRow(11).createCell(1).setCellValue(14.20);
		FileOutputStream fos=new FileOutputStream(f);
				w.write(fos);
		
		System.out.println("execution is over");

}}
