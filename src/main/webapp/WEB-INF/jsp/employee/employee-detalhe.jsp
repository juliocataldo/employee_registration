<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>    
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<!DOCTYPE html>
<html>

<head>

    <title>Funcionario - Detalhe</title>
    
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
        <div class="row">
            <div class="col-lg-12">
                <div class="well">
					
					<h2>Funcionários</h2>
					
						<div class="form-group">
							<label class="control-label" for="nome">Nome:</label>
							<b>${employee.nome}</b>
                        </div>
                        
                        <div class="form-group">
							<label class="control-label" for="nome">Departamento:</label>
							<label class="label label-default">${employee.departments.nomeDepartment}</label>
                        </div>
                        
                        <div class="form-group">
							<label class="control-label" for="nome">Escolaridade:</label>
							<label class="label label-default">${employee.degrees.nomeDegree}</label>
                        </div>
                        
                        <div class="form-group">
							<label class="control-label" for="nome">Email:</label>
							<label class="label label-default">${employee.email}</label>
						</div>
						
						<hr>
						
						<a class="btn btn-default btn-lg" href="${contextPath}/employee">Voltar</a>
                            
                        <br>
                        <br>
					
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