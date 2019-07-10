package com.croweloper.globalchef.model;

public class Pais {
	
	private String pais_codigo;	
    private String pais_nombre;
	private int pais_estado;
	public String getPais_codigo() {
		return pais_codigo;
	}
	public void setPais_codigo(String pais_codigo) {
		this.pais_codigo = pais_codigo;
	}
	public String getPais_nombre() {
		return pais_nombre;
	}
	public void setPais_nombre(String pais_nombre) {
		this.pais_nombre = pais_nombre;
	}
	public int getPais_estado() {
		return pais_estado;
	}
	public void setPais_estado(int pais_estado) {
		this.pais_estado = pais_estado;
	}
	public Pais(String pais_codigo, String pais_nombre, int pais_estado) {
		super();
		this.pais_codigo = pais_codigo;
		this.pais_nombre = pais_nombre;
		this.pais_estado = pais_estado;
	}
	
	public Pais() {

	}
	
	

}
