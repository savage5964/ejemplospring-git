package com.seralan.ejemplospring.entidades.impl;

import com.seralan.ejemplospring.entidades.Herramienta;

public class Jeringa implements Herramienta {

	@Override
	public String getDescripcion() {
		// TODO Auto-generated method stub
		return "Soy una jeringa";
	}
	@Override
	public String toString() {
		return getDescripcion();
	}
	@Override
	public int getContador() {
		// TODO Auto-generated method stub
		return 0;
	}

}
