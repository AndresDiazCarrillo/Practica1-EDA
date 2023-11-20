package Interfaz;

import Excepcion.PilaVacia;

/**
 * Implementacion de una pila dinamica.
 * @author andre
 *
 * @param <T> Tipo de elemento almacenado en la pila.
 */
public class PilaDinamica<T> implements Stack<T> {
	
	/**
	 * Objeto que indica cual es la posicion siguiente al elemento
	 */
	private Nodo<T> top; // nodo superior de la pila
	
	/**
	 * Tamaño de la pila
	 */
	private int tamano; // tamaño actual de la pila
	
	/**
	 * Costuctor de la clase PilaDinamica. Inicializa la pila como vacia.
	 */
	public PilaDinamica() {
		top = null; //no hay nada en el top aun
		this.tamano =0;// la pila se encuentra vacia en un inicio
	}
	
	/**
	 * Agrega un elemento a la pila.
	 * 
	 * @param elemento Elemento a agregar.
	 */
	public void push(T elemento) {//metodo introducir elemento en pila
		Nodo<T> aux =new Nodo<T>(elemento,top);//creamos nuevo nodo qu es el elemento que vamos a introducir
		top=aux;//lo igualamos al top
		this.tamano++;//se uincrementa el tamano de la pila 
	}
	/**
	 * Elimina y devuelve el elemento en la cima de la pila.
	 * 
	 * @return Elemento en la cima de la pila.
	 * @throws PilaVacia Si la pila está vacia.
	 */
	public T pop()throws PilaVacia { //metodo eliminar elemento de la pila
		if(isEmpty()) {
			throw new PilaVacia("Error. La Pila esta vacia.");
		}else {
			T aux = top.getElemento();
			 /*referenciarlo pero no me asegura que se haya eliminado el elemento que se encontraba en el top
			top=top.getSiguiente();*/
			Nodo<T> siguiente = top.getSiguiente();
			top=null;
			top= siguiente;
			this.tamano--;//se decrementa el tamano de la pila
			return aux;	
		}
		
	}
	/**
	 * Retorna el elemento en la cima de la pila sin eliminarlo.
	 * 
	 * @return Elemento en la cima de la pila.
	 * @throws PilaVacia Si la pila está vacia.
	 */
	public T top() throws PilaVacia { // te muestra cual es el elemento que se encuentra en el top
		if(isEmpty()) {
			throw new PilaVacia("Error. La Pila esta vacia.");
		}else
			return top.getElemento();
		
	/**
	 * Verifica si la pila está vacía.
	 * 
	 * @return true si la pila está vacía, false de lo contracio.
	 */
	}
	public boolean isEmpty() {
		return top == null;
		
	/**
	 * Retorna el tamaño actual de la pila.
	 * 
	 * @return Tamaño actual de la pila.
	 */
	}
	public int size() {
		return this.tamano;
	}
	
	/**
	 * Retorna una representacion en cadena de la pila.
	 * 
	 * @return Cadena que representa los elementos contenidos en la pila.
	 */
	public String toString() { //imprime todos elementos contenidos en la pila
		if(isEmpty()) {
			return "La pila esta vacia";
		}else { 
			String res="";
			Nodo<T> aux=top;
			while(aux!=null) {
				res= res + aux.getElemento();
				aux = aux.getSiguiente();
				res = res + " ";	
			}	
			return res;
		}
	}
}