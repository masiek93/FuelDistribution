<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>SYSTEM DYSTRYBUCJI PALIW PŁYNNYCH | Flota Cystern</title>
		<style>
			tr:first-child{
            	font-weight: bold;
            	background-color: #C6C9C4;
        	}
		
		</style>
	</head>
	<body>
		<br />
		<br />
		<center><h2>Lista cystern:</h2></center>	
		<table>
		<tr>
            <td>ID</td><td>Nazwa Cysterny</td><td>Pojemność</td><td>Status</td><td>Ostatnia pozycja</td><td>Usuń</td>
        </tr>
        <c:forEach items="${cisternList}" var="cistern">
            <tr>
            <td>${cistern.cisternId}</td> 
            <td>${cistern.name}</td>
            <td>${cistern.capacity}</td>
            <td>${cistern.status}</td>
            <td>${cistern.lastPosition}</td>
            <td><a href="<c:url value='/usun-${cistern.cisternId}-cysterne' />">Usuń</a></td>
            </tr>
        </c:forEach>
		</table>
		<br />
    	<br />
    	<h3><a href="cysterna/dodaj">Dodaj cysternę</a></h3>
	</body>
</html>