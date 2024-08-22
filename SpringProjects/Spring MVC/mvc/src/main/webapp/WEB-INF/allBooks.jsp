<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
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
</style>
</head>
<body>

<table>
        <thead>
            <tr>
                <th>ID</th>
                <th>Title</th>
                <th>Language</th>
                <th># Pages</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach var="books" items="${books}">
                <tr>
                    <td><c:out value="${books.getId()}"/></td>
                    <td><a href="/books/${books.getId()}"><c:out value="${books.getTitle()}"/></a></td>
                    <td><c:out value="${books.getLanguage()}"/></td>
                    <td><c:out value="${books.getNumberOfPages()}"/></td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
    </div>

</div>
</body>
</html>