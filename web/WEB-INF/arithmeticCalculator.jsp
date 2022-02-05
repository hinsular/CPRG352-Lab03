<%-- 
    Document   : arithmeticCalculator
    Created on : 2-Feb-2022, 3:09:10 PM
    Author     : honey
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Arithmetic Calculator</title>
    </head>
    <body>
        <h1>Arithmetic Calculator</h1>
        <form method ="post" actions ="arithmetic">
            
         
            <label>First:</label>
            <input type="text" name="firstnumber" value="${firstNumber}">
            <br>
            <label>Second:</label>
            <input type="text" name="secondnumber" value="${secondNumber}">
            <br>
            <input type="submit" name="operation" value="+">
            <input type="submit" name="operation" value="-">
            <input type="submit" name="operation" value="*">
            <input type="submit" name="operation" value="%">
              
        </form>
    </body>
</html>
