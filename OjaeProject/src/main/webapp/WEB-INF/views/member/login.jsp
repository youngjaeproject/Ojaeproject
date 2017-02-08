<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<div id="login">
	<h2>회원로그인</h2>
	<form action="/member/login"method="post">
	아이디<input type="text" name="id"/><br/>
	비밀번호<input type="password" name="pwd"/><br/>
	<div style="font-size: 13px;color:red">${errMsg }</div>
	<input type="submit" value="로그인"/>
	<input type="reset" value="취소"/>
	</form>
</div>