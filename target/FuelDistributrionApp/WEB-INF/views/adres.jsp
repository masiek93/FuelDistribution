<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>SYSTEM DYSTRYBUCJI PALIW PŁYNNYCH | Dodawanie Adresu</title>
				<style>
		.error {
			color: #ff0000;
		}

		.errorblock {
			color: #000;
			background-color: #ffEEEE;
			border: 3px solid #ff0000;
			padding: 8px;
			margin: 16px;
		}
	</style>
	</head>
	<body>
		<br />
		<h2>Dodawanie Adresu:</h2>
		<br />	
		<form:form method="POST" modelAttribute="addressForm" >
			<table>
			<tr>
				<td>Nazwa Ulicy:</td>
				<td><form:input type="text" path="formStreetName" id="formStreetName" /></td>
				<td><c:if test="${pageContext.request.method=='POST'}"><form:errors path="formStreetName" cssClass="error" /></c:if></td>
			</tr>
			<tr>
				<td>Numer Budynku: </td>
				<td><form:input type="text" path="formBuildingNumber" id="formBuildingNumber" /></td>
				<td><c:if test="${pageContext.request.method=='POST'}"><form:errors path="formBuildingNumber" cssClass="error" /></c:if></td>
			</tr>
			<tr>
				<td>Kod Pocztowy:</td>
				<td><form:input type="text" path="formPostalCode" id="formPostalCode" /></td>
				<td><c:if test="${pageContext.request.method=='POST'}"><form:errors path="formPostalCode" cssClass="error" /></c:if></td>
			</tr>
			<tr>
				<td>Miasto:</td>
				<td><form:input type="text" path="formCity" id="formCity" /></td>
				<td><c:if test="${pageContext.request.method=='POST'}"><form:errors path="formCity" cssClass="error" /></c:if></td>
			</tr>
			<tr>
				<td colspan="4"><input type="submit" value="Wyślij formularz" /></td>
			</tr>
			</table>
 		</form:form>
	</body>
</html>