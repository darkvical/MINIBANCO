package com.vical.minibanco.domain;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.vical.minibanco.util.Constantes;

@Entity
@Table(name="tbl_producto", schema = Constantes.SCHEMA.MINIBANCO) //  "BDMINIBANCO"
public class SubProducto extends Base {
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name="ID")
	private Long id;
	private String codigo;
	private String subproducto;
	private BigDecimal monto;
	private Integer plazo;
	private Long producto;
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
	public String getSubproducto() {
		return subproducto;
	}
	public void setSubproducto(String subproducto) {
		this.subproducto = subproducto;
	}
	public BigDecimal getMonto() {
		return monto;
	}
	public void setMonto(BigDecimal monto) {
		this.monto = monto;
	}
	public Integer getPlazo() {
		return plazo;
	}
	public void setPlazo(Integer plazo) {
		this.plazo = plazo;
	}
	public Long getProducto() {
		return producto;
	}
	public void setProducto(Long producto) {
		this.producto = producto;
	} 
	
	
}
