package com.vical.minibanco.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.vical.minibanco.util.Constantes;

@Entity
@Table(name="TBL_PERSONA", schema = Constantes.SCHEMA.MINIBANCO)
public class Persona extends Base {
	private static final long serialVersionUID = -4403521659717472872L;

	@Id
	@Column(name="ID")
	private Long id;	
	private String nombres;
	private String paterno;
	private String materno;
	private String correo;
	private String telefono;
	@ManyToOne
	@JoinColumn(name="TIPO_DOI")
	private Valor tipoDoi;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNombres() {
		return nombres;
	}
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	public String getPaterno() {
		return paterno;
	}
	public void setPaterno(String paterno) {
		this.paterno = paterno;
	}
	public String getMaterno() {
		return materno;
	}
	public void setMaterno(String materno) {
		this.materno = materno;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public Valor getTipoDoi() {
		return tipoDoi;
	}
	public void setTipoDoi(Valor tipoDoi) {
		this.tipoDoi = tipoDoi;
	}	
}