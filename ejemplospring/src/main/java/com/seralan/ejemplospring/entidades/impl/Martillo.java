package com.seralan.ejemplospring.entidades.impl;

import com.seralan.ejemplospring.entidades.Herramienta;

public class Martillo implements Herramienta {

	public Martillo(){
		System.out.println("Creando martillo");
	}
	
	private int c = 0;
	
	@Override
	public String getDescripcion() {
		// TODO Auto-generated method stub
		return "Soy un Martillo";
	}
	
	@Override
	public String toString() {
		return getDescripcion();
	}

	@Override
	public int getContador() {
		c++;
		return c;
	}

}
