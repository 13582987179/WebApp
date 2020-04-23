package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.po.GoodsBean;

import com.po.UserBean;

import utils.ConnDB;

public class GoodsDaoImpl implements GoodsDao{
	 private  Connection conn=null;
	 private Statement st=null;
	 private PreparedStatement ps=null;
	  private ResultSet rs=null;
	public int add(GoodsBean GoodsBean) {
		int d=0;
		try {
			conn=ConnDB.getConn();
			String sql;
			sql="insert into goods (name,price,category,pnum,imgurl,description) values (?,?,?,?,?,?)";
			ps=conn.prepareStatement(sql);
			ps.setString(1, GoodsBean.getName());
			ps.setDouble(2, GoodsBean.getPrice());
			ps.setString(3, GoodsBean.getCategory());
			ps.setInt(4, GoodsBean.getPnum());
			ps.setString(5, GoodsBean.getImgurl());
			ps.setString(6, GoodsBean.getDescription());
			
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
	@Override
	public GoodsBean findbyid(int id) {
		GoodsBean p=new GoodsBean();
		try {
			conn=ConnDB.getConn();
			String sql="select * from goods where id=?";
			ps=conn.prepareStatement(sql);
			ps.setInt(1, id);
			rs=ps.executeQuery();	
			if(rs.next()){
				p.setId(rs.getInt(1));
				p.setName(rs.getString(2));
				p.setPrice(rs.getDouble(3));
				p.setCategory(rs.getString(4));
				p.setPnum(rs.getInt(5));
				p.setImgurl(rs.getString(6));
				p.setDescription(rs.getString(7));
				
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return p;
	}
	@Override
	public int updata(GoodsBean p) {
		int f=0;
		try {
			conn=ConnDB.getConn();
			String sql ="update goods set name=?,price=?,category=?,pnum=?,imgurl=?,description=? where id=?";
			ps=conn.prepareStatement(sql);
			ps.setString(1, p.getName());
			ps.setDouble(2, p.getPrice());
			ps.setString(3, p.getCategory());
			ps.setInt(4,p.getPnum());
			ps.setString(5, p.getImgurl());
			ps.setString(6, p.getDescription());
			ps.setInt(7,p.getId());
			f=ps.executeUpdate();			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ConnDB.release(ps,conn);
		return f;
	}
	}





