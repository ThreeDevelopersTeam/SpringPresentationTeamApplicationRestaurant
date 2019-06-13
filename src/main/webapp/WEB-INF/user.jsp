<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>User page</title>
</head>
<body>
${user}
<form method="post" action="/updateUser">
    <input type="text" name="name" placeholder="type name" required/>
    <input type="text" name="nickName" placeholder="type nickName" required/>
    <input type="password" name="password" placeholder="type password" required/>
    <button type="submit">update</button>
</form>
</body>
</html>
