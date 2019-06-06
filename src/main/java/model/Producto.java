package model;

import java.util.Date;

public class Producto {
	private int idProd;
	private String nombProd;
	private double precio_venta;
	private double precio_compra;
	private int stock;
	private Date fecha_ingreso;
	private String lote;
	private Date fecha_fab;
	private int idDetOrden;
	private int idCate;
	public int getIdProd() {
		return idProd;
	}
	public void setIdProd(int idProd) {
		this.idProd = idProd;
	}
	public String getNombProd() {
		return nombProd;
	}
	public void setNombProd(String nombProd) {
		this.nombProd = nombProd;
	}
	public double getPrecio_venta() {
		return precio_venta;
	}
	public void setPrecio_venta(double precio_venta) {
		this.precio_venta = precio_venta;
	}
	public double getPrecio_compra() {
		return precio_compra;
	}
	public void setPrecio_compra(double precio_compra) {
		this.precio_compra = precio_compra;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public Date getFecha_ingreso() {
		return fecha_ingreso;
	}
	public void setFecha_ingreso(Date fecha_ingreso) {
		this.fecha_ingreso = fecha_ingreso;
	}
	public String getLote() {
		return lote;
	}
	public void setLote(String lote) {
		this.lote = lote;
	}
	public Date getFecha_fab() {
		return fecha_fab;
	}
	public void setFecha_fab(Date fecha_fab) {
		this.fecha_fab = fecha_fab;
	}
	public int getIdDetOrden() {
		return idDetOrden;
	}
	public void setIdDetOrden(int idDetOrden) {
		this.idDetOrden = idDetOrden;
	}
	public int getIdCate() {
		return idCate;
	}
	public void setIdCate(int idCate) {
		this.idCate = idCate;
	}
	
	
}
