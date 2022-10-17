<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 17/10/2022
  Time: 10:25 SA
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h3>Trang Thêm MỚi</h3>

<form:form method="post" action="addEmployee" modelAttribute="employee">
    <table>
        <tr>
            <td><form:label path="id">EmployeeID :</form:label></td>
            <td><form:label path="id"/></td>
        </tr>
        <tr>
            <td><form:label path="name">Employee Name: </form:label></td>
            <td><form:input path="name"/></td>
        </tr>
        <tr>
            <td><form:label path="contractNumber">Contract Number: </form:label></td>
            <td><form:input path="contractNumber"/> </td>
        </tr>
<tr>
    <td><input type="submit" value="Submit"/></td>
</tr>
    </table>

</form:form>
</body>
</html>
