<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="sf"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="${pageContext.request.contextPath}/static/css/main.css" rel="stylesheet" type="text/css">
<title>New Offer</title>
</head>
<body>

	<sf:form action="${pageContext.request.contextPath}/offers/doCreate" method="post" commandName="offer">
		<table>
			<tr>
				<td>Name</td>
				<td>
					<sf:input name="userName" path="userName" type="text" />
					<sf:errors path="userName" cssClass="error"></sf:errors>
				</td>
			</tr>
			<tr>
				<td>Email</td>
				<td>
					<sf:input name="email" path="email" type="text" />
					<sf:errors path="email" cssClass="error"></sf:errors>
				</td>
			</tr>
			<tr>
				<td>Offer</td>
				<td>
					<sf:input name="offerText" path="offerText" type="text" />
					<sf:errors path="offerText" cssClass="error"></sf:errors>
				</td>
			</tr>
		</table>
		<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
		<input type="submit" value="Save">
	</sf:form>

	<br />
	<br />
	<br />
	<a href="${pageContext.request.contextPath}">Home</a>
</body>
</html>