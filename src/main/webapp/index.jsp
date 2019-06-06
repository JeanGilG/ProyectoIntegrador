<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registro</title>
<link rel="stylesheet" href="css/bootstrap.min.css" />
<link rel="stylesheet" href="css/styles.css" />
</head>
<body>
	<header>
	<div class="container">
		<h1>Sistema</h1>
	</div>
	</header>
	<div class="container">
		<section class="main row"> 

			
				<h2>Lista de tablas del sistema</h2>
				<ul class="list-group">
					<li class="list-group-item">
						<s:a action="listarProductos" cssClass="btn btn-success">Productos</s:a>
					</li>
					<li class="list-group-item">
						<s:a action="listarUsuarios" cssClass="btn btn-success">Usuarios</s:a>
					</li>
				</ul>


		</section>
	</div>
	
	<footer>
		<div class="container">
			<h4>Sistema</h3>
		</div>
	</footer>

	<script type="text/javascript" src="js/jquery.js"></script>
	<script type="text/javascript" src="js/bootstrap.min.js"></script>
</body>
</html>