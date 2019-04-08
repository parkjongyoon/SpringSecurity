<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
	<body>
		<table border="1">
		<tr>
			<td>아이디</td>
			<td>비밀번호</td>
		</tr>
		<c:forEach items="${userList}" var="userList">
			<tr>
			<td>${userList.username}</td>
			<td>${userList.password}</td>
			</tr>
		</c:forEach>
		</table>
	</body>
</html>