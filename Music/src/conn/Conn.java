package conn;

import java.sql.*;

public class Conn {
	Connection conn=null;
	ResultSet rs=null;
	Statement stmt=null;
	String url="jdbc:sqlserver://localhost:1433;DatabaseName=Music";
	String username="sa";
	String password="123456";
	int result=0;
	
	public Conn(){
		try{
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		}
		catch(java.lang.ClassNotFoundException e){
			System.err.println(e.getMessage());
			e.printStackTrace();
		}
		try{
			Connection conn=DriverManager.getConnection(url,username,password);
			stmt=conn.createStatement();
		}
		catch(SQLException ex){
			System.err.println(ex.getMessage());
			ex.printStackTrace();
		}
	}
	public ResultSet executeQuery(String sql){
		try{
			rs=stmt.executeQuery(sql);
		}
		catch(SQLException ex){
			System.err.println(ex.getMessage());
			ex.printStackTrace();
		}
		return rs;
	}
	public int executeUpdate(String sql){
		try{
			result=stmt.executeUpdate(sql);
		}
		catch(SQLException ex){
			System.err.println(ex.getMessage());
			ex.printStackTrace();
		}
		return result;
	}
	public void closeDB(){
		try{
			stmt.close();
			conn.close();
		}
		catch(SQLException ex){
			ex.printStackTrace();
		}
	}
}
