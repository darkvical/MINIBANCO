package com.vical.minibanco.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.vical.minibanco.util.Constantes;

@Entity
@Table(name="TBL_LISTA", schema = Constantes.SCHEMA.MINIBANCO)
public class Lista extends Base {
	private static final long serialVersionUID = -4794812995302540400L;
	
	@Id
	@Column(name="ID")
	private Long id;
	private String codigo;
	private String nombre;
	private String estado;
	private String descripcion;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
}
