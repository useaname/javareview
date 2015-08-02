package test;

import java.sql.Connection;
import java.sql.DriverManager;

public class JDBCTest {
	
	public static  void ConnectTest() throws Throwable{
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/3306:cxq_2046996","root","cxq2046996");
		System.out.println(conn);
		
	}
	
	public static void main(String[] args) throws Throwable {
		ConnectTest();
	}
}
