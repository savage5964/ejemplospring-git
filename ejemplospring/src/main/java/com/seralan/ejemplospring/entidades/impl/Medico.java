package com.seralan.ejemplospring.entidades.impl;

import com.seralan.ejemplospring.entidades.Herramienta;

public class Medico extends Trabajador{

	public Medico(Herramienta herramienta) {
		super(herramienta);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "Medico [herramienta=" + getHerramienta() + "]";
	}
	
}
