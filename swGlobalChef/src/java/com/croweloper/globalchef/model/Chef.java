package com.croweloper.globalchef.model;

public class Chef {
	
	private int chef_id;
	private String chef_nombre;	
	private String chef_apellido;	
	private String chef_correo;
	private String chef_contraseña;	
	private String chef_foto;	
	private int chef_cantseguidores;	
	private int chef_cantrecetas;	
	private int chef_contrato;	
	private String chef_paisid;	
	private String chef_descripcion;	
	private int chef_membresia;	
	private int chef_stado;
	public int getChef_id() {
		return chef_id;
	}
	public void setChef_id(int chef_id) {
		this.chef_id = chef_id;
	}
	public String getChef_nombre() {
		return chef_nombre;
	}
	public void setChef_nombre(String chef_nombre) {
		this.chef_nombre = chef_nombre;
	}
	public String getChef_apellido() {
		return chef_apellido;
	}
	public void setChef_apellido(String chef_apellido) {
		this.chef_apellido = chef_apellido;
	}
	public String getChef_correo() {
		return chef_correo;
	}
	public void setChef_correo(String chef_correo) {
		this.chef_correo = chef_correo;
	}
	public String getChef_contraseña() {
		return chef_contraseña;
	}
	public void setChef_contraseña(String chef_contraseña) {
		this.chef_contraseña = chef_contraseña;
	}
	public String getChef_foto() {
		return chef_foto;
	}
	public void setChef_foto(String chef_foto) {
		this.chef_foto = chef_foto;
	}
	public int getChef_cantseguidores() {
		return chef_cantseguidores;
	}
	public void setChef_cantseguidores(int chef_cantseguidores) {
		this.chef_cantseguidores = chef_cantseguidores;
	}
	public int getChef_cantrecetas() {
		return chef_cantrecetas;
	}
	public void setChef_cantrecetas(int chef_cantrecetas) {
		this.chef_cantrecetas = chef_cantrecetas;
	}
	public int getChef_contrato() {
		return chef_contrato;
	}
	public void setChef_contrato(int chef_contrato) {
		this.chef_contrato = chef_contrato;
	}
	public String getChef_paisid() {
		return chef_paisid;
	}
	public void setChef_paisid(String chef_paisid) {
		this.chef_paisid = chef_paisid;
	}
	public String getChef_descripcion() {
		return chef_descripcion;
	}
	public void setChef_descripcion(String chef_descripcion) {
		this.chef_descripcion = chef_descripcion;
	}
	public int getChef_membresia() {
		return chef_membresia;
	}
	public void setChef_membresia(int chef_membresia) {
		this.chef_membresia = chef_membresia;
	}
	public int getChef_stado() {
		return chef_stado;
	}
	public void setChef_stado(int chef_stado) {
		this.chef_stado = chef_stado;
	}
	public Chef(int chef_id, String chef_nombre, String chef_apellido, String chef_correo, String chef_contraseña,
			String chef_foto, int chef_cantseguidores, int chef_cantrecetas, int chef_contrato, String chef_paisid,
			String chef_descripcion, int chef_membresia, int chef_stado) {
		super();
		this.chef_id = chef_id;
		this.chef_nombre = chef_nombre;
		this.chef_apellido = chef_apellido;
		this.chef_correo = chef_correo;
		this.chef_contraseña = chef_contraseña;
		this.chef_foto = chef_foto;
		this.chef_cantseguidores = chef_cantseguidores;
		this.chef_cantrecetas = chef_cantrecetas;
		this.chef_contrato = chef_contrato;
		this.chef_paisid = chef_paisid;
		this.chef_descripcion = chef_descripcion;
		this.chef_membresia = chef_membresia;
		this.chef_stado = chef_stado;
	}
	public Chef() {
	
	}
	
	

}
