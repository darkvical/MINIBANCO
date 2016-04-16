package com.vical.minibanco.dao.impl;

import org.springframework.stereotype.Repository;

import com.vical.minibanco.dao.IProductoDAO;
import com.vical.minibanco.domain.Producto;

@Repository
public class ProductoDAOImpl extends BaseDAOImpl<Producto, Long> implements IProductoDAO {
	private static final long serialVersionUID = -4979227957366338254L;

	@Override
	protected Class<Producto> getClase() { return Producto.class; }

}