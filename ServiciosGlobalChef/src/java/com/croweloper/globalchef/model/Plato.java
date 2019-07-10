package com.croweloper.globalchef.model;

import java.util.List;

public class Plato {
	
	private int pla_id;	
	private String pla_titulo;	
	private int pla_categoria;	
	private String pla_paisid;	
	private int pla_cantrecetas;	
	private int pla_estado;
	
	private List<Receta> listarecetas;
	
	public int getPla_id() {
		return pla_id;
	}
	public void setPla_id(int pla_id) {
		this.pla_id = pla_id;
	}
	public String getPla_titulo() {
		return pla_titulo;
	}
	public void setPla_titulo(String pla_titulo) {
		this.pla_titulo = pla_titulo;
	}
	public int getPla_categoria() {
		return pla_categoria;
	}
	public void setPla_categoria(int pla_categoria) {
		this.pla_categoria = pla_categoria;
	}
	public String getPla_paisid() {
		return pla_paisid;
	}
	public void setPla_paisid(String pla_paisid) {
		this.pla_paisid = pla_paisid;
	}
	public int getPla_cantrecetas() {
		return pla_cantrecetas;
	}
	public void setPla_cantrecetas(int pla_cantrecetas) {
		this.pla_cantrecetas = pla_cantrecetas;
	}
	public int getPla_estado() {
		return pla_estado;
	}
	public void setPla_estado(int pla_estado) {
		this.pla_estado = pla_estado;
	}
	public List<Receta> getListarecetas() {
		return listarecetas;
	}
	public void setListarecetas(List<Receta> listarecetas) {
		this.listarecetas = listarecetas;
	}
	public Plato(int pla_id, String pla_titulo, int pla_categoria, String pla_paisid, int pla_cantrecetas,
			int pla_estado, List<Receta> listarecetas) {
		super();
		this.pla_id = pla_id;
		this.pla_titulo = pla_titulo;
		this.pla_categoria = pla_categoria;
		this.pla_paisid = pla_paisid;
		this.pla_cantrecetas = pla_cantrecetas;
		this.pla_estado = pla_estado;
		this.listarecetas = listarecetas;
	}
	public Plato(int pla_id, String pla_titulo, int pla_categoria, String pla_paisid, int pla_cantrecetas,
			int pla_estado) {
		super();
		this.pla_id = pla_id;
		this.pla_titulo = pla_titulo;
		this.pla_categoria = pla_categoria;
		this.pla_paisid = pla_paisid;
		this.pla_cantrecetas = pla_cantrecetas;
		this.pla_estado = pla_estado;
	}
	public Plato() {

	}
	
	
	
	


}
