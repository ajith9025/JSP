package com.chainsys.dao;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class LoginDao {
	String sql="select *from login_tb where username=? and password=?";
	String url = "jdbc:mysql://localhost:3306/day5";
	String username = "root";
	String password = "ajith123";
	
	public boolean check(String username,String password) {
		Connection con=null;
	    try{
		Class.forName("com.mysql.jdbc.Driver");

    	
    	 con= DriverManager.getConnection( url ,username,password);
    	 PreparedStatement st=con.prepareStatement(sql);
    	 st.setString(1,username);
    	 st.setString(2,password);
    	 ResultSet rs=st.executeQuery();
    	 if(rs.next()) {
    		 return true;
    	 }
    	 
    	 
    	 
    }catch(Exception e)
	    {
    	System.out.println(e);
    	}
		
		return false;
	}	

}
