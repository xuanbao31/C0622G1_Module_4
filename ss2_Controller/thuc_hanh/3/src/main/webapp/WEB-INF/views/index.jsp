<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 14/10/2022
  Time: 1:46 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
<h2>Times In The World</h2>
  <span>
    Thời Gian Tại ${city}: <strong>${date}</strong>
  </span>
<form action="/" method="get" id="locate">
  <select name="city" onchange="document.getElementById('locate')">
    <option value="Asia/Ho_Chi_Minh" selected>Select a city</option>
    <option value=""


  </select>
</form>

  </body>
</html>
