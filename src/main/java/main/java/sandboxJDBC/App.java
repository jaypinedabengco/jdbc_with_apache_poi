package main.java.sandboxJDBC;

import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import main.java.sandboxJDBC.model.XLSXPoiModel;
import main.java.sandboxJDBC.utils.ApachePOIUtils;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 * Hello world!
 *
 */
public class App 
{
	
	private static final String DB_DRIVER = "com.mysql.jdbc.Driver";
	private static final String DB_CONNECTION = "jdbc:mysql://localhost/studylane_sandbox";
	private static final String DB_USER = "root";
	private static final String DB_PASSWORD = "";
 
	
    public static void main( String[] args ) throws Exception
    {
        viewXLSX();
    }
    
    public static void viewXLSX() throws Exception{
 
        List<XLSXPoiModel> xlsx = ApachePOIUtils.getXLSXPoiFromXLSXFile("/home/jay/Documents/Projects/Studylane/Documents/courses-data-2.xlsx");
        for ( XLSXPoiModel m : xlsx ){
        	System.out.println(m.getCourse_Level());
        }
    }
    
    public static void accessJDBCTest() throws Exception{
    	
    	Connection connection = getDBConnection();
    	Statement statement = null;
    	
    	String selectQuery = "SELECT * FROM area_of_study";
    	
    	statement = connection.createStatement();
    	
    	ResultSet rs = statement.executeQuery(selectQuery);
    	
    	while ( rs.next() ){
    		System.out.println(rs.getString("name"));
    	}
    	
    	if (statement != null )
    		statement.close();
    	if ( connection != null )
    		connection.close();
    		
    }
    
	private static Connection getDBConnection() {
		
		Connection dbConnection = null;
 
		try {
 
			Class.forName(DB_DRIVER);
 
		} catch (ClassNotFoundException e) {
			System.out.println("here");
			System.out.println(e.getMessage());
		}
 
		try {
 
			dbConnection = DriverManager.getConnection(DB_CONNECTION, DB_USER,
					DB_PASSWORD);
			return dbConnection;
 
		} catch (SQLException e) {
 
			System.out.println(e.getMessage());
 
		}
 
		return dbConnection;
 
	}
}
