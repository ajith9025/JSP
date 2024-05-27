package com.chainsys.test;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.chainsys.dao.LoginDao;
import com.chainsys.dao.Register;
import com.chainsys.dao.RegisterDetails;
import com.mysql.cj.Session;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());	
    }
    
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		  String username = request.getParameter("Username");
	       // int password = Integer.parseInt(request.getParameter("Password"));
		 String password= request.getParameter("Password");
	        LoginDao dao=new LoginDao();

 		if(dao.check(username, password))
	    		{
	    			
	    			HttpSession session=request.getSession();
	    			session.setAttribute("username",username);
	    			response.sendRedirect("Welcome.jsp");
	    			
	    		}else {
	    			
	    			response.sendRedirect("Login.jsp");
	    			
	    		}
	    		
	    		
	    		
	    	}

	    }
	        
	        
	     
	        
	

