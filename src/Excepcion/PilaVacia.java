package Excepcion;

/**
 * Excepcion que indica que la pila est� vac�a y no se puede realizar ciertas operaciones.
 * @author andre
 *
 */
public class PilaVacia extends Exception {
	
	/**
	 * Constructor de la clase PilaVacia.
	 * 
	 * @param message Mensaje descriptivo de la excepci�n.
	 */
	public PilaVacia(String message) {
		super(message);
	}
}