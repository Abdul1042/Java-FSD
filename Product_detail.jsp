<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>New_Product</title>
</head>
<body>
<form method="post" action="New_product">
  <p>&nbsp;</p>
  <p align="center" class="black">Product Details :</p>
  <table align="center" >
   <tr>
    <td>Product Name</td>
    <td><input type="text" name=productName size=30 class="smalltext"></td>
   </tr>
   <tr>
    <td>Product Description</td>
    <td><input type="text" name=productDesc size=30 class="smalltext"></td>
   </tr>

   <tr>
    <td>Product Price</td>
    <td><input type="text" name=productPrice size=40 class="smalltext"></td>
   </tr>

   <tr>
    <td>Availabe Stock</td>
    <td><input type="text" name=prodStock size=30
     class="smalltext"></td>
   </tr>
   <tr>
    <td colspan="2" align="center"><input type="submit"
     value="Submit" /></td>
   </tr>
  </table>
 </form>

</body>
</html>