<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<script type="text/javascript">
function check(){
	var f = document.form1;	
	var id1 = /^[a-z0-9]{4,14}$/;
	var p1 = /^[a-zA-Z0-9~!@#$%^&*()_+|<>?:{}/]{8,15}$/;
	
	if(f.id.value==""){
		alert("아이디 또는 비밀번호를 잘못 입력하셨습니다.");
		f.id.select();
		return false;
	}
	if(!id1.test(f.id.value)){
		alert("아이디 또는 비밀번호를 잘못 입력하셨습니다.");
		f.id.select();
		return false;
	}
	if(f.pw.value==""){
		alert("아이디 또는 비밀번호를 잘못 입력하셨습니다.");
		f.pw.select();
		return false;
	}
	if(!p1.test(f.pw.value)){
		alert("아이디 또는 비밀번호를 잘못 입력하셨습니다.")
		f.pw.select();
		return false;
	}
	f.submit();
}
</script>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Eurecar</h1>
	<form name="form1" action="login" method="post" >
	
				<input type="text" name="id" placeholder="아이디"><br>
			
				<input type="password" name="pw" placeholder="비밀번호"><br>
			
			
				
				<input type="submit" value="로그인" onclick="return check()"><br>
			
	</form>
</body>
</html>