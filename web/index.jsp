
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
  <head>
    <title> Danh sách khách hàng </title>
    <style>
      table, tr, td  {
        border: 1px solid grey;
      }
    </style>

  </head>
  <body>

      <table>
        <tr>
          <td>Tên khách hàng</td>
          <td>Năm sinh</td>
          <td>Quốc tịch</td>
          <td>Avatar</td>
        </tr>

          <c:forEach items = "${customers}"  var ="customer">

        <tr>
          <td>${customer.getName()}</td>
          <td>${customer.getDob()}</td>
          <td>${customer.getAddress()}</td>
          <td>
            <img src = "${customer.getAvatar()}" height = "100", width="100"/>
          </td>
        </tr>

          </c:forEach>

      </table>

  </body>
</html>
