<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action ="question">
		<h3>1:1문의</h3>
		<h4>문의하기</h4> 
		<div class="">
					<a href="" ><span>내 문의내역</span></a>
				</div>
		이메일&emsp; ${dto.email} <br><br>
		 
		문의항목&emsp; <input type="radio" name="qlist" value="사이트이용 문의">사이트이용 문의&emsp;
					<input type="radio" name="qlist" value="장애/오류 문의">장애/오류 문의&emsp;
					<input type="radio" name="qlist" value="기타 문의">기타 문의<br>
		제목&emsp;   <input type="text" name="title"> <br><br>
		
		<textarea style="width: 521px; height: 402px;" name="content"></textarea>
	</form>
</body>
</html>