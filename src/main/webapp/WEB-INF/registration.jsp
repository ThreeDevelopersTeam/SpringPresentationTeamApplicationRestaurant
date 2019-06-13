<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Registration</title>
</head>
<body>
<div>
    <form method="post" action="/addUser">
        <input type="text" name="name" placeholder="type name" required/>
        <input type="password" name="password" placeholder="type password"required/>
        <input type="text" name="nickname" placeholder="type nickname"required/>
        <select name="restaurantId" placeholder="chose restaurant">
            <c:forEach items="${restaurants}" var="restaurant">
                <option value="${restaurant.id}"><c:out value="${restaurant.name}"/></option>
            </c:forEach>
        </select>
        <button type="submit">add</button>
    </form>
</div>
</body>
</html>
