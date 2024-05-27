<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>LOGIN</title>
</head>
<style>
    
    body{
    background-image:url("pexels-ella-olsson-572949-1640777.jpg") ;
    background-repeat: no-repeat;
    background-position: center;
    min-height: 80vh;
    background-size: cover;
    padding: 100px;

}

label{
        display:inline-block;
        padding: 15px 20px;
        font-weight: 400;
        color:black;
        font-size: large;
}
form{
    box-shadow: 10px 0px 10px 0px rgba(0,0,0,0.3);
    border-radius: 5px;
    border: 1px solid #f3f3f3;
    padding: 10px;
    
}
 
h1 {
    color:black;
    font-size:large;
}
</style>
<body>
       
            <h1>LOGIN PAGE</h1>
            <form action="LoginServlet" method="post">
            <label>Username:</label><br>
            <input type="text" placeholder="Enter Your Username"  name=" username" required><br>
            <label>Password:</label><br>
            <input type="password" placeholder="Enter Your Password"  name="password" required><br><br>
            <button type="Login"value="Login">Login</button>
           </form>
   
</body>
</html>