package dbconnection;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionDB {
	private static String Driver="com.mysql.cj.jdbs.Driver";
	private static String Username="root";
	private static String Password="Sai@2004";
	private static String url="jdbc:mysql://localhost:3306/";
	private static Connection Conn=null;
	public static Connection getconnection() {
		try {
			Class.forName(Driver);
			Conn=DriverManager.getConnection(url,Username,Password);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return Conn;
	}

	}
