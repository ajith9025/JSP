<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Liste des videos</h1>
<%
response.setHeader("Cache-Control","no-cach,no-store,must-revalidate");

if(session.getAttribute("username")==null){
	response.sendRedirect("Login.jsp"); 
}


%>

<h1>Secure page: videos</h1>


</body>
</html>