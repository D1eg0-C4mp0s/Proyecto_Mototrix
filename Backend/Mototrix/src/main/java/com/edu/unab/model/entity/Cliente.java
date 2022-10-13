package com.edu.unab.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
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
	
	public Cliente() {
		super();
	}

	public Cliente(Integer idCliente, String nombre, String telefono, String correo) {
		super();
		this.id_Cliente = idCliente;
		this.n_ombre = nombre;
		this.t_elefono = telefono;
		this.c_orreo = correo;
	}

	public Integer getIdCliente() {
		return id_Cliente;
	}

	public void setIdCliente(Integer idCliente) {
		this.id_Cliente = idCliente;
	}

	public String getNombre() {
		return n_ombre;
	}

	public void setNombre(String nombre) {
		this.n_ombre = nombre;
	}

	public String getTelefono() {
		return t_elefono;
	}

	public void setTelefono(String telefono) {
		this.t_elefono = telefono;
	}

	public String getCorreo() {
		return c_orreo;
	}

	public void setCorreo(String correo) {
		this.c_orreo = correo;
	}

	@Override
	public String toString() {
		return "Cliente [idCliente=" + id_Cliente + ", nombre=" + n_ombre + ", telefono=" + t_elefono + ", correo="
				+ c_orreo + "]";
	}
	
}
