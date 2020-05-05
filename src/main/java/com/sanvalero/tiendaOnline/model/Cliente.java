package com.sanvalero.tiendaOnline.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Cliente extends Usuario {
	
	private String direccionEntrega;
	private int puntosAcumulados;
	private LocalDate fechaAlta;
	
	List<Carrito> carritos;
	
	public Cliente(String nombreUsuario, String contrasena, String email, String dni, String direccion,
			String direccionEntrega, int puntosAcumulados, LocalDate fechaAlta) {
		super(nombreUsuario, contrasena, email, dni, direccion);
		this.direccionEntrega = direccionEntrega;
		this.puntosAcumulados = puntosAcumulados;
		this.fechaAlta = fechaAlta;
		
		carritos =new ArrayList<>();
	}

	public String getDireccionEntrega() {
		return direccionEntrega;
	}

	public void setDireccionEntrega(String direccionEntrega) {
		this.direccionEntrega = direccionEntrega;
	}

	public int getPuntosAcumulados() {
		return puntosAcumulados;
	}

	public void setPuntosAcumulados(int puntosAcumulados) {
		this.puntosAcumulados = puntosAcumulados;
	}

	public LocalDate getFechaAlta() {
		return fechaAlta;
	}

	public void setFechaAlta(LocalDate fechaAlta) {
		this.fechaAlta = fechaAlta;
	}
	
	
}
