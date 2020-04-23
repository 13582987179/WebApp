package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.apache.tomcat.jni.OS;

import com.po.UserBean;

import utils.ConnDB;

public class UserDaoImpl implements UserDao {
	 private  Connection conn=null;
	 private Statement st=null;
	 private PreparedStatement ps=null;
	  private ResultSet rs=null;

	 


	public  int login(UserBean userBean) {
		 int f=0;
		 try {
				conn=ConnDB.getConn();
				st=conn.createStatement();
				String sql;
				sql="select password from user where user='"+userBean.getUsername()+"'";
 
				rs=st.executeQuery(sql);
			if(rs.next()) {
				String pwd=rs.getString(1);
				if(pwd.equals(userBean.getPassword())) {
					f=1;
				}
				else {
					f=0;
				} 
				}else {
					f=0;
				}
			
				
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 finally {
				
					try {
						ConnDB.close();
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
		 }
		return f;
	}



	@Override
	public int reg(UserBean userBean) {
		int d=0;
		try {
			conn=ConnDB.getConn();
			String sql;
			sql="insert into user (user,password) values (?,?)";
			ps=conn.prepareStatement(sql);
			ps.setString(1, UserBean.getUsername());
			ps.setString(2, UserBean.getPassword());
			d=ps.executeUpdate();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return d;
	}

}