package com.croweloper.globalchef.model;

import java.sql.Date;
import java.util.List;

public class Receta {
	
	private int rec_id;
	private String rec_descripcion;	
	private int rec_platoid;	
	private String rec_tiempoprep;	
	private String rec_paisid;	
	private int rec_chefid;	
	private int rec_votos;	
	private String rec_dificultad;	
	private Date rec_feccreacion;	
	private int rec_cantporcion;	
	private String rec_consejo;	
	private int rec_estado;
	
	private List<Ingredientes> ingredientes;
	private List<Preparacion> preparacion;
	
	
	
	
	public Receta(int rec_id, String rec_descripcion, int rec_platoid, String rec_tiempoprep, String rec_paisid,
			int rec_chefid, int rec_votos, String rec_dificultad, Date rec_feccreacion, int rec_cantporcion,
			String rec_consejo, int rec_estado, List<Ingredientes> ingredientes, List<Preparacion> preparacion) {
		super();
		this.rec_id = rec_id;
		this.rec_descripcion = rec_descripcion;
		this.rec_platoid = rec_platoid;
		this.rec_tiempoprep = rec_tiempoprep;
		this.rec_paisid = rec_paisid;
		this.rec_chefid = rec_chefid;
		this.rec_votos = rec_votos;
		this.rec_dificultad = rec_dificultad;
		this.rec_feccreacion = rec_feccreacion;
		this.rec_cantporcion = rec_cantporcion;
		this.rec_consejo = rec_consejo;
		this.rec_estado = rec_estado;
		this.ingredientes = ingredientes;
		this.preparacion = preparacion;
	}
	public List<Preparacion> getPreparacion() {
		return preparacion;
	}
	public void setPreparacion(List<Preparacion> preparacion) {
		this.preparacion = preparacion;
	}
	public int getRec_id() {
		return rec_id;
	}
	public void setRec_id(int rec_id) {
		this.rec_id = rec_id;
	}
	public String getRec_descripcion() {
		return rec_descripcion;
	}
	public void setRec_descripcion(String rec_descripcion) {
		this.rec_descripcion = rec_descripcion;
	}
	public int getRec_platoid() {
		return rec_platoid;
	}
	public void setRec_platoid(int rec_platoid) {
		this.rec_platoid = rec_platoid;
	}
	public String getRec_tiempoprep() {
		return rec_tiempoprep;
	}
	public void setRec_tiempoprep(String rec_tiempoprep) {
		this.rec_tiempoprep = rec_tiempoprep;
	}
	public String getRec_paisid() {
		return rec_paisid;
	}
	public void setRec_paisid(String rec_paisid) {
		this.rec_paisid = rec_paisid;
	}
	public int getRec_chefid() {
		return rec_chefid;
	}
	public void setRec_chefid(int rec_chefid) {
		this.rec_chefid = rec_chefid;
	}
	public int getRec_votos() {
		return rec_votos;
	}
	public void setRec_votos(int rec_votos) {
		this.rec_votos = rec_votos;
	}
	public String getRec_dificultad() {
		return rec_dificultad;
	}
	public void setRec_dificultad(String rec_dificultad) {
		this.rec_dificultad = rec_dificultad;
	}
	public Date getRec_feccreacion() {
		return rec_feccreacion;
	}
	public void setRec_feccreacion(Date rec_feccreacion) {
		this.rec_feccreacion = rec_feccreacion;
	}
	public int getRec_cantporcion() {
		return rec_cantporcion;
	}
	public void setRec_cantporcion(int rec_cantporcion) {
		this.rec_cantporcion = rec_cantporcion;
	}
	public String getRec_consejo() {
		return rec_consejo;
	}
	public void setRec_consejo(String rec_consejo) {
		this.rec_consejo = rec_consejo;
	}
	public int getRec_estado() {
		return rec_estado;
	}
	public void setRec_estado(int rec_estado) {
		this.rec_estado = rec_estado;
	}
	public Receta(int rec_id, String rec_descripcion, int rec_platoid, String rec_tiempoprep, String rec_paisid,
			int rec_chefid, int rec_votos, String rec_dificultad, Date rec_feccreacion, int rec_cantporcion,
			String rec_consejo, int rec_estado) {
		super();
		this.rec_id = rec_id;
		this.rec_descripcion = rec_descripcion;
		this.rec_platoid = rec_platoid;
		this.rec_tiempoprep = rec_tiempoprep;
		this.rec_paisid = rec_paisid;
		this.rec_chefid = rec_chefid;
		this.rec_votos = rec_votos;
		this.rec_dificultad = rec_dificultad;
		this.rec_feccreacion = rec_feccreacion;
		this.rec_cantporcion = rec_cantporcion;
		this.rec_consejo = rec_consejo;
		this.rec_estado = rec_estado;
	}
	public Receta() {
		super();
		// TODO Auto-generated constructor stub
	}
	public List<Ingredientes> getIngredientes() {
		return ingredientes;
	}
	public void setIngredientes(List<Ingredientes> ingredientes) {
		this.ingredientes = ingredientes;
	}
	public Receta(int rec_id, String rec_descripcion, int rec_platoid, String rec_tiempoprep, String rec_paisid,
			int rec_chefid, int rec_votos, String rec_dificultad, Date rec_feccreacion, int rec_cantporcion,
			String rec_consejo, int rec_estado, List<Ingredientes> ingredientes) {
		super();
		this.rec_id = rec_id;
		this.rec_descripcion = rec_descripcion;
		this.rec_platoid = rec_platoid;
		this.rec_tiempoprep = rec_tiempoprep;
		this.rec_paisid = rec_paisid;
		this.rec_chefid = rec_chefid;
		this.rec_votos = rec_votos;
		this.rec_dificultad = rec_dificultad;
		this.rec_feccreacion = rec_feccreacion;
		this.rec_cantporcion = rec_cantporcion;
		this.rec_consejo = rec_consejo;
		this.rec_estado = rec_estado;
		this.ingredientes = ingredientes;
	}
	
	
	
	

}
