<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Admin Login</title>
</head>
<body>
<br>
<p align="center">
<a href=Homepage.jsp style="color:black;text-decoration:none ;font-size:35px;font-weight:bold;">FlyAway</a>
</p>
<br><br>

<h2 align="center"> Admin Login</h2>
<div align="center">
<form action=Adminlogin method=post>
	<label for=email>Email </label> <input type="email" name=email id=email /><br><br>
	<label for=pass>Password </label> <input type="password" name=password id=pass /><br><br>
	<input type=submit value=submit /> <input type=reset />
</form>
</div>
<br>
<p align="center">
<a  href=Forgotpassword.jsp  style="font-size:25;color:blue;" >Forgot Password !</a>
</p>
<%
	String message=(String)session.getAttribute("message");
	if(message!=null){
%>
<p style="color:silver;"><%=message %></p>
<%
		session.setAttribute("message", null);
	}
%>
</body>
</html>