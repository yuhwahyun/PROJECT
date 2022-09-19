<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<header>
<c:set var ="result" value="${param.result }"/>
<c:choose>
	<c:when test="${result=='loginfail' }">
		<script type="text/javascript">
			window.onload=function(){
				alert("아이디 또는 비밀번호를 잘못 입력하셨습니다.");
			}
		</script>
	</c:when>
</c:choose>	
	<table>
		<tr>
			<td><h1>회원 정보 관리</h1></td>
			<td width="300">
				<c:choose>
					<c:when test="${loginstate==true}">
						<a href=""><span> ${member.name } 님</span></a>&emsp;
						<a href="logout">로그아웃</a>
					</c:when>
					<c:when test="${adminstate==true}">
						<a href=""><span> ${admin1.id }</span></a>&emsp;
						<a href="logout">로그아웃</a>
					</c:when>
					<c:otherwise>
						<a href="logingo">로그인</a>
					</c:otherwise>
				</c:choose>
			</td>
		</tr>
	</table>
</header>
<nav class="navbar navbar-inverse">
	<div class="container-fluid">
		<div class="navbar-header">
		<a class="navbar-brand" href="index"><span class="glyphicon glyphicon-home"></span></a>
		</div>
		<ul class="nav navbar-nav">
			<li class="active">
				<a class="dropdown-toggle" data-toggle="dropdown" href="#">
					회원관리<span class="caret"></span>
				</a>
				<ul class="dropdown-menu">
					<li><a href="Joininput">회원가입</a></li>					
					<li><a href="qs">1대1문의</a></li>
					<li class="divider"></li>
					
				</ul>
        	</li>
		</ul>
		
		<ul class="nav navbar-nav">
			<li class="active">
				<a class="dropdown-toggle" data-toggle="dropdown" href="#">
					게시판<span class="caret"></span>
				</a>
				<ul class="dropdown-menu">
					<li><a href="boardinput">글작성</a></li>	
						<li><a href="boardout">글목록</a></li>						
					<li class="divider"></li>
					
				</ul>
        	</li>
		</ul>
		
		
		
		
	
	</div>
</nav>
</body>
</html>