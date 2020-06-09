<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>    
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page isErrorPage="true" %>

<!DOCTYPE html>
<html>

<head>

    <title>Funcionários - Editar</title>
    
    <c:set value="${pageContext.request.contextPath}" var="contextPath"/>
    
    <link href="${contextPath}/css/bootstrap.css" rel="stylesheet">
    <link href="${contextPath}/css/small-business.css" rel="stylesheet">

</head>

<body>
    
    <nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
        <div class="container">
            <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                <ul class="nav navbar-nav">
                    <li>
                        <a href="${contextPath}/employee">Funcionários</a>
                    </li>
                </ul>
            </div>
        </div>
    </nav>
    
    <div class="container">

        <!-- Call to Action Well -->
        <div class="row">
            <div class="col-lg-12">
                <div class="well">
					
					<h2>Funcionário</h2>
					
					<form:form modelAttribute="employeeModel" action="${contextPath}/employee/${employeeModel.id}" method="put">
					
						<spring:hasBindErrors name="employeeModel">
							<div class="alert alert-danger" role="alert">
								<form:errors path="*" class="has-error" />
							</div>
						</spring:hasBindErrors>
					
						<div class="form-group">
							<label class="control-label" for="nome">Nome:</label>
							<form:input type="text" path="nome" id="nome" class="form-control" maxlength="50" size="50" />
							<font color="red"><form:errors path="nome"/></font><br/>
                        </div>
                        
                         <div class="form-group">
                        	<label class="control-label" for="departments">Departamento:</label>
                        
	                        <form:select path="departments.idDepartment">
	                        	<form:options items="${departments}" itemValue="idDepartment" itemLabel="nomeDepartment" />
	                        </form:select>
						</div>
						
						<div class="form-group">
                        	<label class="control-label" for="marca">Escolaridade:</label>
                        	<br>
	                        <form:select path="degrees">
	                        	<form:options items="${degrees}" itemValue="idDegree" itemLabel="nomeDegree" />
	                        </form:select>
						</div>
						
						<div class="form-group">
							<label class="control-label" for="nome">E-mail:</label>
							<form:input type="text" path="email" id="email" class="form-control" maxlength="50" size="50" />
							<font color="red"><form:errors path="email"/></font><br/>
						</div>
						
						<hr>
						
						<a class="btn btn-default btn-lg" href="${contextPath}/employee">Cancelar</a>
						<button type="submit" class="btn btn-primary btn-lg">Gravar</button>
                            
                        <br>
                        <br>
					</form:form>
					
                </div>
            </div>
        </div>
    </div>

    <!-- jQuery -->
    <script src="${contextPath}/js/jquery.js"></script>

    <!-- Bootstrap Core JavaScript -->
    <script src="${contextPath}/js/bootstrap.min.js"></script>

</body>
</html>