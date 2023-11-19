package Interfaz;
/**
 * Clase que se encarga de representar un nodo en una estructura de datos.
 * @author andre
 *
 * @param <T> Tipo de elemento almacenado en el nodo.
 */
//nodo generico
public class Nodo <T> {
	/**
	 * Objeto que te indica cual es el elemento almacenado en el nodo
	 */
	private T elemento;
	/**
	 * Objeto que indica cual es la posicion siguiente al elemento
	 */
	private Nodo<T> siguiente;//un objeto que va a decir cual es el siguiente
	
	/**
	 * Constructor de la clase Nodo.
	 * 
	 * @param elemento Elemento a guardar.
	 * @param siguiente Siguiente posicion al elemento guardado. 
	 */
	//constructor
	public Nodo(T elemento, Nodo<T> siguiente) {
		this.elemento =  elemento;
		this.siguiente = siguiente;
	}
	
	/**
	 * Obtiene el elemento almacenado en el nodo.
	 * 
	 * @return Elemento en el nodo.
	 */
	//metodos get/ set
	public T getElemento() {
		return elemento;
	}
	
	/**
	 * Establece el elemento almacenado en el nodo.
	 * 
	 * @param elemento Elemento a establecer
	 */
	public void setElemento(T elemento) {
		this.elemento = elemento;
	}
	
	/**
	 * Obtiene la posicion siguiente al nodo.
	 * 
	 * @return Siguiente posicion al nodo.
	 */
	public Nodo<T> getSiguiente() {
		return siguiente;
	}
	
	/**
	 * Establece la posicion siguiente al nodo
	 * 
	 * @param siguiente Siguiente posicion al nodo
	 */
	public void setSiguiente(Nodo<T> siguiente) {
		this.siguiente = siguiente;
	}

}
