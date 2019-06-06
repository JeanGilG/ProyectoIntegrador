<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Editar</title>
<link rel="stylesheet" href="./css/bootstrap.min.css" />
<link rel="stylesheet" href="./css/styles.css" />
</head>
<body>
<header>
	<div class="container">
		<h1>Editar</h1>
	</div>
</header>
	<div class="container">
		<section class="main row"> 
				<h1> Editar Usuario</h1>
				<s:form action="actualizarUsuario">
					<s:hidden name="registro.idUsu" />
					<div class="form-group">
						<s:label for="registro.apeUsu" value="Apellidos" />
						<s:textfield name="registro.apeUsu" cssClass="form-control" />
					</div>
					<div class="form-group">
						<s:label for="registro.nomUsu" value="Nombres" />	
						<s:textfield name="registro.nomUsu" cssClass="form-control"/>
					</div>
					<div class="form-group">
						<s:label for="registro.claveUsu" value="Clave" />
						<s:textfield name="registro.claveUsu" cssClass="form-control" />
					</div>
					<div class="form-group">
						<s:label for="registro.idTipoEmpleado" value="Codigo Empleado" />
						<s:textfield name="registro.idTipoEmpleado" cssClass="form-control" />
					</div>
					<s:submit value="Actualizar" cssClass="btn btn-success"/>
				</s:form>
			</section>
	</div>
	
	<footer>
		<div class="container">
			<h4></h3>
		</div>
	</footer>
	
	<script type="text/javascript" src="js/jquery.js"></script>
	<script type="text/javascript" src="js/bootstrap.min.js"></script>
</body>
</html>