<%-- 
    Document   : agecalculator.jsp
    Created on : 2-Feb-2022, 1:37:31 PM
    Author     : honey
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Age Calculator Form</title>
    </head>
    <body>
        <h1>Age Calculator</h1>
        <form method="post"action="age">
            <label>Enter your age: </label>
            <input type="text" name="age" value="${age}">
            <br>
            <input type="submit" name="your_age"value="Age next birthday">
            <br>
            <a href="arithmetic" name="arithmetic">Arithmetic Calculator</a>
            
        </form>
    </body>
</html>
