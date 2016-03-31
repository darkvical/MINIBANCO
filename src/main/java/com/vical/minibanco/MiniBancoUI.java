package com.vical.minibanco;

import com.vaadin.server.VaadinRequest;
import com.vaadin.ui.CssLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.UI;

/**
 * The Application's "main" class
 */
@SuppressWarnings("serial")
public class MiniBancoUI extends UI {

    @Override
    protected void init(VaadinRequest request) {
    	
    	CssLayout layout = new CssLayout();
    	setContent(layout);
    	Label label = new Label("Hi Local Minibanco!");
    	layout.addComponent(label);    	
    }
}