<%-- 
    Document   : register
    Created on : Oct 19, 2020, 11:20:41 AM
    Author     : 759175
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Register</title>
    </head>
    <body>
        <h1>Shopping List</h1>
        <form action="ShoppingList" method="POST">
        <label>Username: </label><input type="text" name="user">
        <input type="hidden" name="action" value="register">
        <input type="submit" value="Register name">
    </form>
    </body>
</html>
