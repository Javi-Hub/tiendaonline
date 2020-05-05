package com.sanvalero.tiendaOnline.model;

public class Producto {
	private String nombre;
	private String descripcion;
	private float precio;
	private String foto;
	private String[] etiquetas;
	private int valoracion;
	private int stock;
	
	public Producto(String nombre, String descripcion, float precio, String foto, String[] etiquetas, int valoracion,
			int stock) {
		super();
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.precio = precio;
		this.foto = foto;
		this.etiquetas = etiquetas;
		this.valoracion = valoracion;
		this.stock = stock;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

	public String[] getEtiquetas() {
		return etiquetas;
	}

	public void setEtiquetas(String[] etiquetas) {
		this.etiquetas = etiquetas;
	}

	public int getValoracion() {
		return valoracion;
	}

	public void setValoracion(int valoracion) {
		this.valoracion = valoracion;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}
	
	
}
