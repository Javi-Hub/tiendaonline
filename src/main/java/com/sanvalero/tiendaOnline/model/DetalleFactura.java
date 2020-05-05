package com.sanvalero.tiendaOnline.model;

public class DetalleFactura {
	private String nombreProducto;
	private int cantidad;
	private float precio;
	private float subtotal;
	
	public DetalleFactura(String nombreProducto, int cantidad, float precio, float subtotal) {
		super();
		this.nombreProducto = nombreProducto;
		this.cantidad = cantidad;
		this.precio = precio;
		this.subtotal = subtotal;
	}

	public String getNombreProducto() {
		return nombreProducto;
	}

	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	public float getSubtotal() {
		return subtotal;
	}

	public void setSubtotal(float subtotal) {
		this.subtotal = subtotal;
	}
	
	
}
