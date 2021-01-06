<jsp:useBean id="PersonBean" class="br.com.dailson.jpa.bean.PersonBean"
	type="br.com.dailson.jpa.bean.PersonBean" scope="page" />
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP</title>
<!-- CSS only -->
</head>
<body>
	<jsp:setProperty property="*" name="PersonBean"/>
	<h1>Released!</h1>
</body>
</html>