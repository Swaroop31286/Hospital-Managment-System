<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html; charset=ISO-8859-1" isELIgnored="false"%>

<!DOCTYPE html>
<html>
<head>
<style>
.button1 {
  background-color: DarkTurquoise ;
  color: black;
  padding: 15px 32px;
  border: 2px solid black; 
}
ul 
{
  list-style-type: none;
  margin: 0;
  padding: 0px;
  overflow: hidden;
  background-color: DarkTurquoise;
}

li 
{
  float: left;
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
<h3 align=center>Welcome&nbsp;<c:out value="${duname}"></c:out></h3>
<br>


  <a  href="doctorhome" class=button1>Home</a><br><br><br><br><br>
  <a href="viewdoc" class=button1>View Profile</a><br><br><br><br><br>
  <a href="#" class=button1>View My Patients</a><br><br><br><br><br>
  <a href="echangepwd" class=button1>Change Password</a><br><br><br><br><br>
  <a href="doctorlogin" class=button1>Logout</a><br><br>


<br>


<style>
body {
  background-image: url('images/1282821.webp');
  background-repeat: no-repeat;
  background-size: 1300px;
}
</style>
</body>
</html>

 
