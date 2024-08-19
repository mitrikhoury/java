<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.Date"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>demo jsp</title>
</head>
<body>
  
  <h1>Mitri Khoury</h1>
  
  <% for(int i =0 ; i <5;i++) { %>
     <h1><%= i %></h1>
     <%} %>
     <h3> the Time is : <%= new Date() %></h3>

     
</body>
</html>