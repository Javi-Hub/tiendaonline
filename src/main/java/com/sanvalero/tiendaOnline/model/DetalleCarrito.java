package com.sanvalero.tiendaOnline.model;

public class DetalleCarrito {
	private float precio;
	private int cantidad;
	
	private Producto producto;
	
	
	public DetalleCarrito(float precio, int cantidad, Producto producto) {
		super();
		this.precio = precio;
		this.cantidad = cantidad;
		this.producto = producto;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}
	
	
}
