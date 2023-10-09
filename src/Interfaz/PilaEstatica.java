package Interfaz;

import Excepcion.MatrizLlena;
import Excepcion.PilaVacia;

public class PilaEstatica<T> implements Stack<T>{
	
	private Nodo<T> top;
	private int tamano;
	
	public PilaEstatica() {
		top = null;
		this.tamano = 0;
	}
	
	public void push(T elemento) throws MatrizLlena {
		if (isEmpty()) {
			throw new MatrizLlena("Error. La Pila esta llena.");
		} else {
			Nodo<T> aux = new Nodo<T>(elemento,top);
			top = aux;
			this.tamano = 0;
		}
	}
	
	public T pop() throws PilaVacia {
		if(isEmpty()) {
			throw new PilaVacia("Error. La Pila esta vacia.");
		} else {
			T aux = top.getElemento();
			Nodo<T> siguiente = top.getSiguiente();
			top = null;
			top = siguiente;
			this.tamano--;
			return aux;
		}
	}
	
	public T top()throws PilaVacia{
		if(isEmpty()) {
			throw new PilaVacia("Error. La Pila esta vacia.");
		} else {
			return top.getElemento();
		}
	}
	
	public boolean isEmpty() {
		return top == null;
	}
	
	public int size() {
		return this.tamano;
	}
	
	public String toString() {
		if(isEmpty()) {
			return "La pila esta vacia";
		} else {
			String res = "";
			Nodo<T> aux = top;
			while(aux != null) {
				res = res+ aux.getElemento();
				aux = aux.getSiguiente();
			}
			return res;
		}
	}
}
