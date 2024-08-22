<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>

.cotainer{
margin : 10px auto;
display:flex;
flex-direction: column;
align-content: center;
align-items: center;
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
<div class="cotainer">

<h1> New Book</h1>

<form class="form" action="/book/new" method="post">

<div>
<label>Title</label><br>
<input type="text" name="title">
</div><br>

<div>
<label>Description</label><br>
<textarea rows="5" cols="40" name="description"></textarea>
</div><br>

<div>
<label>Language</label><br>
<input type="text" name="language">
</div><br>

<div>
<label>Number of pages</label><br>
<input type="number" name="pages">
</div><br>

<input class="BtnSend"type="submit" value="Create new Book">
</form>
</div>



</body>
</html>