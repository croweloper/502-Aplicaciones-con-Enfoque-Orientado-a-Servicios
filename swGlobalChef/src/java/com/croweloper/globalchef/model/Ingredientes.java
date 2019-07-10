package com.croweloper.globalchef.model;

public class Ingredientes {
	
	private int ing_id;
	private int ing_item;
	private int ing_recetaid;
	private String  ing_descripcion;
	
	public Ingredientes(int ing_id, int ing_item, int ing_recetaid, String ing_descripcion) {
		super();
		this.ing_id = ing_id;
		this.ing_item = ing_item;
		this.ing_recetaid = ing_recetaid;
		this.ing_descripcion = ing_descripcion;
	}
	public int getIng_id() {
		return ing_id;
	}
	public void setIng_id(int ing_id) {
		this.ing_id = ing_id;
	}
	public int getIng_item() {
		return ing_item;
	}
	public void setIng_item(int ing_item) {
		this.ing_item = ing_item;
	}
	public int getIng_recetaid() {
		return ing_recetaid;
	}
	public void setIng_recetaid(int ing_recetaid) {
		this.ing_recetaid = ing_recetaid;
	}
	public String getIng_descripcion() {
		return ing_descripcion;
	}
	public void setIng_descripcion(String ing_descripcion) {
		this.ing_descripcion = ing_descripcion;
	}
	public Ingredientes() {
		super();
	}
	
	
	
	
	
}
