<!DOCTYPE html>
<html>
<head>
<style>

@import url('https://fonts.googleapis.com/css2?family=Raleway:wght@400;700&display=swap');

* {
  margin: 0;
  padding: 0;
  box-sizing: border-box;
}

.p1 {
  font-family: Lucida Handwriting, Times, serif;
}


.button5 {border-radius: 50%;}
.button1 {
  background-color: 	NavajoWhite ;
  color: black;
  padding: 15px 32px;
  border: 2px solid black; 
  border-radius: 8px;
}
.button {
  background-color: violet; 
  border: none;
  color: white;
  padding: 15px 32px;
  text-align: center;
  text-decoration: none;
  display: inline-block;
  font-size: 16px;
  border-radius: 8px;
}

* {
   box-sizing: border-box;
}
.imageColumn {
   float: left;
   width: 25%;
   padding: 10px;
}

ul 
{
  list-style-type: none;
  margin: 0;
  padding: 0px;
  overflow: hidden;
  background-color: white;
}

li 
{
  float: left;
    border-right: 1px solid black;
}
body1 {
  display: flex;
  justify-content: center;
  align-items: center;
  height: 100vh;
  background: #050801;
  font-family: 'Raleway', sans-serif;
  font-weight: bold;
}

a {
  position: relative;
  display: inline-block;
  padding: 25px 30px;
  margin: 40px 0;
  color: #03e9f4;
  text-decoration: none;
  text-transform: uppercase;
  transition: 0.5s;
  letter-spacing: 4px;
  overflow: hidden;
  margin-right: 50px;
}

a:hover {
  background: #03e9f4;
  color: #050801;
  box-shadow: 0 0 5px #03e9f4, 0 0 25px #03e9f4, 0 0 50px #03e9f4, 0 0 200px #03e9f4;
  -webkit-box-reflect: below 1px linear-gradient(transparent, #0005);
}

a:nth-child(1) {
  filter: hue-rotate(270deg);
}

a:nth-child(2) {
  filter: hue-rotate(110deg);
}
a span {
  position: absolute;
  display: block;
}

a span:nth-child(1) {
  top: 0;
  left: 0;
  width: 100%;
  height: 2px;
  background: linear-gradient(90deg, transparent, #03e9f4);
  animation: animate1 1s linear infinite;
}

@keyframes animate1 {
  0% {
    left: -100%;
  }
  50%,
  100% {
    left: 100%;
  }
}

a span:nth-child(2) {
  top: -100%;
  right: 0;
  width: 2px;
  height: 100%;
  background: linear-gradient(180deg, transparent, #03e9f4);
  animation: animate2 1s linear infinite;
  animation-delay: 0.25s;
}

@keyframes animate2 {
  0% {
    top: -100%;
  }
  50%,
  100% {
    top: 100%;
  }
}

a span:nth-child(3) {
  bottom: 0;
  right: 0;
  width: 100%;
  height: 2px;
  background: linear-gradient(270deg, transparent, #03e9f4);
  animation: animate3 1s linear infinite;
  animation-delay: 0.5s;
}

@keyframes animate3 {
  0% {
    right: -100%;
  }
  50%,
  100% {
    right: 100%;
  }
}

a span:nth-child(4) {
  bottom: -100%;
  left: 0;
  width: 2px;
  height: 100%;
  background: linear-gradient(360deg, transparent, #03e9f4);
  animation: animate4 1s linear infinite;
  animation-delay: 0.75s;
}

@keyframes animate4 {
  0% {
    bottom: -100%;
  }
  50%,
  100% {
    bottom: 100%;
  }
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
<!--  <img src="images/Alpha hospitals_free-file.png" alt="logo" style="width:100px;height:80px;"> -->
<h1 align=center class=p1>Alpha Hospitals</h1>

<br>
<center>
<bodys>
<a  href="/" align='center'>
      <span></span>
      <span></span>
      <span></span>
      <span></span>
      Home
    </a>
<br>
    <a href="adminlogin">
      <span></span>
      <span></span>
      <span></span>
      <span></span>
      Admin
    </a>
<br>
    <a href="doctorlogin">
      <span></span>
      <span></span>
      <span></span>
      <span></span>
      Doctor
    </a><br>
    <a href="#">
     
      <span></span>
      <span></span>
      <span></span>
      Receptionist
    </a><br>
    <a href="#">
      <span></span>
      <span></span>
      <span></span>
      <span></span>
      Patient
    </a><br>
    </bodys>
    </center>
    
  <!-- <a  href="/" class=button1 align='center'>Home</a><br><br><br><br> 
  <a href="adminlogin" class=button1 align='center' >Admin</a><br><br><br><br>
  <a href="doctorlogin" class=button1 align='center'>Doctor</a><br><br><br><br>
  <a href="#" class=button1 align='center'>Reception</a><br><br><br><br>
  <a href="#" class=button1 align='center'>Patient</a><br> -->


<br><br><br>

<style>
body {
  background-image: url('images/clean.webp');
  background-repeat: no-repeat;
  background-size: 1440px;
}
</style>

</body>
</html>

 
