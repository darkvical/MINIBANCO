package com.vical.minibanco.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class Base implements Serializable {	
	private static final long serialVersionUID = 1802953022074950197L;
	private Long creador;//	CREADOR
	private Date creacion;//	CREACION
	private Long editor;//	EDITOR
	private Date edicion;//	EDICION
	
	public Long getCreador() {
		return creador;
	}
	public void setCreador(Long creador) {
		this.creador = creador;
	}
	public Date getCreacion() {
		return creacion;
	}
	public void setCreacion(Date creacion) {
		this.creacion = creacion;
	}
	public Long getEditor() {
		return editor;
	}
	public void setEditor(Long editor) {
		this.editor = editor;
	}
	public Date getEdicion() {
		return edicion;
	}
	public void setEdicion(Date edicion) {
		this.edicion = edicion;
	}	
}