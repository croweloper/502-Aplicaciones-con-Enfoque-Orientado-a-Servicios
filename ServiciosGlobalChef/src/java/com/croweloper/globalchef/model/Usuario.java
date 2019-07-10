package com.croweloper.globalchef.model;


public class Usuario {
	
	int usu_id;
	String usu_nombre;
	String usu_apellido;
	String usu_correo;
	String usu_pass;
	String usu_foto;
	String usu_telefono;
	String usu_paisid;
	String usu_documento;
	int usu_estado;
	
	public Usuario() {
	
	}
	public Usuario(int usu_id, String usu_nombre, String usu_apellido, String usu_correo, String usu_pass,
			String usu_foto, String usu_telefono, String usu_paisid, String usu_documento, int usu_estado) {
		super();
		this.usu_id = usu_id;
		this.usu_nombre = usu_nombre;
		this.usu_apellido = usu_apellido;
		this.usu_correo = usu_correo;
		this.usu_pass = usu_pass;
		this.usu_foto = usu_foto;
		this.usu_telefono = usu_telefono;
		this.usu_paisid = usu_paisid;
		this.usu_documento = usu_documento;
		this.usu_estado = usu_estado;
	}
	public int getUsu_id() {
		return usu_id;
	}
	public void setUsu_id(int usu_id) {
		this.usu_id = usu_id;
	}
	public String getUsu_nombre() {
		return usu_nombre;
	}
	public void setUsu_nombre(String usu_nombre) {
		this.usu_nombre = usu_nombre;
	}
	public String getUsu_apellido() {
		return usu_apellido;
	}
	public void setUsu_apellido(String usu_apellido) {
		this.usu_apellido = usu_apellido;
	}
	public String getUsu_correo() {
		return usu_correo;
	}
	public void setUsu_correo(String usu_correo) {
		this.usu_correo = usu_correo;
	}
	public String getUsu_pass() {
		return usu_pass;
	}
	public void setUsu_pass(String usu_pass) {
		this.usu_pass = usu_pass;
	}
	public String getUsu_foto() {
		return usu_foto;
	}
	public void setUsu_foto(String usu_foto) {
		this.usu_foto = usu_foto;
	}
	public String getUsu_telefono() {
		return usu_telefono;
	}
	public void setUsu_telefono(String usu_telefono) {
		this.usu_telefono = usu_telefono;
	}
	public String getUsu_paisid() {
		return usu_paisid;
	}
	public void setUsu_paisid(String usu_paisid) {
		this.usu_paisid = usu_paisid;
	}
	public String getUsu_documento() {
		return usu_documento;
	}
	public void setUsu_documento(String usu_documento) {
		this.usu_documento = usu_documento;
	}
	public int getUsu_estado() {
		return usu_estado;
	}
	public void setUsu_estado(int usu_estado) {
		this.usu_estado = usu_estado;
	}

}

