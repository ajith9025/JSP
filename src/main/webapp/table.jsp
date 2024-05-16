<%@page import="com.chainsys.Register"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ page import="java.util.ArrayList" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<style>
 <style>
        table {
            border-collapse: collapse;
            width: 50%;
            text-align:center;
        }

        th, td {
            border: 1px solid black;
            padding: 8px;
            text-align: left;
            
        }

        th {
            background-color: #f2f2f2;
        }
        a{
            text-decoration:none;
            color:green;
            
        }
        a:hover{
            color:blue;
        }
    </style>
 
<body>
<h2>Register Details</h2>
    <table>
     <tr>
        <th>Name</th>
        <th>Password</th>
        <th>Confirmpassword</th>
         <th>Email</th>
        <th>Contact no</th>
    </tr>
        <%
            ArrayList<Register> list =( ArrayList<Register>)  request.getAttribute("list");
        if(list!= null)
            for (Register item : list) {
        %>
        <tr>
            <td><%= item.getName() %></td>
            <td><%= item.getPassword() %></td>
            <td><%= item.getConfirmpassword() %></td>
            <td><%= item.getEmail() %></td>
            <td><%= item.getConfirmpassword() %></td>
            
         </tr>  
        
        <%
            }
        %>
    </table>
   <a href='http://localhost:8080/Section/'>Add account</a>
</body>
</html>

