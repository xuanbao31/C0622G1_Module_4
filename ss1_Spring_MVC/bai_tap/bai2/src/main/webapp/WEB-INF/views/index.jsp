<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 13/10/2022
  Time: 3:17 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body style="background: aqua">
<h2>Trang Từ Điển </h2>
<form action="/dictionary" method="post">
  Nhập từ điển ( tiếng anh)
  <input type="text" name="a">
  <input type="submit" placeholder="Dịch">
</form>
  <p>Kết quả là : ${result1}</p>
  </body>
</html>
