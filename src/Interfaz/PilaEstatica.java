package Interfaz;

import Excepcion.MatrizLlena;
import Excepcion.PilaVacia;

/**
 * Implementacion de una pila estatica.
 * @author andre
 *
 * @param <T> Tipo de elemento almacenado en la pila
 */
public class PilaEstatica<T> implements Stack<T>{
	
	/**
	 * Tamaño de la pila
	 */
	private T [] stack;
	
	/**
	 * El valor del tamaño de la pila
	 */
	private int tamano;
	
	/**
	 * Valor del top
	 */
	private int top = -1;
	
	/**
	 * Constructor que crea una pila estatica con un tamaño dado.
	 * 
	 * @param tamano Tamaño de la pila.
	 */
	public PilaEstatica(int tamano) {
		stack = (T[]) new Object[tamano];
		this.tamano = tamano; // le damos a la pila un tamaño
	}
	
	/**
	 * Agrega un elemento a la pila.
	 * 
	 * @throws MatrizLlena Si la implementacion de la pila tiene una capacidad limite y la alcanza.
	 */
	public void push(T elemento) throws MatrizLlena { //metodo introducir elemento en pila
		if (top == tamano - 1) { //si no queda mas hueco en la pila salta un error
			throw new MatrizLlena("Error. La Pila esta llena.");
		} else { // en el caso de que haya espacio se añade el valor a la pila
			top++; // aumentamos en uno el valor del top
			stack[top] = elemento; // en la posicion que este el top ahi añadimos ese nuevo valor
		}
	}
	
	/**
	 * Elimina y devuelve en la cima de la pila.
	 * 
	 * @return Elemento en la cima de la pila.
	 * @throws PilaVacia Si la pila está vacia.
	 */
	public T pop() throws PilaVacia { // metodo eliminar elemento de la pila
		if(top == -1) { // si la pila esta vacia salta un error
			throw new PilaVacia("Error. La Pila esta vacia.");
		} else { // en el caso de que haya elementos
			T elemento = stack[top]; // seleccionamos ese elemento 
			top--; //se drecrementa el tamaño de la pila
			return elemento;
		}
	}
	
	/**
	 * Retorna el elemento en la cima de la pila sin eliminarlo.
	 * 
	 * @return Elemento en la cima de la pila.
	 * @throws PilaVacia Si la pila está vacia.
	 */
	public T top()throws PilaVacia{ // te muestra cual es el elemento que se encuentra en el top
		if(top == -1) {
			throw new PilaVacia("Error. La Pila esta vacia.");
		} else {
			return stack[top];
		}
	}
	
	/**
	 * Verifica si la pila está vacía.
	 * 
	 * @return true si la pila está vacía, false de lo contracio.
	 */
	public boolean isEmpty() {
		return top == -1;
	}
	
	/**
	 * Retorna el tamaño actual de la pila.
	 * 
	 * @return Tamaño actual de la pila.
	 */
	public int size() {
		return top + 1;
	}
	
	/**
	 * Retorna una representacion en cadena de la pila.
	 * 
	 * @return Cadena que representa los elementos contenidos en la pila.
	 */
	public String toString() { // imprime todos los elementos contenidos en la 
		if(top == -1) {
			return "La pila esta vacia";
		} else {
			System.out.print("[");
			for(int i=top; i >= 0; i--) {
				System.out.print(" " + stack[i] + " ");
			}
			System.out.println("]");
		}
		return null;
	}
}
