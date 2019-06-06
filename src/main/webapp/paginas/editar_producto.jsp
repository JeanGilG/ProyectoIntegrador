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
				<h1> Editar Producto</h1>
				<s:form action="actualizarProducto">
					<s:hidden name="registro.idProd" />
					<div class="form-group">
						<s:label for="registro.nombProd" value="Nombre Producto" />
						<s:textfield name="registro.nombProd" cssClass="form-control" />
					</div>
					<div class="form-group">
						<s:label for="registro.precio_venta" value="Precio Venta" />	
						<s:textfield name="registro.precio_venta" cssClass="form-control"/>
					</div>
					<div class="form-group">
						<s:label for="registro.precio_compra" value="Precio Compra" />
						<s:textfield name="registro.precio_compra" cssClass="form-control" />
					</div>
					<div class="form-group">
						<s:label for="registro.stock" value="Stock" />
						<s:textfield name="registro.stock" cssClass="form-control" />
					</div>
					<div class="form-group">
						<s:label for="registro.fecha_ingreso" value="Fecha Ingreso" />
						<s:textfield name="registro.fecha_ingreso" cssClass="form-control" />
					</div>
					<div class="form-group">
						<s:label for="registro.lote" value="Lote" />
						<s:textfield name="registro.lote" cssClass="form-control" />
						
					</div>
					<div class="form-group">
						<s:label for="registro.fecha_fab" value="Fecha de Fabricación" />
						<s:textfield name="registro.fecha_fab" cssClass="form-control" />
						
					</div>		
					<div class="form-group">
						<s:label for="registro.idDetOrden" value="Cod Orden" />
						<s:textfield name="registro.idDetOrden" cssClass="form-control" />
						
					</div>	
					
					<div class="form-group">
						<s:label for="registro.idCate" value="ID Categoria" />
						<s:textfield name="registro.idCate" cssClass="form-control" />
						
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