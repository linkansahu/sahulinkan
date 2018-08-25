package pack1;


import java.io.BufferedReader;

import java.io.File;

import java.io.FileInputStream;

import java.io.FileNotFoundException;

import java.io.FileOutputStream;

import java.io.FileReader;

import java.util.Arrays;


import org.apache.poi.ss.usermodel.DataFormatter;

import org.apache.poi.xssf.usermodel.XSSFCell;

import org.apache.poi.xssf.usermodel.XSSFRow;

import org.apache.poi.xssf.usermodel.XSSFSheet;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import org.testng.annotations.Test;


public class ExcelProgramm 
{

  XSSFWorkbook workbook;

  XSSFSheet worksheet;
  
  XSSFRow row;
  
  XSSFCell cell;

  FileInputStream fis;

  int lrn;

  DataFormatter format;//format the data

 @Test

   public void readData() throws Throwable

   { 
	 
  fis=new FileInputStream("C:\\Users\\LINKAN\\Desktop\\linkan.xlsx");

 workbook=new  XSSFWorkbook(fis);

 format=new DataFormatter();
 worksheet=workbook.getSheet("lksahu");

 lrn=worksheet.getLastRowNum();

 for(int i=0;i<=lrn;i++)
 
    {
  
   row=worksheet.getRow(i);
    
    for(int j=0;j<=row.getLastCellNum();j++)

         {
	     
     cell=row.getCell(j);

   String data=format.formatCellValue(cell);
	   
   System.out.print(data+" ");
	     
 }

        System.out.println();
    
 }
 
   }

 
 @Test
 public void CsvData() throws Throwable
 {
	
FileReader fr=new FileReader("C:\\Users\\LINKAN\\Desktop\\lksahu.csv"); 

BufferedReader br=new BufferedReader(fr);

String data;
	
String splitBy=",";

int i=0;
	
while((data=br.readLine())!=null)
	
 { //skipping ist line
		
if(i==0)
		
{

i++;
			
continue;
		
}//
 
 String values[]=data.split(splitBy);

 System.out.println(Arrays.toString(values));

      
     
}
 }
 @Test
 public void setData() throws Throwable
 {
	 worksheet = workbook.createSheet("mydata");
	 row =  worksheet.createRow(0);
	 cell = row.createCell(0);
     cell.setCellValue("name");
     cell = row.createCell(1);
     cell.setCellValue("phno");
     cell = row.createCell(2);
     cell.setCellValue("add");
     
     int i =1 ;
        row = worksheet.createRow(i);
        cell = row.createCell(0);
        cell.setCellValue("linkan");
        cell = row.createCell(1);
        cell.setCellValue(7259);
        cell = row.createCell(2);
        cell.setCellValue("angl");
     FileOutputStream out = new FileOutputStream("C:\\Users\\LINKAN\\Desktop\\betu.xlsx");
     workbook.write(out);
     out.close();
     System.out.println("betu.xlsx written successfully");
 
    
 }
 }

 