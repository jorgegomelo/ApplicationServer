<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Books</title>
</head>
<body style="font-family: Times">
	<h1 style="color: #0000FF">
		<strong>List of all Book's Titles</strong>
	</h1>
	<h2 style="color: #404040">
		<c:forEach var="item" items="${myListBooks}">
			<div>${item}</div>
		</c:forEach>
	</h2>
	<h1 style="color: #0000FF">
		<strong>List of all Authors</strong>
	</h1>
	<h2 style="color: #404040">
		<c:forEach var="item" items="${myListAuthors}">
			<div>${item}</div>
		</c:forEach>
	</h2>
	<h4 style="color: #404040">
		<strong>Jorge Melo e </strong> <strong>Xavier Pinho</strong>
	</h4>
</body>
</html>