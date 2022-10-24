package com.edu.unab.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="insumos")
public class Insumo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="idinsumos")
	private Integer idInsumos;
	@Column(name="nombre")
	private String nombre="";
	@Column(name="cantidad")
	private Integer cantidad=0;
	@Column(name="precio_c")
	private Double precio_c=0.0;
	@Column(name="precio_v")
	private Double precio_v=0.0;
	
	public Insumo() {
	}

	public Insumo(Integer idInsumos, String nombre, Integer cantidad, Double precio_c, Double precio_v) {
		this.idInsumos = idInsumos;
		this.nombre = nombre;
		this.cantidad = cantidad;
		this.precio_c = precio_c;
		this.precio_v = precio_v;
	}

	public Integer getIdInsumos() {
		return idInsumos;
	}

	public void setIdInsumos(Integer idInsumos) {
		this.idInsumos = idInsumos;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getCantidad() {
		return cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}

	public Double getPrecio_c() {
		return precio_c;
	}

	public void setPrecio_c(Double precio_c) {
		this.precio_c = precio_c;
	}

	public Double getPrecio_v() {
		return precio_v;
	}

	public void setPrecio_v(Double precio_v) {
		this.precio_v = precio_v;
	}

	@Override
	public String toString() {
		return "Insumo [idInsumos=" + idInsumos + ", nombre=" + nombre + ", cantidad=" + cantidad + ", precio_c="
				+ precio_c + ", precio_v=" + precio_v + "]";
	}
	
}
