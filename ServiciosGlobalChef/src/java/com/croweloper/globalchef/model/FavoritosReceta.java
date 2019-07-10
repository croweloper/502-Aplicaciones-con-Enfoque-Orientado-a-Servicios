package com.croweloper.globalchef.model;

public class FavoritosReceta {
	
	private int favr_id;
	private int favr_item;
	private int favr_usuarioid;
	private int favr_recetaid;
	
	private Receta receta;

	public int getFavr_id() {
		return favr_id;
	}

	public void setFavr_id(int favr_id) {
		this.favr_id = favr_id;
	}

	public int getFavr_item() {
		return favr_item;
	}

	public void setFavr_item(int favr_item) {
		this.favr_item = favr_item;
	}

	public int getFavr_usuarioid() {
		return favr_usuarioid;
	}

	public void setFavr_usuarioid(int favr_usuarioid) {
		this.favr_usuarioid = favr_usuarioid;
	}

	public int getFavr_recetaid() {
		return favr_recetaid;
	}

	public void setFavr_recetaid(int favr_recetaid) {
		this.favr_recetaid = favr_recetaid;
	}

	public Receta getReceta() {
		return receta;
	}

	public void setReceta(Receta receta) {
		this.receta = receta;
	}

	public FavoritosReceta(int favr_id, int favr_item, int favr_usuarioid, int favr_recetaid, Receta receta) {
		super();
		this.favr_id = favr_id;
		this.favr_item = favr_item;
		this.favr_usuarioid = favr_usuarioid;
		this.favr_recetaid = favr_recetaid;
		this.receta = receta;
	}

	public FavoritosReceta(int favr_id, int favr_item, int favr_usuarioid, int favr_recetaid) {
		super();
		this.favr_id = favr_id;
		this.favr_item = favr_item;
		this.favr_usuarioid = favr_usuarioid;
		this.favr_recetaid = favr_recetaid;
	}

	public FavoritosReceta() {
		
	}
	
	
	
	

}
