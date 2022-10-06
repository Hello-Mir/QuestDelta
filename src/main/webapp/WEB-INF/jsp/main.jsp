<!DOCTYPE html>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Main</title>

<%--    <link rel="stylesheet" type="text/css" href="${pageContext.request.getContextPath}>/css/styles.css">--%>
    <link rel="stylesheet" type="text/css" href="<c:url value='/css/styles.css' />"/>
    <link rel="preconnect" href="https://fonts.gstatic.com">
    <link href="https://fonts.googleapis.com/css2?family=Montserrat+Alternates&family=Nabla&family=Press+Start+2P&family=Rubik+Iso&display=swap"
          rel="stylesheet">
</head>
<body>
<nav class="navbar">
    <div class="container">
        <a href="#" class="navbar-logo">QuestHero</a>
        <div class="navbar-wrap">
            <ul class="navbar-menu">
                <li><a href="#">Home</a></li>
                <li><a href="#">Quests</a></li>
                <li><a href="#">Our Heros</a></li>
            </ul>
        </div>
        <a href="#" class="login">Login</a>
    </div>
</nav>
<div class="middle-container">
</div>
<div class="footer">
    <p>No rights reserved. Pirates welcome. 2022</p>
</div>
</body>
</html>
