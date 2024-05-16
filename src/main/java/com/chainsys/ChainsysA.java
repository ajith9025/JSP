package com.chainsys;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ChainsysA
 */
@WebServlet("/ChainsysA")
public class ChainsysA extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
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
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		//System.out.println("In get method");
	  String firstname= request.getParameter("firstname");
	  String lastname= request.getParameter("lastname");
	  String password= request.getParameter("password");
	  String confirmpassword= request.getParameter("confirm password");
	  String email= request.getParameter("email");
	  String contactno= request.getParameter("contact no");
	  PrintWriter out=response.getWriter();
	  out.println(firstname);
	  out.println(lastname);
	  out.println(password);
	  out.println(confirmpassword);
	  out.println(email);
	  out.println(contactno);
	  
	  
		
	}
		
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		//System.out.println("In get method");
	}

}
