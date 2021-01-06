<jsp:useBean id="PersonBean" class="br.com.dailson.jpa.bean.PersonBean"
	type="br.com.dailson.jpa.bean.PersonBean" scope="page" />
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP</title>

</head>
<body>


	<form action="LoginServlet" method="post">

		Name:
		<input type="text" id="login" name="login" />
		
		<br/>
		
		Password:
		<input type="password" id="password" name="password"/>
		
		
		<input type="submit" value="Submit" />

	</form>

</body>
</html>