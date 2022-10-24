<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html; charset=ISO-8859-1" isELIgnored="false"%>

<html>
<head>
<style>

body {
    background-color: #111111;
    background-image: url('http://placekitten.com/1000/1000');
}
.btn {
        cursor: pointer;
        border: 1px solid #3498db;
        background-color: transparent;
        height: 50px;
        width: 200px;
        color: #f8f8f8;
        font-size: 1.5em;
        
    }

.button1 {
  background-color: transparent;
  color: black;
  padding: 15px 32px;
  border: 2px solid black; 
  border-radius: 8px;
}

.blink {
  animation: blink 1s steps(1, end) infinite;
}

@keyframes blink {
  0% {
    opacity: 1;
  }
  50% {
    opacity: 0;
  }
  100% {
    opacity: 1;
  }
}

.button {
  background-color: Maroon ;
  border: none;
  color: white;
  padding: 15px 32px;
  text-align: center;
  text-decoration: none;
  display: inline-block;
  font-size: 16px;
  margin: 4px 2px;
  cursor: pointer;
  border-radius: 8px;
}

input[type=text],input[type=password],input[type=number],input[type=email],
select,input[type=date]
{
  width: 100%;
  padding: 12px 20px;
  margin: 8px 0;
  display: inline-block;
  border: 1px solid #ccc;
  border-radius: 4px;
  box-sizing: border-box;
}

label 
{
  padding: 12px 12px 12px 0;
  display: inline-block;
  font-weight: bold;
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
  background-color: yellow;
  color: white;

}
.p1 {
  font-family: Lucida Handwriting, Times, serif;
}
</style>
</head>
<body>

<h1 class=p1 align=center>Alpha Hospitals</h1>

<br>


  <a href="/" class=button1 font-size: 12px>Home </a>&nbsp;&nbsp;
 


<br><br>

<h3 align=center><u>Admin Login</u></h3>

<span class="blink">
<h3 align=center style="color: red"><c:out value="${msg}"/></h3>
</span>


<br>

<form method="post" action="checkadminlogin">

<table align=center>

<tr>
<td><label>Username</label></td>
<td><input type="text" name="duname" required></td>
</tr>

<tr><td></td></tr>

<tr>
<td><label>Password</label></td>
<td><input type="password" name="apwd" required></td>
</tr>

<tr><td></td></tr>

<tr align=center>

<td colspan="2"><input type="submit" value="Login" class="button"></td>

</tr>

</table>

</form>
<style>
body {
  background-image: url('images/harshi-1.webp');
  background-repeat: no-repeat;
  background-size: 1500px;
}
</style>
</body>
</html>

 
