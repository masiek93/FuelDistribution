<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>SYSTEM DYSTRYBUCJI PALIW PŁYNNYCH | Lista Adresów</title>
		<style>
			tr:first-child{
            	font-weight: bold;
            	background-color: #C6C9C4;
        	}
		
		</style>
	</head>
	<body>
		<br />
		<h2>Lista Adresów:</h2>
		<br />	
<table>
        <tr>
            <td>ID</td><td>Nazwa Ulicy</td><td>Nr Budynku</td><td>Kod pocztowy</td><td>Miasto</td><td>Usuń</td>
        </tr>
        <c:forEach items="${addresses}" var="address">
            <tr>
            <td>${address.addressId}</td>
            <td>${address.streetName}</td>
            <td>${address.buildingNumber}</td>
            <td>${address.postalCode}</td>
            <td>${address.city}</td>
            <td><a href="<c:url value='/usun-${address.addressId}-adres' />">Usuń</a></td>
            </tr>
        </c:forEach>
    </table>
    <br />
    <br />
    <h3><a href="adres/dodaj">Dodaj adres</a></h3>
	</body>
</html>