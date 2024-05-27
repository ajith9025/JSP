<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<style>
 body {
            font-family: Arial, sans-serif;
        }
        .container {
            width: 400px;
            margin: 0 auto;
            padding: 20px;
            border: 1px solid #ccc;
            border-radius: 5px;
            background-color: #f9f9f9;
        }
        .form-group {
            margin-bottom: 15px;
        }
        .form-group label {
            display: block;
            font-weight: bold;
        }
        .form-group input[type="text"],
        .form-group input[type="password"],
        .form-group input[type="email"],
        .form-group input[type="number"],
        .form-group input[type="tel"] {
            width: 100%;
            padding: 8px;
            border: 1px solid #ccc;
            border-radius: 4px;
            box-sizing: border-box;
        }
        .form-group input[type="submit"] {
            background-color: #007bff;
            color: #fff;
            border: none;
            padding: 10px 20px;
            border-radius: 4px;
            cursor: pointer;
        }
        .form-group input[type="submit"]:hover {
            background-color: black;
        }
</style>
<body>
<div class="container">
        <h2>Update RegisterDetails</h2>
        <form action="UpdataeServlet" method="get">
      
            <div class="form-group">
                <label for="name">Name:</label>
                <input type="text" placeholder="Enter Your Name" name="name" required>
            </div>
            <div class="form-group">
                <label for="password">Password:</label>
                <input type="password" placeholder="Enter Your Password" name="password" required>
            </div>
            <div class="form-group">
                <label for="confirmpassword">Confirm password:</label>
                <input type="password" placeholder="Enter Your Confirm Password" name="confirm password"required>
            </div>
            <div class="form-group">
                <label for="email">Email:</label>
                <input type="email"  placeholder="Enter Your Email"name="email"required>
            </div>
            <div class="form-group">
                <label for="contactno">Contact no:</label>
                <input type="tel" placeholder="Enter Your Contact no" name="contact no"required>
            </div>
              <div class="form-group">
                <label for="name">Id:</label>
                <input type="number" placeholder="Enter Your Id" name="id" required>
            </div>
            <div class="form-group">
                <input type="hidden" name="editid" value="<%= request.getParameter("editid") %>">
                <input type="submit" value="Update">
            </div>
        </form>
    </div>
</body>
</html>