package main.java.sandboxJDBC;

import java.util.ArrayList;
import java.util.List;

import main.java.sandboxJDBC.model.XLSXPoiModel;
import main.java.sandboxJDBC.model.jdbc.Course;
import main.java.sandboxJDBC.utils.ApachePOIUtils;
import main.java.sandboxJDBC.utils.JDBCUtils;

/**
 * Hello world!
 *
 */
public class App 
{
	
    public static void main( String[] args ) throws Exception
    {
    	
    	List<XLSXPoiModel> models = ApachePOIUtils.getXLSXPoiFromXLSXFile("/home/jay/Documents/Projects/Studylane/Documents/courses-data-2015-04-08-19-05-50.xlsx");
    	for ( XLSXPoiModel model : models){
    		JDBCUtils.saveCourse(new Course(model), 2);
    	}
    }
    
}
