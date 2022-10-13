<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 13/10/2022
  Time: 2:14 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
   <h1>Quy Đổi Tiền Tệ </h1>
  <p>Tỉ lệ 1 USD = 23000</p>
  <form action="/result"method="post">
    Nhập USD
    <input type="number" name="usd">
   <input type="submit" value="Kết quả">
  </form>
  <p>Kết quả là : ${result1} vnd</p>
  </body>
</html>
