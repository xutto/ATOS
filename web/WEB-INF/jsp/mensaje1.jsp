<%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>${men}</h1>
        <spring:message code="mensaje.prueba.hello"/>
        
        <br/>
                <a href="mensaje1.htm?lenguaje=es">pinchaR AQUI para español</a><br/>
        <a href="mensaje1.htm?lenguaje=en">pinchaR AQUI para ingles</a><br/>
        
    </body>
</html>
