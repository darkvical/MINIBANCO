package com.vical.minibanco.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.vical.minibanco.util.Constantes;

@Entity
@Table(name="TBL_VALOR", schema = Constantes.SCHEMA.MINIBANCO)
public class Valor extends Base {
	
	private static final long serialVersionUID = -6974523760052679165L;
	
	@Id
	@Column(name="ID")
	private Long id;
	@ManyToOne
	@JoinColumn(name="LISTA")
	private Lista lista;
	private String codigo;
	private String nombre;
	private String descripcion;
	private String valor;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Lista getLista() {
		return lista;
	}
	public void setLista(Lista lista) {
		this.lista = lista;
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
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getValor() {
		return valor;
	}
	public void setValor(String valor) {
		this.valor = valor;
	}
}
