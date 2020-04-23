package utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnDB {
	 private static Connection conn=null;
	 private   static Statement st=null;
	 private static PreparedStatement ps=null;
	  private static ResultSet rs=null;
	public static Connection getConn() throws ClassNotFoundException, SQLException{
		Class.forName("com.mysql.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/user?useUnicode=true&characterEncoding=utf8";
		String name="root";
		String password="root";
		Connection conn= DriverManager.getConnection(url, name, password);
		return conn;
	}
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException{
		//ConnDB conn =new ConnDB();
		Connection conn1=ConnDB.getConn();
			if(conn1!=null){System.out.println("链接成功");}else{System.out.println("链接失败");}
			}
	public static void close() throws SQLException {
		if(rs!=null) {
				rs.close();
			
		}
		if(ps!=null) {
			ps.close();
		
	}if(st!=null) {
		st.close();
		
}if(conn!=null) {
	conn.close();
	
}
	}

	public static void release(PreparedStatement ps2, Connection conn2) {
		// TODO Auto-generated method stub
		
	}
}

