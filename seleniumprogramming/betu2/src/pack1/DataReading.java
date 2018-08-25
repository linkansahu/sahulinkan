package pack1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class DataReading {
	public static void main(String[] args) throws Throwable, InvalidFormatException, IOException {
		 Class.forName("oracle.jdbc.driver.oracleDriver");
	      Connection connect = DriverManager.getConnection( 
	         "jdbc:mysql://localhost:3306/test" , 
	         "root" , 
	         "root" );
	      Statement statement = connect.createStatement();
	      ResultSet resultSet = statement.executeQuery("select * from emp_tbl");
	      FileInputStream fis =new FileInputStream("C:\\Users\\LINKAN\\Desktop\\db.xlsx");
	      
	      Workbook wb=WorkbookFactory.create(fis);
	       Sheet sh=wb.createSheet("Emp Db");
	       Row rw=sh.createRow(1);
	       Cell cell;
	       cell=rw.createCell(1);
	       cell.setCellValue("EMP ID");
		      cell = rw.createCell(2);
		      cell.setCellValue("EMP NAME");
		      cell = rw.createCell(3);
		      cell.setCellValue("DEG");
		      cell = rw.createCell(4);
		      cell.setCellValue("SALARY");
		      cell = rw.createCell(5);
		      cell.setCellValue("DEPT");
		      int i=2;
		      while(resultSet.next()) {
			         rw = sh.createRow(i);
			         cell = rw.createCell(1);
			         cell.setCellValue(resultSet.getInt("eid"));
			         cell = rw.createCell(2);
			         cell.setCellValue(resultSet.getString("ename"));
			         cell = rw.createCell(3);
			         cell.setCellValue(resultSet.getString("deg"));
			         cell = rw.createCell(4);
			         cell.setCellValue(resultSet.getString("salary"));
			         cell = rw.createCell(5);
			         cell.setCellValue(resultSet.getString("dept"));
			         i++;
		      }
		      FileOutputStream out = new FileOutputStream("C:\\Users\\LINKAN\\Desktop\\db.xlsx");
		      wb.write(out);
		      out.close();
		      System.out.println("exceldatabase.xlsx written successfully");
	}
}
