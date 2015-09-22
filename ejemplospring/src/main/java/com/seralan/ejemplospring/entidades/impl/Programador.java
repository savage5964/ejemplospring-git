package com.seralan.ejemplospring.entidades.impl;

import com.seralan.ejemplospring.entidades.Herramienta;

public class Programador extends Trabajador {

	public Programador(Herramienta herramienta) {
		super(herramienta);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "Programador [herramienta=" + getHerramienta() + "]";
	}
	
}
