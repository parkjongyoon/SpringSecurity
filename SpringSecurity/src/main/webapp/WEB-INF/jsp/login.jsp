<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!doctype html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
</head>
<body>
<c:if test="${param.error != null}">
    ${param}
</c:if>
로그인 페이지
<form:form action="/login" method="post">
    <input type="text" name="username" value="abc"> 
    <input type="password" name="password" value="abcd">
    <input type="submit" value="로그인">
</form:form>
</body>
</html>