<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<title>home</title>
<style>
h1{
color : pink ;
}
 body {
    font-family: Arial, sans-serif;
    }
    div {
    background-color: white;

    }
        
 table {
   width: 50%;
   margin: 0 auto;
   border-collapse: collapse;
  }
  th, td {
  padding: 10px;
  text-align: left;
  border-bottom: 1px solid pink;
     }
  th {
    background-color: #f2f2f2;
   }
</style>
</head>
<body>
<div>
<h1>Fruit Store</h1>
<div>
<table>
        <thead>
            <tr>
                <th>Name</th>
                <th>Price</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach var="fruits" items="${fruits}">
                <tr>
                    <td><c:out value="${fruits.name}"/></td>
                    <td><c:out value="${fruits.price}"/></td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
    </div>

</div>

</body>
</html>
