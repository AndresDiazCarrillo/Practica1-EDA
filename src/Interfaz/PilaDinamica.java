package Interfaz;

import Excepcion.PilaVacia;

public class PilaDinamica<T> implements Stack<T> {
	
	private Nodo<T> top;
	private int tamano;
	
	public PilaDinamica() {
		top = null; //no hay nada en el top aun
		this.tamano =0;// la pila se encuentra vacia en un inicio
	}
	
	public void push(T elemento) {//metodo introducir elemento en pila
		Nodo<T> aux =new Nodo<T>(elemento,top);//creamos nuevo nodo qu es el elemento que vamos a introducir
		top=aux;//lo igualamos al top
		this.tamano++;//se uincrementa el tamano de la pila 
	}
	
	public T pop()throws PilaVacia {
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
	
	public T top() throws PilaVacia {
		if(isEmpty()) {
			throw new PilaVacia("Error. La Pila esta vacia.");
		}else
			return top.getElemento();
		
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
		}else { 
			String res="";
			Nodo<T> aux=top;
			while(aux!=null) {
				res= res + aux.getElemento();
				aux = aux.getSiguiente();
					
			}	
			return res;
		}
	}
}