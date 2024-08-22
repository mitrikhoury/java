<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
    <%@ page isErrorPage="true" %>   
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
 body {
    font-family: Arial, sans-serif;
    }       
 table {
   width: 50%;
   margin: 0 auto;
   border-collapse: collapse;
   border: 1px solid black;
  }
  th, td {
  padding: 10px;
  text-align: left;
  border-bottom: 1px solid black;
     }
  th {
    background-color: #f2f2f2;
   }
   h1{
   color:#085394;
   }
   .con{
   display: flex;
   flex-direction : column;
   justify-content: center;
   align-items: center;
   align-content: center;
   }
   .form{
margin :10px;
padding :25px;
border: 2px solid black; 
}
.BtnSend{
  color: white;
    background-color: rgb(43,120,228);
    margin-top: 10px;
    box-shadow: 3px 1px 1px black;
    width: 150px;
    height: 25px;
}
</style>
</head>
<body>
<div class="con">
<h1>Burger Tracker</h1>
<table>
        <thead>
            <tr>
                <th>Burger Name</th>
                <th>Restaurant Name</th>
                <th>Rating (out of 5)</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach var="burgers" items="${burgers}">
                <tr>
                    <td><c:out value="${burgers.getName()}"/></td>
                    <td><c:out value="${burgers.getResturantName()}"/></td>
                    <td><c:out value="${burgers.getRating()}"/></td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</div>

<div class="con">

<h1>Add Burger :</h1>

<form:form  action="/add" method="post" modelAttribute="burger" class="form">
    <p>
        <form:label path="name">Burger Name</form:label>
        <form:errors path="name"/>
        <form:input path="name"/>
    </p>
    <p>
        <form:label path="resturantName">Restaurant Name</form:label>
        <form:errors path="resturantName"/>
        <form:input path="resturantName"/>
    </p>
    <p>
        <form:label path="rating">Rating</form:label>
        <form:errors path="rating"/>
        <form:input path="rating"/>
    </p>
    <p>
        <form:label path="notes">notes</form:label>
        <form:errors path="notes"/>     
         <form:textarea path="notes"/>
    </p>    
    <input class="BtnSend" type="submit" value="Submit"/>
</form:form>    


</div>

</body>
</html>