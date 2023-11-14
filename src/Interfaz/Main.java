package Interfaz;

import java.io.IOException;

import Excepcion.MatrizLlena;
import Excepcion.PilaVacia;

public class Main {

	public static void main(String args[]) throws IOException, MatrizLlena, PilaVacia {
		Stack<Integer> pila1 = null;
		Stack<Integer> pila2 = null;
		
		int tamaño = 9;
		
		pila1 = new PilaEstatica<>(tamaño);
		
		for(int i = 1; i <= 10; i++) {
			try {
				pila1.push(i);
			} catch (MatrizLlena e) {
		        System.out.println(e.getMessage());
		    }
		}
		System.out.print("Contenido de la pila estatica: ");
		pila1.toString();
		
		pila2 = new PilaDinamica<>();
		
		for(int i = 1; i <= 9; i++) {
				pila2.push(i);
				
		}
		
		System.out.println("Contenido de la pila dinamica: [ " + pila2.toString() + "]");
		
		Pilas(pila1, pila2);
		
	}
	
	public static void Pilas(Stack<Integer> pila1, Stack<Integer> pila2) {
		
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
