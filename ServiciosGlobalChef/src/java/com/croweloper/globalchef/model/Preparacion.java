package com.croweloper.globalchef.model;

public class Preparacion {
	
	private int prec_id;
	private int prec_nropaso;
	private int prec_recetaid;
	private String prec_paso;
	
	public int getPrec_id() {
		return prec_id;
	}
	public void setPrec_id(int prec_id) {
		this.prec_id = prec_id;
	}
	public int getPrec_nropaso() {
		return prec_nropaso;
	}
	public void setPrec_nropaso(int prec_nropaso) {
		this.prec_nropaso = prec_nropaso;
	}
	public int getPrec_recetaid() {
		return prec_recetaid;
	}
	public void setPrec_recetaid(int prec_recetaid) {
		this.prec_recetaid = prec_recetaid;
	}
	public String getPrec_paso() {
		return prec_paso;
	}
	public void setPrec_paso(String prec_paso) {
		this.prec_paso = prec_paso;
	}
	public Preparacion(int prec_id, int prec_nropaso, int prec_recetaid, String prec_paso) {
		super();
		this.prec_id = prec_id;
		this.prec_nropaso = prec_nropaso;
		this.prec_recetaid = prec_recetaid;
		this.prec_paso = prec_paso;
	}
	public Preparacion() {
		super();
	}
	
	
	
	
	

}
