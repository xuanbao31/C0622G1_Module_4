<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 16/10/2022
  Time: 9:00 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
<form>
<h1>Calculator</h1>
<input type="text" name="number1" value="${number1}" placeholder="Number1">
<input type="text" name="number2" value="${number2}" placeholder="Number2">
  <br>
  <input type="submit" name="operator" value="addition" placeholder="addition">+
  <input type="submit" name="operator" value="subtraction" placeholder="subtraction">-
  <input type="submit" name="operator" value="multiplication" placeholder="multiplication">x
  <input type="submit" name="operator" value="division" placeholder="division">/
  <p>Keet qua : ${result}</p>
</form>
  </body>
</html>
