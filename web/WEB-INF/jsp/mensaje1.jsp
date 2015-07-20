<%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html ng-app="presentaMapa">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        
        <script src="${pageContext.request.contextPath}/resources/js/angular.min.js"></script>
        
    </head>
    <body>
        <h1>${men}</h1>
        <spring:message code="mensaje.prueba.hello"/>
        <c:set value="polloloco" var="nombre"/>
        
        <br/>
        <a href="mensaje1.htm?lenguaje=es">pinchaR AQUI para español ${nombre}</a><br/>
        <a href="mensaje1.htm?lenguaje=en">pinchaR AQUI para ingles</a><br/>
        
        <ul ng-controller="controlador1">
            <li ng-repeat=" persona in personas">
                {{ persona.nombre }} {{ persona.apellido }} {{ persona.alias }}
            </li>
        </ul>
        
        
        
        <script>
            
            var miApp = angular.module('presentaMapa',[])
            
            miApp.controller('controlador1',['$scope',function ($scope){
                    
                    
                    $scope.personas=${elgson};
            }])
            
            
        </script>
        
    </body>
</html>
