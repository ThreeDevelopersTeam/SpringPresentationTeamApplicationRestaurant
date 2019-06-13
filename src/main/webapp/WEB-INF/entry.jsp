<%--
  Created by IntelliJ IDEA.
  User: Oleh
  Date: 6/13/2019
  Time: 10:33 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Entry</title>
</head>
<body>
<div>
    <form method="post" action="/entryUser">
        <input type="text" name="nickName" placeholder="type nickName" required/>
        <input type="password" name="password" placeholder="type password"required/>
        <button type="submit">entry</button>
    </form>
</div>
</body>
</html>
