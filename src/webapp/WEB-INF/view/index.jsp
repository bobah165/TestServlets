<%--
  Created by IntelliJ IDEA.
  User: Пользователь
  Date: 23.02.2019
  Time: 11:05
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <meta charset="utf-8">
    <title>Web Shop</title>
    <style>
      <%@include file="style.css"%>
    </style>
  </head>
  <body>

  <h1>Welcome to Norway</h1>

  <div class="item_1">
    <h4>Tour#1</h4>
    <p><img src="${pageContext.request.contextPath}\ROOT\3.jpg" alt="Norway1" width="300" height="300"/></p><br>

    <form method="post" action="">
      <input text="text" required placeholder="count" name="count1">
      <input type="button" value="add">
    </form>

  </div>

  <div class="item_2">
    <h4>Tour#2</h4>
    <p><img src="${pageContext.request.contextPath}\ROOT\4.jpg" alt="Norway2" width="300" height="300"></p><br>

    <form method="post" action="">
      <input text="text" required placeholder="count" name="count2">
      <input type="button" value="add">
    </form>

  </div>

  <div class="item_3">
    <h4>Tour#3</h4>
    <p><img src="${pageContext.request.contextPath}\ROOT\5.jpg" alt="Norway3" width="300" height="300"></p><br>

    <form method="post" action="">
      <input text="text" required placeholder="count" name="count3">
      <input type="button" value="add">
    </form>

  </div>

  <div class="item_4">
    <h4>Tour#4</h4>
    <p><img src="${pageContext.request.contextPath}\ROOT\6.jpg" alt="Norway4" width="300" height="300"></p><br>

    <form method="post" action="">
      <input text="text" required placeholder="count" name="count4">
      <input type="button" value="add">
    </form>


  </div>

  <div class = "form">

    <h2>Entrance in system</h2><br>
    <form method="post" action="">

      <input text="text" required placeholder="login" name="login"><br><br>
      <input type="password" required placeholder="password" name="password"><br><br>
      <input class="button" type="submit" value="Enter">

    </form>
  </div>


  </body>
</html>
