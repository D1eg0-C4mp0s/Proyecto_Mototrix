package com.edu.unab.model.entity;

//import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
//import javax.persistence.JoinColumn;
//import javax.persistence.JoinTable;
//import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="refacciones")
public class Refaccion {

	@Id
	@Column(name="idrefacciones")
	private Integer idRefacciones;
	@Column(name="nombre")
	private String nombre;
	@Column(name="cantidad")
	private Integer cantidad;
	@Column(name="precio_c")
	private Double precio_c;
	@Column(name="precio_v")
	private Double precio_v;
	@ManyToOne
	@JoinColumn(name="idproveedor")
	private Proveedor proveedor;
	
	/*@JoinTable(
			name="Compra",
			joinColumns = @JoinColumn(name="idRefacciones", nullable = false),
			inverseJoinColumns = @JoinColumn(name="idProveedor", nullable = false))
	
	@ManyToMany
	private List<Proveedor> proveedores;*/
	
	public Refaccion() {
	}

	public Refaccion(Integer idRefacciones, String nombre, Integer cantidad, Double precio_c, Double precio_v) {
		this.idRefacciones = idRefacciones;
		this.nombre = nombre;
		this.cantidad = cantidad;
		this.precio_c = precio_c;
		this.precio_v = precio_v;
	}

	public Integer getIdRefacciones() {
		return idRefacciones;
	}

	public void setIdRefacciones(Integer idRefacciones) {
		this.idRefacciones = idRefacciones;
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
		return "Refaccion [idRefacciones=" + idRefacciones + ", nombre=" + nombre + ", cantidad=" + cantidad
				+ ", precio_c=" + precio_c + ", precio_v=" + precio_v + "]";
	}
	
}
