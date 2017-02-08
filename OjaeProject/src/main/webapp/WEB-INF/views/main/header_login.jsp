<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<div id="header_login">
	<ul >
		<c:choose>
			<c:when test="${empty id }">
				<li><a href="/mvc/member/login">로그인</a></li>
			</c:when>
			<c:otherwise>
				<li>님 반갑습니다.
				<a href="/user/logout">로그아웃</a></li>
			</c:otherwise>
		</c:choose>
	</ul>
</div>
