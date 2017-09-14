<%-- 
    Document   : Lab3
    Created on : Sep 12, 2017, 8:11:45 PM
    Author     : jordanrehbein
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>LAB 3</title>
    </head>
    <body>
        <h1>Calculate the area of a Rectangle</h1>
        
        <img src="http://image.wistatutor.com/content/feed/u830/area%20of%20rectangle.PNG">
        
        <form name="form1" id="form1" method="POST" action="acl3?clacType=rectangle">
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
        <h1>The Area is : ${rectArea}</h1>
        <hr>
        
        <h1>Calculate the area of a Circle</h1>
        
        <img src="http://m.mathblaster.com/Mathblaster/CoolMath/Article-Images/radius-of-a-circle.jpg">
        
        <form name="form2" id="form2" method="POST" action="acl3?clacType=circle">
            <table>
                <tr>
                    <td>Enter Radius:</td> <td><input type="text" value="" name="radius"></td>
                </tr>
                <br>
                <h1>The Area is : ${circleArea}</h1>
                <br>
            </table>
            
            <input type="submit" name="submit" value="Submit">
        </form>
                
                <hr>
        
        <h1>Calculate the area of a Circle</h1>
        
        <img src="https://kathykwylie.com/wp-content/uploads/2010/07/RightAngledIsoscelesTriangleAngles2-300x300.jpg">
        
        <form name="form3" id="form3" method="POST" action="acl3?clacType=hypotenuse">
            <table>
                <tr>
                    <td>Enter a:</td> <td><input type="text" value="" name="sideA"></td>
                </tr>
                <tr>
                    <td>Enter b:</td> <td><input type="text" value="" name="sideB"></td>
                </tr>
                <br>
                <h1>The hypotenuse is : ${hypotenuse}</h1>
                <br>
            </table>
            
            <input type="submit" name="submit" value="Submit">
        </form>
    </body>
</html>
