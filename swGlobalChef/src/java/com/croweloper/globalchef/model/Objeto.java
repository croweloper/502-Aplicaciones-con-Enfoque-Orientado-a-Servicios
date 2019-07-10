package com.croweloper.globalchef.model;

import java.util.List;

public class Objeto<T> {
	
	public String codigo;
	public String mensaje;
	
	public List<T> objeto;

	public Objeto() {
		
	}

	public Objeto(String codigo, String mensaje) {
		super();
		this.codigo = codigo;
		this.mensaje = mensaje;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

	public List<T> getObjeto() {
		return objeto;
	}

	public void setObjeto(List<T> objeto) {
		this.objeto = objeto;
	}

}
