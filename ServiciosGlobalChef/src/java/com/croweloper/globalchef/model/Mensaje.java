package com.croweloper.globalchef.model;

public class Mensaje<T> {

	public String codigo;
	public String mensaje;
	public int regisistros;
	public String entidad;
	
	public T objeto;
	
	public T getObjeto() {
		return objeto;
	}


	public void setObjeto(T objeto) {
		this.objeto = objeto;
	}


	public Mensaje() {}
	
	
	public Mensaje(String codigo, String mensaje) {
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
	
	
	
}
