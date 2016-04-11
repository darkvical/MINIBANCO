package com.vical.minibanco.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.vical.minibanco.util.Constantes;

@Entity
@Table(name="TBL_USUARIO", schema = Constantes.SCHEMA.MINIBANCO) //  "BDMINIBANCO"
public class Usuario extends Base {	
	private static final long serialVersionUID = 1188300254105871798L;
	
	@Id
	@Column(name="ID")
	private Long id;//	ID
	private String codigo;//	CODIGO
	private String nombres;//	NOMBRES
	private String paterno;//	PATERNO
	private String materno;	//	MATERNO
	@Column(name="PASSWORD")//	PASSWORD
	private String contrasenia;

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

	public String getContrasenia() {
		return contrasenia;
	}

	public void setContrasenia(String contrasenia) {
		this.contrasenia = contrasenia;
	}
}
