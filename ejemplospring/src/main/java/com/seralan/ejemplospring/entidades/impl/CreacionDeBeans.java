package com.seralan.ejemplospring.entidades.impl;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.seralan.ejemplospring.entidades.Herramienta;
import com.seralan.ejemplospring.entidades.Persona;

public class CreacionDeBeans {

	public static void main(String[] args) {


		@SuppressWarnings("resource")
		ApplicationContext factory = new ClassPathXmlApplicationContext("application-context.xml");

		Herramienta martillo = (Martillo) factory.getBean("martillo");
		System.out.println(martillo.getDescripcion());
		
		Persona persona = (Persona) factory.getBean("medico");
		System.out.println(persona);
		
	}

}
