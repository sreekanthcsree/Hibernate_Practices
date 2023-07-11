<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page isELIgnored="false" %>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="sreekanth"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
  <h1>My Indian Cricket Team:</h1>
  <h3 align="left" style="color:yellow">India Test Team Squad:</h3>
<body bgcolor="blue">
</body>
<h5>
  <ol>
<li>Rohit Sharma</li>
<li>K L Rahul</li>
<li>Chateswar Pujara</li>
<li>Virat Kohli</li>
<li>SuryaKumar Yadav</li>
<li>Ravichandran Ashwin</li>
<li>Ravindra Jadeja</li>
<li>Axar Patel</li>
<li>Srikar Bharath</li>
<li>Mohammed Shami</li>
<li>Mohammed Siraj</li>
</ol>
<marquee><font="impact"size="70" >C SREEKANTH</font></marquee>

</h5>

<h2 align="center">Student Application Form</h2><hr/>
	<fieldset>
		<legend>Fill the details</legend>
		<form:sreekanth action="save" method="post" >
			FirstName : <input type="text" name="fName">&nbsp;&nbsp;&nbsp;&nbsp;
			LastName : <input type="text" name="lName"><br/>
			Email : <input type="text" name="email"><br/>
			Mobile No : <input type="number" name="mno"><br/>
			<input type="submit" value="Submit">
		</form:sreekanth>
	</fieldset>
	${det}

</body>
</html>