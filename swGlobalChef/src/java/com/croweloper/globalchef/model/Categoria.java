package com.croweloper.globalchef.model;

import java.util.List;

public class Categoria {

    private int cat_id;	
    private String cat_descripcion;
    private String cat_urlimg;
    private int cat_gcatid;
    private int cat_estado;
    
    private List<Plato> listaplatos;
    
	public int getCat_id() {
		return cat_id;
	}
	public void setCat_id(int cat_id) {
		this.cat_id = cat_id;
	}
	public String getCat_descripcion() {
		return cat_descripcion;
	}
	public void setCat_descripcion(String cat_descripcion) {
		this.cat_descripcion = cat_descripcion;
	}
	public String getCat_urlimg() {
		return cat_urlimg;
	}
	public void setCat_urlimg(String cat_urlimg) {
		this.cat_urlimg = cat_urlimg;
	}
	public int getCat_gcatid() {
		return cat_gcatid;
	}
	public void setCat_gcatid(int cat_gcatid) {
		this.cat_gcatid = cat_gcatid;
	}
	public int getCat_estado() {
		return cat_estado;
	}
	public void setCat_estado(int cat_estado) {
		this.cat_estado = cat_estado;
	}
	
	public Categoria(int cat_id, String cat_descripcion, String cat_urlimg, int cat_gcatid, int cat_estado) {
		super();
		this.cat_id = cat_id;
		this.cat_descripcion = cat_descripcion;
		this.cat_urlimg = cat_urlimg;
		this.cat_gcatid = cat_gcatid;
		this.cat_estado = cat_estado;
	}
	public Categoria() {
		
	}
	
	//Lista
	
	public List<Plato> getListaplatos() {
		return listaplatos;
	}
	public void setListaplatos(List<Plato> listaplatos) {
		this.listaplatos = listaplatos;
	}
	
	public Categoria(int cat_id, String cat_descripcion, String cat_urlimg, int cat_gcatid, int cat_estado,
			List<Plato> listaplatos) {
		super();
		this.cat_id = cat_id;
		this.cat_descripcion = cat_descripcion;
		this.cat_urlimg = cat_urlimg;
		this.cat_gcatid = cat_gcatid;
		this.cat_estado = cat_estado;
		this.listaplatos = listaplatos;
	}
	
	
}
