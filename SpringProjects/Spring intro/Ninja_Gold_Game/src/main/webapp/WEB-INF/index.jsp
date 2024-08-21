<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Ninja old Game</title>
<link rel="stylesheet" type="text/css" href="/css/style.css">
</head>
<body>
   <div class="container">
        <div class="gold">
            Your Gold: <span><%= session.getAttribute("gold") != null ? session.getAttribute("gold") : 0 %></span>
        </div>
        <div class="forms">
            <form class="form" action="/process" method="post">
            <h1>Farm</h1><br>
            <p>(earns 10-20 gold)</p>
                <button type="submit" name="action" value="farm">Find Gold!</button>
            </form>
            <form class="form" action="/process" method="post">
                <h1>Cave</h1><br>
                <p>(earns 5-10 gold)</p>
                <button type="submit" name="action" value="cave">Find Gold!</button>
            </form>
            <form class="form" action="/process" method="post">
                <h1>House</h1><br>
                <p>(earns 2-5 gold)</p>
                <button type="submit" name="action" value="house">Find Gold!</button>
            </form>
            <form class="form"action="/process" method="post">
                <h1>Quest</h1><br>
                <p> (earns/takes 0-50 gold)</p>
                <button type="submit" name="action" value="quest">Find Gold!</button>
            </form>
            <form class="form"action="/process" method="post">
               <h1>Spa</h1><br>
            <p>(loses 5-20 gold)</p>
                <button type="submit" name="action" value="spa">Loses Gold!</button>
            </form>
        </div>
        <div class="activities">
            <h2>Activities:</h2>
           <div class="box_Acivities"> <ul>
                <%
                    java.util.List<String> activities = (java.util.List<String>) session.getAttribute("activities");
                    if (activities != null) {
                        for (String activity : activities) {
                %>
                    <li><%= activity %></li>
                <%
                        }
                    }
                %>
            </ul></div>
        </div>
    </div>
</body>
</html>