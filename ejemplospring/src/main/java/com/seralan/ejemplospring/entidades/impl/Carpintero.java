package com.seralan.ejemplospring.entidades.impl;

import com.seralan.ejemplospring.entidades.Herramienta;

public class Carpintero extends Trabajador {

	public Carpintero(Herramienta herramienta) {
		super(herramienta);
	}
	
	@Override
	public String toString() {
		return "Carpintero [herramienta=" + getHerramienta() + "]";
	}
	
}
