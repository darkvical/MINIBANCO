package com.vical.minibanco.dao;

import java.io.Serializable;

public interface IBaseDAO <Entidad, Id extends Serializable> extends Serializable {
	
	/***
	 * Método que permite el insert de una entidad en la BD
	 * @param entidad
	 * @return entidad
	 */
	Entidad crear(Entidad entidad);

	/***
	 * Método que permite el insert de una entidad en la BD
	 * @param entidad
	 * @return entidad
	 */
	Entidad obtener(Long id);
	
	/***
	 * Método que permite el update de una entidad en la BD
	 * @param entidad
	 * @return
	 */
	Entidad modificar(Entidad entidad);
	
	/***
	 * Método que permite el delete de una entidad en la BD
	 * @param entidad
	 * @return
	 */
	void eliminar(Entidad entidad);
}
