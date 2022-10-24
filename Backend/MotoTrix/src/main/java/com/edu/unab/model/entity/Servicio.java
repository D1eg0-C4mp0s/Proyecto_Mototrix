package com.edu.unab.model.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="servicios")
public class Servicio {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="idservicios")
	private Integer idServicios;
	@Column(name="nombre_serv")
	private String nombre_serv="";
	@Column(name="precio")
	private Double precio=0.0;
	@Column(name="tiene_insumos")
	private Boolean tiene_insumos = false;
	@Column(name="tiene_refacciones")
	private Boolean tiene_refacciones = false;
	@ManyToOne
	@JoinColumn(name="idrefacciones")
	private Refaccion refaccion;
	@ManyToOne
	@JoinColumn(name="idinsumos")
	private Insumo insumo;
	
	@ManyToMany(mappedBy = "servicios")
	private List<FichaServicio>fichas;
	
	public Servicio() {
	}

	public Servicio(Integer idServicios, String nombre_serv, Double precio, Boolean tiene_insumos,
			Boolean tiene_refacciones, Refaccion refaccion, Insumo insumo, List<FichaServicio> fichas) {
		this.idServicios = idServicios;
		this.nombre_serv = nombre_serv;
		this.precio = precio;
		this.tiene_insumos = tiene_insumos;
		this.tiene_refacciones = tiene_refacciones;
		this.refaccion = refaccion;
		this.insumo = insumo;
		this.fichas = fichas;
	}

	public Integer getIdServicios() {
		return idServicios;
	}

	public void setIdServicios(Integer idServicios) {
		this.idServicios = idServicios;
	}

	public String getNombre_serv() {
		return nombre_serv;
	}

	public void setNombre_serv(String nombre_serv) {
		this.nombre_serv = nombre_serv;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	public Boolean getTiene_insumos() {
		return tiene_insumos;
	}

	public void setTiene_insumos(Boolean tiene_insumos) {
		this.tiene_insumos = tiene_insumos;
	}

	public Boolean getTiene_refacciones() {
		return tiene_refacciones;
	}

	public void setTiene_refacciones(Boolean tiene_refacciones) {
		this.tiene_refacciones = tiene_refacciones;
	}

	public Refaccion getRefaccion() {
		return refaccion;
	}

	public void setRefaccion(Refaccion refaccion) {
		this.refaccion = refaccion;
	}

	public Insumo getInsumo() {
		return insumo;
	}

	public void setInsumo(Insumo insumo) {
		this.insumo = insumo;
	}

	/*public List<FichaServicio> getFichas() {
		return fichas;
	}*/

	public void setFichas(List<FichaServicio> fichas) {
		this.fichas = fichas;
	}

	@Override
	public String toString() {
		return "Servicio [idServicios=" + idServicios + ", nombre_serv=" + nombre_serv + ", precio=" + precio
				+ ", tiene_insumos=" + tiene_insumos + ", tiene_refacciones=" + tiene_refacciones + ", refaccion="
				+ refaccion + ", insumo=" + insumo + ", fichas=" + fichas + "]";
	}
}
