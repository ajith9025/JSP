package com.chainsys;

import java.io.IOException;
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
    private static ArrayList<Register> list = new ArrayList<Register>();
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		//System.out.println("In get method");
	 
	  String name= request.getParameter("name");
	  String password= request.getParameter("password");
	  String confirmpassword= request.getParameter("confirm password");
	  String email= request.getParameter("email");
	  int contactno= Integer.parseInt(request.getParameter("contact no"));
	  PrintWriter out=response.getWriter();
	  out.println(name);
	  out.println(password);
	  out.println(confirmpassword);
	  out.println(email);
	  out.println(contactno);
	  System.out.println("list");
	  Register register = new Register(name,password,confirmpassword,email,contactno);
	  list.add(register);
      request.setAttribute("list",list);
	  RequestDispatcher dispatcher = request.getRequestDispatcher("table.jsp");
	  dispatcher.forward(request, response);
}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		//System.out.println("In post method from First.html";

	}

}
