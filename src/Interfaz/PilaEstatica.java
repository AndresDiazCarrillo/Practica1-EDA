package Interfaz;

import Excepcion.MatrizLlena;
import Excepcion.PilaVacia;

public class PilaEstatica<T> implements Stack<T>{
	
	private T [] stack;
	private int tamano;
	private int top = -1;
	
	public PilaEstatica(int tamano) {
		stack = (T[]) new Object[tamano];
		this.tamano = tamano;
	}
	
	public void push(T elemento) throws MatrizLlena {
		if (top == tamano - 1) {
			throw new MatrizLlena("Error. La Pila esta llena.");
		} else {
			top++;
			stack[top] = elemento;
		}
	}
	
	public T pop() throws PilaVacia {
		if(top == -1) {
			throw new PilaVacia("Error. La Pila esta vacia.");
		} else {
			T elemento = stack[top];
			top--;
			return elemento;
		}
	}
	
	public T top()throws PilaVacia{
		if(top == -1) {
			throw new PilaVacia("Error. La Pila esta vacia.");
		} else {
			return stack[top];
		}
	}
	
	public boolean isEmpty() {
		return top == -1;
	}
	
	public int size() {
		return top + 1;
	}
	
	public String toString() {
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
