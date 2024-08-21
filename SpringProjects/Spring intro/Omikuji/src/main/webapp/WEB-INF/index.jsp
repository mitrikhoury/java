<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Omikuji Form</title>
<link rel="stylesheet" type="text/css" href="/css/formStyle.css">
</head>
<body>
<div class="cotainer">

<h1>Send an Omikuji!</h1>

<form class="form" action="/omikuji/show" method="post">
<div>
<label>pick any number from 5 to 25.</label><br>
<input type="number" min=5 max=25 name="numberInput">
<br>
</div><br>
<div>
<label>Enter the name of any city.</label><br>
<input type="text" name="cityName" required>
<br><br>
</div>
<div>
<label>Enter the name of any real person.</label><br>
<input type="text" name="personName" required>
<br><br>
</div>
<div>
<label>Enter professional endeavor or hobby.</label><br>
<input type="text" name="hobby" required>
<br>
</div><br>
<div>
<label>Enter any type of living thing.</label><br>
<input type="text" name="livingType" required>
<br>
</div><br>
<div>
<label>Say something nice to someone</label><br>
<textarea rows="5" cols="30" name="niceNote"></textarea>
<br>
</div><br>

<label>Send and show a friend</label><br>
<div class="bottunPostion">
 <input class="BtnSend" type="submit" value="Send">
</div>

</form>
</div>
</body>
</html>