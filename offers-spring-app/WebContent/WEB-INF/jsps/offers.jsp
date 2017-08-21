<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="${pageContext.request.contextPath}/static/css/main.css" rel="stylesheet" type="text/css">
<title>Offers</title>
</head>
<body>
	<h1>Offers</h1>
	<table class="offers-table">
		<thead>
			<tr>
				<th>Id</th>
				<th>User</th>
				<th>Email</th>
				<th>Offer</th>
				<th></th>
				<th></th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="offer" items="${offers}">

				<c:choose>
					<c:when test="${offer.id eq edit}">
						<form method="post" action="${pageContext.request.contextPath}/offers/edit">
							<tr>
								<td>${offer.id}</td>
								<td><input value="${offer.userName}" name="name" type="text"></td>
								<td><input value="${offer.email}" name="email" type="text"></td>
								<td><input value="${offer.offerText}" name="offer" type="text"></td>
								<td><input value="Save" type="submit"></td>
								<td><a href="${pageContext.request.contextPath}/offers">Cancel</a></td>
							</tr>
						</form>

					</c:when>
					<c:otherwise>
						<tr>
							<td>${offer.id}</td>
							<td>${offer.userName}</td>
							<td>${offer.email}</td>
							<td>${offer.offerText}</td>
							<td><a href="${pageContext.request.contextPath}/offers/edit/${offer.id}">Edit</a></td>
							<td><a href="${pageContext.request.contextPath}/offers/delete/${offer.id}">Delete</a></td>
						</tr>
					</c:otherwise>
				</c:choose>
			</c:forEach>
		</tbody>
	</table>

	<a href="${pageContext.request.contextPath}/">Home</a>

</body>
</html>