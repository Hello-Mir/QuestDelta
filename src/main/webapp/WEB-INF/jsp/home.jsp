<!DOCTYPE html>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html lang="EN">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Home</title>
    <link href="<c:url value='/css/styles.css' />" rel="stylesheet" type="text/css">
    <link rel="stylesheet" href="<c:url value='/css/bootstrap-reboot.min.css'/>" type="text/css">
    <link rel="stylesheet" href="<c:url value='/css/bootstrap-grid.min.css'/>" type="text/css">
    <link rel="preconnect" href="https://fonts.gstatic.com">
    <link href="https://fonts.googleapis.com/css2?family=Montserrat+Alternates&family=Nabla&family=Press+Start+2P&family=Rubik+Iso&display=swap"
          rel="stylesheet">
</head>
<body>
<div class="page">
    <nav class="navbar">
        <div class="container">
            <a href="#" class="navbar-brand">QuestHero</a>
            <div class="navbar-wrap">
                <ul class="navbar-menu">
                    <li><a href="#">Home</a></li>
                    <li><a href="#">Quests</a></li>
                    <li><a href="#">Hero Stats</a></li>
                </ul>
                <a href="#" class="login">Login</a>
            </div>
        </div>
    </nav>
    <main class="content">
        <div class="inner-content">
            <p>Take a Quest. Be a Hero...</p>
        </div>
    </main>
    <footer class="footer">
        <div class="inner-footer">
            <p>QuestHero. 2022 Hell Year</p>
            <p>No rights reserved. Pirates are welcome</p>
        </div>
    </footer>
</div>
</body>

</html>
