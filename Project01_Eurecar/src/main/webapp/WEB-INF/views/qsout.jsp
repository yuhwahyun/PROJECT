<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1 align="left">1:1문의</h1>
내 문의내역
<input type="button" value="1:1문의하기" onclick="location.href='qs'">
<table border="1" align="center">
<tr>
	<th>번호</th><th>제목</th><th>문의일</th>
</tr>
<c:forEach items="${list }" var="qs">
<tr>
	<td>${qs.num }</td>
	<td>${qs.title }</td>
	<td>
	<fmt:parseDate value="${qs.rdate }" var="rdate" pattern="yyyy-MM-dd"/>
	<fmt:formatDate value="${rdate }" pattern="yyyy.MM.dd"/>
	</td>	
</tr>
</c:forEach>
</table>
</body>
</html>