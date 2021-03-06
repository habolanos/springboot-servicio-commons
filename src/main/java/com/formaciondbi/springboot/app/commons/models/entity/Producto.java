package com.formaciondbi.springboot.app.commons.models.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

@Entity
@Table(name = "PRODUCTOS")
public class Producto implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID", length = 5)
	private Long id;
	@Column(name = "NOMBRE", length = 30)
	private String nombre;
	@Column(name = "PRECIO", precision = 15, scale = 2)
	private Double precio;
	@Column(name = "FECHA_CREADO")
	@Temporal(TemporalType.DATE)
	private Date creado;
	
	@Transient
	private Integer puerto;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Double getPrecio() {
		return precio;
	}
	public void setPrecio(Double precio) {
		this.precio = precio;
	}
	public Date getCreado() {
		return creado;
	}
	public void setCreado(Date creado) {
		this.creado = creado;
	}
	public Integer getPuerto() {
		return puerto;
	}
	public void setPuerto(Integer puerto) {
		this.puerto = puerto;
	}

}
