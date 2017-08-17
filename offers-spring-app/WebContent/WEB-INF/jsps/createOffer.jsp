<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>New Offer</title>
</head>
<body>
	<form action="${pageContext.request.contextPath}/offers/doCreate" method="get">
		Name: <input type="text" name="name"> <br />
		Email: <input type="text" name="email"> <br />
		Offer: <input type="text" name="offer"> <br />
		<input type="submit" value="Save">
	</form>
	<br>
	<a href="${pageContext.request.contextPath}">Home</a>
</body>
</html>