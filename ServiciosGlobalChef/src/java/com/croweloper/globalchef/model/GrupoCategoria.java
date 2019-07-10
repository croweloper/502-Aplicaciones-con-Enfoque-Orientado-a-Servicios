package com.croweloper.globalchef.model;


import java.util.List;

public class GrupoCategoria {
	
	private int gcat_id;	
	private String gcat_descripcion;	
	private String gcat_img;	
	private int gcat_estado;
	
	private List<Categoria> listacategoria;
	
	public int getGcat_id() {
		return gcat_id;
	}
	public void setGcat_id(int gcat_id) {
		this.gcat_id = gcat_id;
	}
	public String getGcat_descripcion() {
		return gcat_descripcion;
	}
	public void setGcat_descripcion(String gcat_descripcion) {
		this.gcat_descripcion = gcat_descripcion;
	}
	public String getGcat_img() {
		return gcat_img;
	}
	public void setGcat_img(String gcat_img) {
		this.gcat_img = gcat_img;
	}
	public int getGcat_estado() {
		return gcat_estado;
	}
	public void setGcat_estado(int gcat_estado) {
		this.gcat_estado = gcat_estado;
	}
	public List<Categoria> getListacategoria() {
		return listacategoria;
	}
	public void setListacategoria(List<Categoria> listacategoria) {
		this.listacategoria = listacategoria;
	}
	
	public GrupoCategoria(int gcat_id, String gcat_descripcion, String gcat_img, int gcat_estado) {
		super();
		this.gcat_id = gcat_id;
		this.gcat_descripcion = gcat_descripcion;
		this.gcat_img = gcat_img;
		this.gcat_estado = gcat_estado;
	}
	public GrupoCategoria(int gcat_id, String gcat_descripcion, String gcat_img, int gcat_estado,
			List<Categoria> listacategoria) {
		super();
		this.gcat_id = gcat_id;
		this.gcat_descripcion = gcat_descripcion;
		this.gcat_img = gcat_img;
		this.gcat_estado = gcat_estado;
		this.listacategoria = listacategoria;
	}
	public GrupoCategoria() {
		
	}
	
	
	
	
	
	


}
