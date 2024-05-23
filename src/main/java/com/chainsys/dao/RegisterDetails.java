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

	public void saveRegister(RegisterPojo register) throws SQLException, ClassNotFoundException {

		// Connection con;
		Class.forName("com.mysql.cj.jdbc.Driver");
		try {
			Connection connection = Jdbc.getConnection();
			String query = "insert into register(name,password,confirm_password,email,contact_no) values(?,?,?,?,?)";
			PreparedStatement prepare = connection.prepareStatement(query);

			prepare.setString(1, register.getName());
			prepare.setString(2, register.getPassword());
			prepare.setString(3, register.getConfirmpassword());
			prepare.setString(4, register.getEmail());
			prepare.setString(5, register.getContactno());
			int execute = prepare.executeUpdate();
			System.out.println(execute);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}
	}

	public static ArrayList<RegisterPojo> getAllRegister() {
		Connection con;
		ArrayList<RegisterPojo> list= new ArrayList<RegisterPojo>();
		try {
			Connection connection = Jdbc.getConnection();
			String query = "select * from register";
			Statement statement = connection.createStatement();
			ResultSet rs = statement.executeQuery(query);
			while (rs.next()) {
				String name = rs.getString("name");
				String password = rs.getString("password");
				String confirmpassword = rs.getString("confirmpassword");
				String email = rs.getString("email");
				String contactno = rs.getString("contactno");
				RegisterPojo register = new RegisterPojo();
				register.setName(name);
				register.setPassword(password);
				register.setConfirmpassword(confirmpassword);
				register.setEmail(email);
				register.setContactno(contactno);
				list.add(register);
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;

	}	
}
