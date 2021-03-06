package com.sanvalero.tiendaOnline.model;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
	private String nombreUsuario;
	private String contrasena;
	private String email;
	private String dni;
	private String direccion;
	private List<Mensaje> mensajesEnviados;
	private List<Mensaje> mensajesRecibidos;
	
	
	public Usuario(String nombreUsuario, String contrasena, String email, String dni, String direccion) {
		super();
		this.nombreUsuario = nombreUsuario;
		this.contrasena = contrasena;
		this.email = email;
		this.dni = dni;
		this.direccion = direccion;
		
		mensajesEnviados = new ArrayList<>();
		mensajesRecibidos = new ArrayList<>();
	}
	
	public String getNombreUsuario() {
		return nombreUsuario;
	}
	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}
	public String getContrasena() {
		return contrasena;
	}
	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
}
