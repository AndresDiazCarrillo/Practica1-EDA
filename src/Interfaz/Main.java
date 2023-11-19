package Interfaz;

import java.io.IOException;

import Excepcion.MatrizLlena;
import Excepcion.PilaVacia;
/**
 * Clase que se encarga de trabajar con las pilas.
 * 
 * @author andre
 *
 */
public class Main {
	/**
	 * Clase en la que creamos la pila estatica y la dinamica y agregamos unos elementos a ellas.
	 * 
	 * @param args Los argumentos que se pasan.
	 * @throws IOException Si hay alguna excepcion.
	 * @throws MatrizLlena Si la implementacion de la pila tiene una capacidad limite y la alcanza.
	 * @throws PilaVacia Si la pila está vacia.
	 */
	public static void main(String args[]) throws IOException, MatrizLlena, PilaVacia {
		// Creamos las pilas que seran mas adelnate la estatica y la dinamica
		Stack<Integer> pila1 = null;
		Stack<Integer> pila2 = null;
		
		int tamaño = 9;
		
		// Le damos un tamaño a la que va a ser la pila estatica
		pila1 = new PilaEstatica<>(tamaño);
		
		// Le añadimos valores del 1 al 9 a la pila estatica
		for(int i = 1; i <= 10; i++) {
			try {
				pila1.push(i);
			} catch (MatrizLlena e) {
		        System.out.println(e.getMessage());
		    }
		}
		System.out.print("Contenido de la pila estatica: ");
		pila1.toString();
		
		// Hacemos que esta sea la pila dinamica
		pila2 = new PilaDinamica<>();
		
		// Le añadimos valores del 1 al 9 a la pila estatica
		for(int i = 1; i <= 9; i++) {
				pila2.push(i);
				
		}
		
		System.out.println("Contenido de la pila dinamica: [ " + pila2.toString() + "]");
		
		// Nos dirigimos a la clase Pilas con el contenido que tienen añadidas nuestras dos pilas
		Pilas(pila1, pila2);
		
	}
	/**
	 * Clase que trabaja con la pila estatica y la dinamica realizando otras operaciones adicionales.
	 * 
	 * @param pila1 Pila con su contenido.
	 * @param pila2 Pila con su contenido.
	 */
	public static void Pilas(Stack<Integer> pila1, Stack<Integer> pila2) {
		// Añadimos y eliminamos mas valores a la pila estatica
		try {
			pila1.push(8);
			pila1.pop();
			pila1.push(5);
			pila1.push(8);
			pila1.push(4);
			System.out.print("Contenido de la pila estatica ampliada: ");
			pila1.toString();
			
			} catch (MatrizLlena | PilaVacia e) {
		        System.out.println(e.getMessage());
		    }
			
		// Añadimos y eliminamos mas valores a la pila estatica
		try {
			pila2.push(8);
			pila2.pop();
			pila2.push(5);
			pila2.push(8);
			pila2.push(4);
			System.out.println("Contenido de la pila dinamica: [" + pila2.toString() + "]");
			
			
			} catch (MatrizLlena | PilaVacia e) {
		        System.out.println(e.getMessage());
		    }
	
	}
}
