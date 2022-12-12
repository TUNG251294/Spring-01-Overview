<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Dictionary</title>
</head>
<body>
<form method="post" action="/home">
<label>English: <input type="text" name="english" placeholder="enter english"></label>
<p>Translate into Vietnamese</p>
<p>${vietnamese}</p>
<input type="submit" name="Translate">
</form>
</body>
</html>