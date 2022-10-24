package com.edu.unab.model.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name= "cliente")
public class Cliente {

	@Id
	@Column(name= "idcliente")
	private Integer id_Cliente;
	@Column(name= "nombre")
	private String n_ombre;
	@Column(name= "telefono")
	private String t_elefono;
	@Column(name= "correo")
	private String c_orreo;
	@OneToMany(mappedBy = "cliente")
	List<Vehiculo>vehiculos;
	
	public Cliente() {
	}

	public Cliente(Integer id_Cliente, String n_ombre, String t_elefono, String c_orreo, List<Vehiculo> vehiculos) {
		this.id_Cliente = id_Cliente;
		this.n_ombre = n_ombre;
		this.t_elefono = t_elefono;
		this.c_orreo = c_orreo;
		this.vehiculos = vehiculos;
	}

	public Integer getId_Cliente() {
		return id_Cliente;
	}

	public void setId_Cliente(Integer id_Cliente) {
		this.id_Cliente = id_Cliente;
	}

	public String getN_ombre() {
		return n_ombre;
	}

	public void setN_ombre(String n_ombre) {
		this.n_ombre = n_ombre;
	}

	public String getT_elefono() {
		return t_elefono;
	}

	public void setT_elefono(String t_elefono) {
		this.t_elefono = t_elefono;
	}

	public String getC_orreo() {
		return c_orreo;
	}

	public void setC_orreo(String c_orreo) {
		this.c_orreo = c_orreo;
	}

	public List<Vehiculo> getVehiculos() {
		return vehiculos;
	}

	public void setVehiculos(List<Vehiculo> vehiculos) {
		this.vehiculos = vehiculos;
	}

	@Override
	public String toString() {
		return "Cliente [id_Cliente=" + id_Cliente + ", n_ombre=" + n_ombre + ", t_elefono=" + t_elefono + ", c_orreo="
				+ c_orreo + ", vehiculos=" + vehiculos + "]";
	}
	
}
