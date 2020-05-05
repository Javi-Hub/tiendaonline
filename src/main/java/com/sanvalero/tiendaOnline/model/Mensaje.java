package com.sanvalero.tiendaOnline.model;

import java.time.LocalDate;

public class Mensaje {
	private LocalDate fecha;
	private String mensaje;
	private boolean recibido;
	
	private Usuario usuarioEmisor;
	private Usuario usuarioReceptor;
	public Mensaje(LocalDate fecha, String mensaje, boolean recibido, Usuario usuarioEmisor, Usuario usuarioReceptor) {
		super();
		this.fecha = fecha;
		this.mensaje = mensaje;
		this.recibido = recibido;
		this.usuarioEmisor = usuarioEmisor;
		this.usuarioReceptor = usuarioReceptor;
	}
	public LocalDate getFecha() {
		return fecha;
	}
	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}
	public String getMensaje() {
		return mensaje;
	}
	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
	public boolean isRecibido() {
		return recibido;
	}
	public void setRecibido(boolean recibido) {
		this.recibido = recibido;
	}
	public Usuario getUsuarioEmisor() {
		return usuarioEmisor;
	}
	public void setUsuarioEmisor(Usuario usuarioEmisor) {
		this.usuarioEmisor = usuarioEmisor;
	}
	public Usuario getUsuarioReceptor() {
		return usuarioReceptor;
	}
	public void setUsuarioReceptor(Usuario usuarioReceptor) {
		this.usuarioReceptor = usuarioReceptor;
	}
	
	
}
