package com.chainsys.test;

import java.io.IOException;
import java.lang.NumberFormatException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.catalina.User;

import com.chainsys.dao.RegisterDetails;
import com.chainsys.model.RegisterPojo;
import com.chainsys.util.Jdbc;

/**
 * Servlet implementation class ChainsysA
 */
@WebServlet("/ChainsysA")
public class ChainsysA extends HttpServlet {
	private static final long serialVersionUID = 1L;
	RegisterPojo register = new RegisterPojo(); 
	RegisterDetails details = new RegisterDetails();

    /**
     * @see HttpServlet#HttpServlet()
     */
    public ChainsysA() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    private static ArrayList<RegisterPojo> list = new ArrayList<RegisterPojo>();
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		//System.out.println("In get method");
	 
	  String name= request.getParameter("name");
	  String password= request.getParameter("password");
	  String confirmpassword= request.getParameter("confirm password");
	  String email= request.getParameter("email");
	  String contactno=request.getParameter("contact no");
	  /*PrintWriter out=response.getWriter();
	  out.println(name);
	  out.println(password);
	  out.println(confirmpassword);
	  out.println(email);
	  out.println(contactno);*/
	  register.setName(name); 
	  register.setPassword(password);
	  register.setConfirmpassword(confirmpassword);
	  register.setEmail(email);
	  register.setContactno(contactno);
	  try {
		details.saveRegister(register);
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  System.out.println("list");
	  RegisterPojo register = new RegisterPojo(name,password,confirmpassword,email,contactno);
	  list.add(register);
      request.setAttribute("list",list);
	  RequestDispatcher dispatcher = request.getRequestDispatcher("table.jsp");
	  dispatcher.forward(request, response);
		
	 
		
		
}
	/**
	 * @param  
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		//System.out.println("In post method from First.html";
		 
	}
}


