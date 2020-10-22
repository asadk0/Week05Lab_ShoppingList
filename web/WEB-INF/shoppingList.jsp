<%-- 
    Document   : shoppingList
    Created on : Oct 19, 2020, 11:20:54 AM
    Author     : 759175
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Shopping List</title>
    </head>
    <body>
        <h1>Shopping List</h1>
        <p>Hello, ${user} <a href="ShoppingList?action=logout">Logout</a></p>
        <h2>List</h2>
        <form action="ShoppingList" method="POST">
        <label>Add item: </label><input type="text" name="inputItem">
        <input type="submit" name="action" value="Add">
        
        </form>
        <form action="ShoppingList" method="POST">
            <ul>
            <c:forEach items="${itemsList}" var="sList">
                <li><input type="radio" name="sList" value="${sList}"><c:out value="${sList}"></c:out></li> 
            </c:forEach>
            </ul>
            <input type="submit" name="action" value="Delete">
        </form>
    </body>
</html>
