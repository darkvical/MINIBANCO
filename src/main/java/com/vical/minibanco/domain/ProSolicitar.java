package com.vical.minibanco.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.vical.minibanco.util.Constantes;


@Entity
@Table(name="tbl_pro_solicitar", schema = Constantes.SCHEMA.MINIBANCO) //  "BDMINIBANCO"
public class ProSolicitar extends Base {
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="ID")
	private Long id;
	@ManyToOne
	@JoinColumn(name="PERSONA")
	private Persona persona;
	@ManyToOne
	@JoinColumn(name="SUBPRODUCTO")
	private SubProducto subproducto;
	private Date vigencia;
	@ManyToOne
	@JoinColumn(name="ESTADO")
	private Valor estado;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Persona getPersona() {
		return persona;
	}
	public void setPersona(Persona persona) {
		this.persona = persona;
	}
	public SubProducto getSubproducto() {
		return subproducto;
	}
	public void setSubproducto(SubProducto subproducto) {
		this.subproducto = subproducto;
	}
	public Date getVigencia() {
		return vigencia;
	}
	public void setVigencia(Date vigencia) {
		this.vigencia = vigencia;
	}
	public Valor getEstado() {
		return estado;
	}
	public void setEstado(Valor estado) {
		this.estado = estado;
	}
}
