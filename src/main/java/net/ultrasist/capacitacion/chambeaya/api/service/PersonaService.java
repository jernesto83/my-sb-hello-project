package net.ultrasist.capacitacion.chambeaya.api.service;

import java.util.List;

import net.ultrasist.capacitacion.chambeaya.api.exceptions.ServiceException;
import net.ultrasist.capacitacion.chambeaya.api.model.Persona;

public interface PersonaService {

	/**
	 * Regresa una lista de objetos de tipo persona
	 * @return List<Persona>
	 */
	List<Persona> getBolsa()  throws ServiceException;
	
	/**
	 * Calcula el factorial de un entero
	 * @param n entero al cual se le va a calcular el factorial
	 * @return entero que tiene el factorial de n
	 */
	public int fact(int n);
}
