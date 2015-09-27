package com.seralan.ejemplospring.entidades.impl;

import com.seralan.ejemplospring.entidades.Herramienta;

/**
 * 
 * @author TOSHIBA
 *
 */
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

	@Override
	public int getContador() {
		// TODO Auto-generated method stub
		return 0;
	}

}
