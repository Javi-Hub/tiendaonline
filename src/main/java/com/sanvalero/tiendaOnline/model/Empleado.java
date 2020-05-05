package com.sanvalero.tiendaOnline.model;

public class Empleado extends Usuario {
	private String perfil;
	private String departamento;
	
	public Empleado(String nombreUsuario, String contrasena, String email, String dni, String direccion, String perfil,
			String departamento) {
		super(nombreUsuario, contrasena, email, dni, direccion);
		this.perfil = perfil;
		this.departamento = departamento;
	}

	public String getPerfil() {
		return perfil;
	}

	public void setPerfil(String perfil) {
		this.perfil = perfil;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	
	public void anadirProducto(Producto producto, Seccion seccion) {
		//Añade el producto a la sección correspondiente
	}
	
}
