package com.vical.minibanco.ui.presenter;

import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Button.ClickListener;
import com.vical.minibanco.domain.Producto;
import com.vical.minibanco.ui.design.ProductoDesign;

public class ProductoPresenter extends ProductoDesign implements ClickListener{
	private static final long serialVersionUID = 2004497977847337759L;

	public ProductoPresenter() {
		btnCrear.addClickListener(this);
	}
	
	@Override
	public void buttonClick(ClickEvent event) {
		if(event.getButton().equals(btnCrear)){
			crearProducto();
		}
	}

	private void crearProducto() {
		Producto producto = new Producto();
		producto.setCodigo("PLD");
		producto.setProducto("Préstamo libre disponibilidad");
	}
}
