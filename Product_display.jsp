<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>New_Product</title>
</head>
<body>
<%@ page import="java.util.*;"%>

 <%
  HashMap<String, String> userDetails = (HashMap) session.getAttribute("user");
  String productName = "";
  String productDesc = "";
  String productPrice = "";
  if (userDetails != null) {
   productName = userDetails.get("productName");
   productDesc = userDetails.get("productDesc");
   productPrice = userDetails.get("productPrice");

  }
  else {

   productName = null;
   productDesc = null;
   productPrice = null;

  }
 %>

 <p>&nbsp;</p>
 <p align="center" class="black">The information entered by you is
  as follows :</p>

 <table align="center" bgcolor="#728DCF">
  <tr>
   <td>Product Name :</td>
   <%-- Below is the JSP expression used to display string value of an expression --%>
   <td><%=productName%></td>
  </tr>

  <tr>
   <td>Product Description :</td>
   <td><%=productDesc%></td>
  </tr>

  <tr>
   <td>Product Price :</td>
   <td><%=productPrice%></td>
  </tr>
 </table>

</body>
</html>