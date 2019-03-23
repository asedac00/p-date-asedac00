package es.unileon.prg.date;

/**
 * Clase que anuncia una excepcion(error)
 * @version inicial 
 * @author Ana Sedano Cañas
 */

public class DateException extends Exception {
	/**
	 * Mensaje que advierte de un error
	 * @param message ERROR
	 */
	
	public DateException(String message){
		super(message);
	}

}
