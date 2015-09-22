package com.seralan.ejemplospring.entidades.impl;

import com.seralan.ejemplospring.entidades.Herramienta;

public class Martillo implements Herramienta {

	@Override
	public String getDescripcion() {
		// TODO Auto-generated method stub
		return "Soy un Martillo";
	}
	
	@Override
	public String toString() {
		return getDescripcion();
	}

}
