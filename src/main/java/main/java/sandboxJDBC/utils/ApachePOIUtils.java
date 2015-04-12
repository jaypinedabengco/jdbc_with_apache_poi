package main.java.sandboxJDBC.utils;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import main.java.sandboxJDBC.model.XLSXPoiModel;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public final class ApachePOIUtils {

	public static List<XLSXPoiModel> getXLSXPoiFromXLSXFile(String fileLocation) throws Exception{
	   	File myFile = new File(fileLocation);
    	
	   	FileInputStream fis = null;
	   	XSSFWorkbook workbook = null;
	   	try{
	   		
		   	fis = new FileInputStream(myFile);
		   	workbook = new XSSFWorkbook (fis);
	      
		   	// Return first sheet from the XLSX workbook
		   	XSSFSheet sheet = workbook.getSheetAt(0);
		   	
	       // Get iterator to all the rows in current sheet
	       Iterator<Row> rowIterator = sheet.iterator();
	       List<XLSXPoiModel> xlsxModels = new ArrayList<XLSXPoiModel>();  
	       
	       // Traversing over each row of XLSX file
	       while (rowIterator.hasNext()) {
	           Row row = rowIterator.next();
	           if ( row.getRowNum() > 0 ) //header list not included
	           	xlsxModels.add( new XLSXPoiModel(row) );
	       }
	       
	       return xlsxModels;
	   		
	   	} catch( Exception e){
	   		e.printStackTrace();
	   	} finally {
	   		if ( workbook != null )
	   			workbook.close();
	   		if ( fis != null )
	   			fis.close();
	   	}
	   	
	   	return null;
	}
	
}
