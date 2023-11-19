package Interfaz;

import Excepcion.MatrizLlena;
import Excepcion.PilaVacia;

/**
 * Inerfaz que define el comportamiento de la pila.
 * @author andre
 *
 * @param <T> Tipo de elementos almacenados en la pila.
 */
public interface Stack<T> {
	
	/**
	 * Agrega un elemento a la pila.
	 * 
	 * @param element Elemento a agregar.
	 * @throws MatrizLlena Si la implementacion de la pila tiene una capacidad limite y la alcanza.
	 */
	void push(T element)throws MatrizLlena;
	
	/**
	 * Elimina y devuelve el elemento en la cima de la pila.
	 * 
	 * @return Elemento en la cima de la pila.
	 * @throws PilaVacia Si la pila esta vacia.
	 */
	T pop() throws PilaVacia;
	
	/**
	 * Retorna el elemento en la cima de la pila sin eliminarlo.
	 * 
	 * @return Elemento en la cima de la pila.
	 * @throws PilaVacia Si la pila esta vacia.
	 */
	T top() throws PilaVacia;
	
	/**
	 * Verifica si la pila esta vacia.
	 * 
	 * @return true si la pila esta vacia, false de lo contrario.
	 */
	boolean isEmpty();
	
	/**
	 * Retorna el tamaño actual de la pila.
	 * 
	 * @return Tamaño actual de la pila.
	 */
	int size();
	
	/**
	 * Retorna una representacion en cadena de la pila.
	 * 
	 * @return Cadena que representa los elementos contenidos en la pila.
	 */
	String toString();
}
