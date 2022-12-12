<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Converter Form</title>
</head>
<body>
<form method="post" action="/converting">
<label>
    Rate:<input type="number" name = "rate" value="23000">
</label><br>
<label>
    USD: <input type="number" name="usd" value="0">
</label><br>
    <label>
        VND: <input type="number" name="vnd" value="0">
    </label>
<input type="submit" id="submit" value="Convert">
</form>
</body>
</html>