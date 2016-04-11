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
	private Long persona;
	private Long subproducto;
	private Date vigencia;
	private Long estado;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getPersona() {
		return persona;
	}
	public void setPersona(Long persona) {
		this.persona = persona;
	}
	public Long getSubproducto() {
		return subproducto;
	}
	public void setSubproducto(Long subproducto) {
		this.subproducto = subproducto;
	}
	public Date getVigencia() {
		return vigencia;
	}
	public void setVigencia(Date vigencia) {
		this.vigencia = vigencia;
	}
	public Long getEstado() {
		return estado;
	}
	public void setEstado(Long estado) {
		this.estado = estado;
	}
	
}
