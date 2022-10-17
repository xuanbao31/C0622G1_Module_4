<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 17/10/2022
  Time: 11:23 SA
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">

    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
            integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
            crossorigin="anonymous"></script>
</head>
<body>

<form:form action="login" method="post" modelAttribute="login">

    <table class="table table-dark">
        <tr>
            <td><form:label path="account">Account: </form:label></td>
            <td><form:input path="account"/></td>
        </tr>
        <td><form:label path="password">Password:</form:label></td>
        <td><form:input path="password"/></td>
        </tr>
        <tr>
            <td></td>
            <td><form:button>Login</form:button></td>
        </tr>
    </table>

</form:form>

</body>
</html>
