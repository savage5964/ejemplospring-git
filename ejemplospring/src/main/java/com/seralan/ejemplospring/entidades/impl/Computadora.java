package com.seralan.ejemplospring.entidades.impl;

import com.seralan.ejemplospring.entidades.Herramienta;

public class Computadora implements Herramienta{

	@Override
	public String getDescripcion() {
		// TODO Auto-generated method stub
		return "Soy una computadora";
	}
	
	@Override
	public String toString() {
		return getDescripcion();
	}

}
