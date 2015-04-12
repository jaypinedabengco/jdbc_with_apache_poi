package main.java.sandboxJDBC.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import main.java.sandboxJDBC.model.XLSXPoiModel;
import main.java.sandboxJDBC.model.jdbc.Course;

public class JDBCUtils {

	private static final String DB_DRIVER = "com.mysql.jdbc.Driver";
	private static final String DB_CONNECTION = "jdbc:mysql://localhost/studylane_sandbox";
	private static final String DB_USER = "root";
	private static final String DB_PASSWORD = "";

	public static void saveCourse(Course course, int institutionID) throws SQLException{
	   	Connection connection = null;
    	PreparedStatement statement = null;
    	
    	String insertQuery = "INSERT INTO course"
    			+ "(id,name, duration_weeks, cricos_code, vet_national_code, course_code, "
    			+ "cost, language, work_component, foundation_studies, keywords, course_level, "
    			+ "dual_qualification, institution_id, award_id, level_of_study_id) VALUES "
    			+ "(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
    	
    	try{

    	 	connection = getDBConnection();
        	statement = connection.prepareStatement(insertQuery);

        	int i = 0;
        	statement.setInt(++i, course.getId());
        	statement.setString(++i, course.getName());
        	statement.setInt(++i, course.getDuration_weeks());
        	statement.setString(++i, course.getCricos_code());
        	statement.setString(++i, course.getVet_national_code());
        	statement.setString(++i, course.getCourse_code());
        	statement.setDouble(++i, course.getCost());
        	statement.setString(++i, course.getLanguage());
        	statement.setBoolean(++i, course.isWork_component());
        	statement.setBoolean(++i, course.isFoundation_studies());
        	statement.setString(++i, course.getKeywords());
        	statement.setString(++i, course.getCourse_level());
        	statement.setBoolean(++i, course.isDual_qualification());
        	statement.setInt(++i, institutionID);
        	statement.setInt(++i, 1); //temp
        	statement.setInt(++i, 1); //temp

        	int result = statement.executeUpdate();
        	
        	System.out.println("insert Count : " + result);
        	
    	} catch ( SQLException sql ){
    		sql.printStackTrace();
    	} finally {
        	if (statement != null )
        		statement.close();
        	if ( connection != null )
        		connection.close();
    	}
    	
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
