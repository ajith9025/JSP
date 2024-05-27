package com.chainsys.test;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.chainsys.dao.RegisterDetails;
import com.chainsys.model.RegisterPojo;


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

    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	  response.getWriter().append("Served at: ").append(request.getContextPath());
	  String name= request.getParameter("name");
	  String password= request.getParameter("password");
	  String confirmpassword= request.getParameter("confirm password");
	  String email= request.getParameter("email");
	  String contactno=request.getParameter("contact no");
	  int id=Integer.parseInt(request.getParameter("id"));
	  register.setName(name); 
	  register.setPassword(password);
	  register.setConfirmpassword(confirmpassword);
	  register.setEmail(email);
	  register.setContactno(contactno);
	  register.setId(id);
	  try {
		details.saveRegister(register);
		 

	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  request.setAttribute("list",register);
	  ArrayList<RegisterPojo> list=null;
	  try {
			
			 list=details.getAllRegister();

		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	 
      request.setAttribute("list",list);
	  RequestDispatcher dispatcher = request.getRequestDispatcher("table.jsp");
	  dispatcher.forward(request, response);
}
	/**
	 * @param  
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
		String action = request.getParameter("action");
        if(action != null && action.equals("Delete")) {
                    int id=Integer.parseInt(request.getParameter("deleteid"));
            try {
                
				 details.deleteRegister(id);
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            
            request.getRequestDispatcher("table.jsp").forward(request, response);
            }
        }
		
	}




