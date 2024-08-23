<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
    <%@ page isErrorPage="true" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
  .form{
margin :10px;
padding :25px;
border: 2px solid black; 
border-radius: 10px;
}
.BtnSend{
  color: white;
    background-color: rgb(43,120,228);
    margin-top: 10px;
    box-shadow: 3px 1px 1px black;
    width: 150px;
    height: 25px;
}
 h1{
   color:#085394;
   }
</style>
</head>
<body>
   
<h1>Edit Burger</h1>
 <form:form  action="/burger/${burgerEdit.getId()}" method="post" modelAttribute="burgerEdit" class="form">
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
    <input class="BtnSend" type="submit" value="Edit"/>
</form:form>    
</body>
</html>