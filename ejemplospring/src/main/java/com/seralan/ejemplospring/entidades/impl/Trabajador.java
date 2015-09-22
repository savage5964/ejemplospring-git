package com.seralan.ejemplospring.entidades.impl;

import com.seralan.ejemplospring.entidades.Herramienta;
import com.seralan.ejemplospring.entidades.Persona;

public class Trabajador implements Persona {

	private Herramienta herramienta;

	public Trabajador(Herramienta herramienta) {
		super();
		this.herramienta = herramienta;
	}

	public Herramienta getHerramienta() {
		return herramienta;
	}

	public void setHerramienta(Herramienta herramienta) {
		this.herramienta = herramienta;
	}

	@Override
	public String getNombre() {
		// TODO Auto-generated method stub
		return "Trabajador";
	}

	@Override
	public String getDescripcion() {
		// TODO Auto-generated method stub
		return "Soy un trabajador";
	}

	@Override
	public String toString() {
		return "Trabajador [herramienta=" + herramienta + "]";
	}
	
}
