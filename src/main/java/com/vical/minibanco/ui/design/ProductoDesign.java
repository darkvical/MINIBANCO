package com.vical.minibanco.ui.design;

import com.vaadin.annotations.DesignRoot;
import com.vaadin.ui.Button;
import com.vaadin.ui.CssLayout;
import com.vaadin.ui.declarative.Design;

@DesignRoot
public class ProductoDesign extends CssLayout {
	private static final long serialVersionUID = 5605774389353283346L;

	protected Button btnCrear;
	
	public ProductoDesign() {
		Design.read(this);
	}
}
