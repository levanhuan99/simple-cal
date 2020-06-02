<%--
  Created by IntelliJ IDEA.
  User: VanHuan
  Date: 6/2/2020
  Time: 10:06 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>$Title$</title>
</head>
<body>
<h1>calculator</h1>

<form action="${pageContext.request.contextPath}/CalculatorServlet" method="post">
    <fieldset>
        <legend>calculator:</legend>
        <label for="fname">First operand:</label>
        <input type="number" id="fname" name="firstOperand"><br><br>

        <select name="operator" >
            <option value="sub">-</option>
            <option value="plus">+</option>
            <option value="mul">*</option>
            <option value="div">/</option>
        </select><br>
        <label for="lname">second operand:</label>
        <input type="number" id="lname" name="secondOperand"><br><br>


        <input type="submit" value="Submit">
    </fieldset>
</form>

</body>
</html>
