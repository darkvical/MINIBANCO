package com.vical.minibanco;

import com.vaadin.server.VaadinRequest;
import com.vaadin.ui.UI;

/**
 * The Application's "main" class
 */
@SuppressWarnings("serial")
public class MiniBancoUI extends UI {

    @Override
    protected void init(VaadinRequest request) {
    System.out.println("Hi Local Minibanco!");
    }
}