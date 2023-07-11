<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
   <h2>College Student List</h2>
   <table border="1">
   <tr>
      <th>Sid</th>
      <th>FName</th>
      <th>LName</th>
      <th>Email</th>
      <th>Mno</th>
   </tr>
   
   <c:forEach var="st" items="${list}">
         <tr>
           <td>${st.getSid()}</td>
           <td>${st.getFName()}</td>
           <td>${st.getLName()}</td>
           <td>${st.getEmail()}</td>
           <td>${st.getMno()}</td>
         
         </tr>
         </c:forEach>
         </table>

</body>
</html>