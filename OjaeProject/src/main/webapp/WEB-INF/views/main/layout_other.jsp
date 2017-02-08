<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>layout</title>
<link rel="stylesheet" href="/mvc/resources/css/main.css" type="text/css">
</head>
<body>
<div id="wrap">
	<div class="header_login">
	<!-- tiles-def.xml에 정의된 attribut name속성값을 이용해 페이지포함 -->
		<tiles:insertAttribute name="header_login"/>
	</div>
	<div class="header_menu">
	<!-- tiles-def.xml에 정의된 attribut name속성값을 이용해 페이지포함 -->
		<tiles:insertAttribute name="header_menu"/>
	</div>
	<div class="left">
		<tiles:insertAttribute name="left"/>
	</div>
	<div class="content">
		<tiles:insertAttribute name="content"/>
	</div>
	<div class="footer">
	<tiles:insertAttribute name="footer"/>
	</div>
</div>
</body>
</html>