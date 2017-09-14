<%-- 
    Document   : Lab2
    Created on : Sep 12, 2017, 8:11:33 PM
    Author     : jordanrehbein
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>LAB 2</title>
    </head>
    <body>
        <h1>Calculate the area of a rectangle</h1>
        
        <img src="http://image.wistatutor.com/content/feed/u830/area%20of%20rectangle.PNG">
        
        <form name="form1" id="form1" method="POST" action="racl2">
            <table>
                <tr>
                    <td>Enter width:</td> <td><input type="text" value="" name="width"></td>
                </tr>
                <br>
                <tr>
                    <td>Enter length:</td> <td><input type="text" value="" name="length"></td>
                </tr>
                <br>
            </table>
            
            <input type="submit" name="submit" value="Submit">
        </form>
        
        <br>
        <h1>The Area is : ${area}</h1>
    </body>
</html>
