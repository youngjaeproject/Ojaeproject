<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<div id="header_menu1">
		<a href="/">소개</a>
		<a href="/">도서</a>
		<a href="/">신청/예약</a>
		<a href="/">소통</a>
		<c:choose>
			<c:when test="${id eq 'admin'}">
				<a href="/">관리자페이지</a>
			</c:when>
			<c:when test="${!empty id}">
				<a href="/">마이페이지</a>
			</c:when>
		</c:choose>
</div>
<div class="common_line_green"></div>
