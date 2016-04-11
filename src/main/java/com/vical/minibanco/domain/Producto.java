package com.vical.minibanco.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.vical.minibanco.util.Constantes;


@Entity
@Table(name="tbl_producto", schema = Constantes.SCHEMA.MINIBANCO) //  "BDMINIBANCO"
public class Producto extends Base {
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="ID")
	private Long id;
	private String codigo;
	private String producto;
	
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
	public String getProducto() {
		return producto;
	}
	public void setProducto(String producto) {
		this.producto = producto;
	}

}
