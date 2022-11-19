<%--
  Created by IntelliJ IDEA.
  User: notma
  Date: 02.11.2022
  Time: 14:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<jsp:include page="mapping_partial.jsp"/>
<div>
    <img src="${Tov.getImg()}" style="width: 500px;height: 500px">
</div>
<div>${Tov.getName()}</div>
<div>
    <br/>
  Цена: ${Tov.getPrice()}
    <br/>
  Кол-во на складе: ${Tov.getCount()}<br/>
   Категории: ${Tov.getCategory_springs().getName()}<br/>
  Поставщик: ${Tov.getPostavshik_springs().getNameCompany()}<br/>
  Изготовитель: ${Tov.getIzgotovitel_springs().getName_Izgot()}<br/>
    <a href="http://localhost:8080/buying/${Tov.getId()}">Купить</a>

</div>
</body>
</html>
