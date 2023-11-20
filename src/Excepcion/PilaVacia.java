package Excepcion;

/**
 * Excepcion que indica que la pila está vacía y no se puede realizar ciertas operaciones.
 * @author andre
 *
 */
public class PilaVacia extends Exception {
	
	/**
	 * Constructor de la clase PilaVacia.
	 * 
	 * @param message Mensaje descriptivo de la excepción.
	 */
	public PilaVacia(String message) {
		super(message);
	}
}