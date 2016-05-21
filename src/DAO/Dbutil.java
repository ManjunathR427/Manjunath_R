package DAO;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class Dbutil
{

	private static final String driverClass="oracle.jdbc.driver.OracleDriver";
	private static final String url="jdbc:oracle:thin:@localhost:1521:XE";
	private static final String uname="system";
	private static final String pass="java";

	
	static
	{
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static Connection getConnection() throws SQLException
	{

		return DriverManager.getConnection(url, uname, pass);

	}

	public static void closeAll(ResultSet rs, Statement stmt, Connection con)
	{
		try
		{
			if (rs != null)
			{

				rs.close();
				rs = null;
			}
		} catch (Exception e)
		{
			e.printStackTrace();
		}
		try
		{
			if (stmt != null)
			{

				stmt.close();
				stmt = null;
			}
		} catch (Exception e)
		{
			e.printStackTrace();
		}
		try
		{
			if (con != null)
			{

				con.close();
				con = null;
			}
		} catch (Exception e)
		{
			e.printStackTrace();
		}

	}

}
