package Interfaz;

import Excepcion.MatrizLlena;
import Excepcion.PilaVacia;

public interface Stack<T> {
	void push(T element)throws MatrizLlena;
	T pop() throws PilaVacia;
	T top() throws PilaVacia;
	boolean isEmpty();
	int size();
	String toString();
}
