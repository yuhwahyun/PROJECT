<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
<style type="text/css">
 form {text-align: center; width: 100%;}
</style>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action ="qsave", method="post">
		<h3>1:1문의</h3>
		<h4>문의하기</h4> 
		<div class="">
				<input type="button" value="내 문의내역" onclick="location.href='qsout'">
				</div>
				
				
		이메일&emsp; ${member.email}<br> 
		
		
		문의항목&emsp; <input type="radio" name="qlist" value="사이트이용 문의">사이트이용 문의&emsp;
					<input type="radio" name="qlist" value="장애/오류 문의">장애/오류 문의&emsp;
					<input type="radio" name="qlist" value="기타 문의">기타 문의<br>
		제목&emsp;   <input type="text" name="title"> <br><br>
		
		<textarea style="width: 521px; height: 402px;" name="content"></textarea> <br><br>
		
		<input type="submit" value="등록"> <input type="button" value="취소" onclick="location.href='index'">
	</form>
</body>
</html>