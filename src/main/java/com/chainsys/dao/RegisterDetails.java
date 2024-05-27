package com.chainsys.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.chainsys.model.RegisterPojo;
import com.chainsys.util.Jdbc;

public class RegisterDetails implements Register {



	public static void saveRegister(RegisterPojo register) throws SQLException, ClassNotFoundException {

		Connection con;
		Class.forName("com.mysql.cj.jdbc.Driver");
		try {
			Connection connection = Jdbc.getConnection();
			String query = "insert into register(name,password,confirm_password,email,contact_no,id) values(?,?,?,?,?,?)";
			PreparedStatement prepare = connection.prepareStatement(query);
           
			prepare.setString(1, register.getName());
			prepare.setString(2, register.getPassword());
			prepare.setString(3, register.getConfirmpassword());
			prepare.setString(4, register.getEmail());
			prepare.setString(5, register.getContactno());
			prepare.setInt(6, register.getId());
			int execute = prepare.executeUpdate();
			System.out.println(execute);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();

		}
	}

	public ArrayList<RegisterPojo> getAllRegister()throws SQLException, ClassNotFoundException {
		Connection con;
		ArrayList<RegisterPojo> list= new ArrayList<RegisterPojo>();
	try {
			Connection connection = Jdbc.getConnection();
			String query = "select name,password,confirm_password,email,contact_no,id from register";
			Statement statement = connection.createStatement();
			ResultSet rs = statement.executeQuery(query);
			while (rs.next()) {
			  
				String name = rs.getString("name");
				String password = rs.getString("password");
				String confirm_password = rs.getString("confirm_password");
				String email = rs.getString("email");
				String contact_no = rs.getString("contact_no");
				 int id=rs.getInt("id");
				RegisterPojo register = new RegisterPojo();
				
				register.setName(name);
				register.setPassword(password);
				register.setConfirmpassword(confirm_password);
				register.setEmail(email);
				register.setContactno(contact_no);
				register.setId(id);
				list.add(register);
			}
	}
		
		catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;


	}

	
	/*public void deleteRegister(int id) throws ClassNotFoundException, SQLException {
        String deleteQuery="delete from register where id=?";
        PreparedStatement prepare=Jdbc.getConnection().prepareStatement(deleteQuery);
        prepare.setInt(1,id);
        prepare.executeUpdate();
    }	*/
   
	public ArrayList<RegisterPojo> deleteRegister(int id) throws ClassNotFoundException, SQLException {
		 Connection con;
	        con = Jdbc.getConnection();
	        String query="DELETE from register WHERE id=?";
	        PreparedStatement statement = con.prepareStatement(query);
	        statement.setInt(1, id);
	        int executeUpdate = statement.executeUpdate();
	        System.out.println(executeUpdate);
	        ArrayList<RegisterPojo> allUsers = getAllRegister();
	        return allUsers;
		
	}
	
}

		
	

	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	

