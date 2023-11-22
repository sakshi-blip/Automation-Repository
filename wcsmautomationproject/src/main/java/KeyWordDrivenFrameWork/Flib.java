package KeyWordDrivenFrameWork;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Flib 
{
  //it is use to store generic reusable methods and all the generic reusable methods are non static
	
	public String readDataFromExcel(String excelPath,String sheetName,int rowCount,int cellCount) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream(excelPath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet(sheetName);
	    Row row = sheet.getRow(rowCount);
	    Cell cell = row.getCell(cellCount);
	    //String data = cell.getStringCellValue();
	    //return data;
	    
	    String data=null;
	    if(cell.getCellType()==cell.getCellType().STRING)
	    {
	    	data=cell.getStringCellValue();
	    }
	    else if(cell.getCellType()==cell.getCellType().NUMERIC)
	    {
	    	data=cell.getStringCellValue().valueOf(cell.getNumericCellValue());
	    }
	    return data;
	} 
	
	public void writeDataToExcel(String excelPath,String sheetName,int rowCount,int cellCount) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream(excelPath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet(sheetName);
		Row row = sheet.createRow(rowCount);
		Cell cell = row.createCell(cellCount);
		cell.setCallValue(data);
		
		FileOutputStream foc
		
	}
	public int rowCount(String excelPath,String sheetName,int rc) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream(excelPath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet(sheetName);
		int rc = sheet.getLastRowNum();
		return rc;
	}
	
	public void readDataFromProperty(String propPath,String key) throws FileNotFoundException
	{
		Object fis = new FileInputStream(propPath);
		
		Properties prop = new Properties();
		prop.load(fis);
		String data=
		
	}
	
}