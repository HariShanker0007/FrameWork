package pracOR;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class JDBCTRY {
public static void main(String[] args) throws SQLException {
	
	//step 1: Load/register the database Driver
	Driver driverref= new Driver();
	DriverManager.registerDriver(driverref);
	
	//step 2: Connect DB
	Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/batchexecution","root","root");
	
	//step 3: Create SQL statements
	Statement stat = conn.createStatement();
	
	//step 4: Execute SELECT query and get Result
	ResultSet result = stat.executeQuery("SELECT cost FROM flower");
	
	while(result.next()) {
		System.out.println(result.getString(1));
	}
	
	//step 5: Close Connection
	conn.close();
}
}
