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
<div class="container-fluid">
    <div class="row">
        <div class="col-6">
            <h1>${Tov.getName()}</h1>
            <img src="${Tov.getImg()}" style="width: 500px;height: 500px">
        </div>
        <div class="col-4">

            <br/>
            <h3>Цена: ${Tov.getPrice()}</h3>
            <br/>
            <h3>Кол-во на складе: ${Tov.getCount()}</h3>
           <h3> Категории: ${Tov.getCategory_springs().getName()}</h3>
           <h3> Поставщик: ${Tov.getPostavshik_springs().getNameCompany()}</h3>
           <h3> Изготовитель: ${Tov.getIzgotovitel_springs().getName_Izgot()}</h3>
            <a href="http://localhost:8080/buying/${Tov.getId()}" class="btn btn-primary">Купить</a>

        </div>
    </div>


<div>


</div>
</div>
</body>
</html>
