<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page import="java.util.List" %>
<%@ page import="com.example.Shop1.Entity.Tovar_spring" %><%--
  Created by IntelliJ IDEA.
  User: notma
  Date: 29.10.2022
  Time: 13:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>shop</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
    <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>

</head>
<body>
<jsp:include page="mapping_partial.jsp"/>

<%--@elvariable id="us" type="com"--%>
<form:form method = "POST" action = "/zakaz/info" modelAttribute="us">
    <table>
        <tr>
            <td><form:label path = "phone">Номер телефона:</form:label></td>
            <td><form:input path = "phone" /></td>
        </tr>
        <tr>
            <td colspan = "2">
                <input type = "submit" value = "Submit"/>
            </td>
        </tr>
    </table>
</form:form>
<div class="container-fluid" >
    <c:forEach items="${List}" var="L">
<div class="row">
    <div class="col-sm" >
            ${L.getId()}
    </div>
    <div class="col-sm">
            ${L.getListTov().getName()}
    </div>
    <div class="col-sm">
        <img src="${L.getListTov().getImg()}" style="height: 100px;width: 100px">
    </div>
    <div class="col-sm">
            ${L.getListTov().getName()}
    </div>
    <div class="col-sm">
            ${L.getListTov().getPrice()}
    </div>
    <div class="col-sm">
            ${L.getUsers().getName()}
    </div>
    <div class="col-sm">
            ${L.getUsers().getCity()}
    </div>
    <div class="col-sm">
            ${L.getDatetime()}
    </div>

</div>
</c:forEach>
</div>

</body>
</html>
