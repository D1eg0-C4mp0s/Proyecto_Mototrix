package com.edu.unab.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="vehiculos")
public class Vehiculo {

	@Id
	@Column(name="idvehiculos")
	private Integer idVehiculos;
	@Column(name="placa")
	private String placa;
	@Column(name="marca")
	private String marca;
	@Column(name="referencia")
	private String referencia;
	@Column(name="modelo")
	private Integer modelo;
	@Column(name="estado")
	private String estado;
	@Column(name="kilometros_rec")
	private Integer kilometros_rec;
	@ManyToOne
	@JoinColumn(name="idcliente")
	private Cliente cliente;
	
	public Vehiculo() {
	}

	public Vehiculo(Integer idVehiculos, String placa, String marca, String referencia, Integer modelo, String estado,
			Integer kilometros_rec, Cliente cliente) {
		this.idVehiculos = idVehiculos;
		this.placa = placa;
		this.marca = marca;
		this.referencia = referencia;
		this.modelo = modelo;
		this.estado = estado;
		this.kilometros_rec = kilometros_rec;
		this.cliente = cliente;
	}

	public Integer getIdVehiculos() {
		return idVehiculos;
	}

	public void setIdVehiculos(Integer idVehiculos) {
		this.idVehiculos = idVehiculos;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getReferencia() {
		return referencia;
	}

	public void setReferencia(String referencia) {
		this.referencia = referencia;
	}

	public Integer getModelo() {
		return modelo;
	}

	public void setModelo(Integer modelo) {
		this.modelo = modelo;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Integer getKilometros_rec() {
		return kilometros_rec;
	}

	public void setKilometros_rec(Integer kilometros_rec) {
		this.kilometros_rec = kilometros_rec;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	@Override
	public String toString() {
		return "Vehiculo [idVehiculos=" + idVehiculos + ", placa=" + placa + ", marca=" + marca + ", referencia="
				+ referencia + ", modelo=" + modelo + ", estado=" + estado + ", kilometros_rec=" + kilometros_rec
				+ ", cliente=" + cliente + "]";
	}

}
