<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html; charset=ISO-8859-1" isELIgnored="false"%>


<!DOCTYPE html>
<html>
<head>
<style>
.button1 {
  background-color: lightblue ;
  color: black;
  padding: 15px 32px;
  border: 2px solid black; 
  border-radius: 8px;
}
ul 
{
  list-style-type: none;
  margin: 0;
  padding: 0px;
  overflow: hidden;
  background-color: lightblue;
}

li 
{
  float: right;
    border-right: 1px solid blue;
}

li a 
{
  display: block;
  color: black;
 font-size:20px;
  text-align: center;
  padding: 10px 20px;
  text-decoration: none;
}
.active
{
background-color: black;
color: white;
}
li a:hover {
  background-color: orange;
  color: white;
}
</style>
</head>
<body>

<h1 align=center>Alpha Hospitals</h1>

<br>


  <a href="adminhome" class=button1 align=right>Home</a><br><br><br><br>
  <a href="doctorreg" class=button1 align='right'>Register a Doctor</a><br><br><br><br>
  <a href="viewalldocs" class=button1 align='right'>View All Doctors</a><br><br><br><br>
  <a href="recreg" class=button1 align='right'>Register a Receptionist</a><br><br><br><br>
  <a href="#" class=button1 align='right'>View Reception Employees</a><br><br><br><br>
  <a href="#" class=button1 align='right'>View All Inventory</a><br><br><br><br>
  <a href="adminlogin" class=button1 align='right'>Logout</a><br><br><br><br>

<br>

<h3 align=center>Welcome&nbsp;<c:out value="${duname}"></c:out></h3>
<style>
body {
  background-image: url('images/harshiadminhome.jpg');
  background-repeat: no-repeat;
  background-size: 1350px;
}
</style>
</body>
</html>

 
