<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 14/10/2022
  Time: 3:54 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Trang sandwich</h1>
<form action="/sandwich">
    <table>
        <tr>
            <input type="checkbox" name="a" value="Lettuce" >Lettuce</input>
            <input type="checkbox" name="a" value="Tomato" >Tomato</input>
            <input type="checkbox" name="a" value="Mustard" >Mustard</input>
            <input type="checkbox" name="a" value="Sprouts" >Sprouts</input>
        </tr>
    </table>
    <pre>
        Những gia vị bạn đã chọn :
    </pre>
    <c:forEach items="${lettuce}" var="sandwich" >
        <span>${sandwich} </span>

    </c:forEach>
    <pre><input type="submit" value="Save"></pre>

</form>
</body>
</html>
