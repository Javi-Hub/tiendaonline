package com.sanvalero.tiendaOnline.model;

import java.util.ArrayList;
import java.util.List;

public class Seccion {
	private String nombre;
	private String descripcion;
	private String categoria;
	
	private List<Producto> productos;

	public Seccion(String nombre, String descripcion, String categoria, List<Producto> productos) {
		super();
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.categoria = categoria;
		this.productos = productos;
		productos = new ArrayList<>();
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

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public List<Producto> getProductos() {
		return productos;
	}

	public void setProductos(List<Producto> productos) {
		this.productos = productos;
	}
	
	
}
