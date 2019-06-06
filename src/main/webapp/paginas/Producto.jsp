<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Mantenedor</title>
<link rel="stylesheet" href="./css/bootstrap.min.css" />
<link rel="stylesheet" href="./css/styles.css" />
</head>
<body>
<header>
	<div class="container">
		<h1>Sistema</h1>
	</div>
</header>
	<div class="container">
		<section class="main row"> 
				<h1>Listado</h1>
				<h3>Existen <s:property value="rows" /> registros </h3>
				<p>
					<s:a action="nuevoProducto" cssClass="btn btn-success">Agregar Producto</s:a>
				</p>
				<p>
					<h4><s:property value="mensaje" />  </h4>
				</p>
				<hr />
				<table class="table table-striped table-bordered">
					<thead>	
						<th>IDProducto</th>
						<th>Nombre</th>
						<th>Precio Venta</th>
						<th>Precio Compra</th>
						<th>Stock</th>
						<th>Fecha de Ingreso</th>
						<th>Lote</th>
						<th>Fecha de Fabricacion</th>
						<th>CodigoOrden</th>
						<th>Categoria</th>
						<th>Acciones</th>
				
					</thead>
					<tbody>
						<s:iterator value="grdProducto" var="item" status="estado">
							<tr>
								<td><s:property value="#item.idProd" /></td>
								<td><s:property value="#item.nombProd" /></td>
								<td><s:property value="#item.precio_venta" /></td>
								<td><s:property value="#item.precio_compra" /></td>
								<td><s:property value="#item.stock" /></td>
								<td><s:property value="#item.fecha_ingreso" /></td>
								<td><s:property value="#item.lote" /></td>
								<td><s:property value="#item.fecha_fab" /></td>
								<td><s:property value="#item.idDetOrden" /></td>
								<td><s:property value="#item.idCate" /></td>
								<td>
									<s:a action="editarProducto">
										<s:param name = "idProd" value="#item.idProd"/>
										<i class="glyphicon glyphicon-pencil"></i>
									</s:a>
									<s:a action="eliminarProducto">
										<s:param name = "idProd" value="#item.idProd"/>
										<i class="glyphicon glyphicon-trash"></i>
									</s:a>
								</td>
							</tr>
						</s:iterator>
					</tbody>
				</table>
				<s:a href="/webapp/index.jsp" cssClass="btn btn-success">Index</s:a>
			</section>
	</div>
	
	<footer>
		<div class="container">
			<h4>Registros</h3>
		</div>
	</footer>
	
	<script type="text/javascript" src="js/jquery.js"></script>
	<script type="text/javascript" src="js/bootstrap.min.js"></script>
</body>
</html>