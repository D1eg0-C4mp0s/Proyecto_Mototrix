package com.edu.unab.model.entity;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="ficha_de_servicio")
public class FichaServicio {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idficha_servicios")
	private Integer idFicha;
	@ManyToOne
	@JoinColumn(name = "idcliente")
	private Cliente cliente;
	@ManyToOne
	@JoinColumn(name = "idempleado")
	private Empleado empleado;
	@ManyToOne
	@JoinColumn(name = "idvehiculo")
	private Vehiculo vehiculo;
	@SuppressWarnings("deprecation")
	@Column(name = "fecha_servicio")
	private Date fechaServicio = new Date(2000, 1, 1);
	@Column(name = "estado")
	private String estado = "Ingresado";
	@Column(name = "costo")
	private Double costo = 0.0;
	
	@JoinTable(
			name="vinculo_servicio",
			joinColumns = @JoinColumn(name="idficha_servicios", nullable = false),
			inverseJoinColumns = @JoinColumn(name="idservicios", nullable = false))
	@ManyToMany
	private List<Servicio>servicios;
	
	public void addServicio(Servicio servicio) {
		if (this.servicios==null) {
			this.servicios=new ArrayList<>();
		}
		this.servicios.add(servicio);
	}
	
	public FichaServicio() {
	}

	public FichaServicio(Integer idFicha, Cliente cliente, Empleado empleado, Vehiculo vehiculo, Date fechaServicio,
			String estado, Double costo, List<Servicio> servicios) {
		this.idFicha = idFicha;
		this.cliente = cliente;
		this.empleado = empleado;
		this.vehiculo = vehiculo;
		this.fechaServicio = fechaServicio;
		this.estado = estado;
		this.costo = costo;
		this.servicios = servicios;
	}

	public Integer getIdFicha() {
		return idFicha;
	}

	public void setIdFicha(Integer idFicha) {
		this.idFicha = idFicha;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Empleado getEmpleado() {
		return empleado;
	}

	public void setEmpleado(Empleado empleado) {
		this.empleado = empleado;
	}

	public Vehiculo getVehiculo() {
		return vehiculo;
	}

	public void setVehiculo(Vehiculo vehiculo) {
		this.vehiculo = vehiculo;
	}

	public Date getFechaServicio() {
		return fechaServicio;
	}

	public void setFechaServicio(Date fechaServicio) {
		this.fechaServicio = fechaServicio;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Double getCosto() {
		return costo;
	}

	public void setCosto(Double costo) {
		this.costo = costo;
	}

	public List<Servicio> getServicios() {
		return servicios;
	}

	public void setServicios(List<Servicio> servicios) {
		this.servicios = servicios;
	}

	@Override
	public String toString() {
		return "FichaServicio [idFicha=" + idFicha + ", cliente=" + cliente + ", empleado=" + empleado + ", vehiculo="
				+ vehiculo + ", fechaServicio=" + fechaServicio + ", estado=" + estado + ", costo=" + costo
				+ ", servicios=" + servicios + "]";
	}	
}
