package com.edu.unab.model.entity;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="proveedor")
public class Proveedor {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="idproveedor")
	private Integer idProveedor;
	@Column(name="nombre")
	private String nombre="";
	@Column(name="correo")
	private String correo="";
	@Column(name="telefono")
	private String telefono="";
	@OneToMany(mappedBy = "proveedor")
	List<Refaccion>refacciones;
	
	public Proveedor() {
	}

	public Proveedor(Integer idProveedor, String nombre, String correo, String telefono, List<Refaccion> refacciones) {
		this.idProveedor = idProveedor;
		this.nombre = nombre;
		this.correo = correo;
		this.telefono = telefono;
		this.refacciones = refacciones;
	}

	public Integer getIdProveedor() {
		return idProveedor;
	}

	public void setIdProveedor(Integer idProveedor) {
		this.idProveedor = idProveedor;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public List<Refaccion> getRefacciones() {
		return refacciones;
	}

	public void setRefacciones(List<Refaccion> refacciones) {
		this.refacciones = refacciones;
	}

	@Override
	public String toString() {
		return "Proveedor [idProveedor=" + idProveedor + ", nombre=" + nombre + ", correo=" + correo + ", telefono="
				+ telefono + ", refacciones=" + refacciones + "]";
	}
}
