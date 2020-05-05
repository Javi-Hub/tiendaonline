package com.sanvalero.tiendaOnline.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public class Carrito {
	private LocalDate fechaPedido;
	private LocalDate fechaEntrega;
	private String estado;
	private float precioTotal;
	private float descuento;
	
	private List<DetalleCarrito> detalles;
	
	public Carrito(LocalDate fechaPedido, LocalDate fechaEntrega, String estado, float precioTotal, float descuento) {
		super();
		this.fechaPedido = fechaPedido;
		this.fechaEntrega = fechaEntrega;
		this.estado = estado;
		this.precioTotal = precioTotal;
		this.descuento = descuento;
		
		detalles = new ArrayList<>();
	}
	
	
	public LocalDate getFechaPedido() {
		return fechaPedido;
	}
	public void setFechaPedido(LocalDate fechaPedido) {
		this.fechaPedido = fechaPedido;
	}
	public LocalDate getFechaEntrega() {
		return fechaEntrega;
	}
	public void setFechaEntrega(LocalDate fechaEntrega) {
		this.fechaEntrega = fechaEntrega;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public float getPrecioTotal() {
		return precioTotal;
	}
	public void setPrecioTotal(float precioTotal) {
		this.precioTotal = precioTotal;
	}
	public float getDescuento() {
		return descuento;
	}
	public void setDescuento(float descuento) {
		this.descuento = descuento;
	}
	
	public void anadirProducto(Producto producto, int cantidad) {
		DetalleCarrito detalle = new DetalleCarrito(producto.getPrecio(), cantidad, producto);
		detalles.add(detalle);
	}
		
	
}
