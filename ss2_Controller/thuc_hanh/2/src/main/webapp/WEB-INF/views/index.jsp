<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 14/10/2022
  Time: 10:44 SA
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <h2>Email Validate</h2>
  <form action="/validate" method="post">
    <table class="table table-primary">
      <tr>
        <th>Nhap Email</th>
        <th>Submit</th>
      </tr>
      <tr>
        <td>
          <input type="text" name="email">
          </td>
        <td>
          <input type="submit">
        </td>
      </tr>

    </table>

  </form>
  </body>
</html>
