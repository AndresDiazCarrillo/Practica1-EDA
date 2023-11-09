package Interfaz;

import java.util.Scanner;

import Excepcion.MatrizLlena;
import Excepcion.PilaVacia;

public class Main {

	public static void main(String args[]) {
		Scanner scanner=new Scanner(System.in);
		int opciones;
		
		System.out.println("¿Que tipo de pila desea usar?");
		System.out.println("1. pila estatica");
		System.out.println("2. Pila dinamica");
		
		opciones = scanner.nextInt();
		
		Stack<Integer> pila = null;
		
		if (opciones == 1) {
			System.out.println("Ingrese el tamaño de la pila estatica");
			int tamaño = scanner.nextInt();
			pila = new PilaEstatica<>(tamaño);
		} else if (opciones == 2) {
			pila = new PilaDinamica<>();
		} else {
			System.out.println("Opcion no valida");
		}
		
		while (true) {
		    System.out.println("\nOperaciones en la pila:");
		    System.out.println("1. Push");
		    System.out.println("2. Pop");
		    System.out.println("3. Mostrar top");
		    System.out.println("4. Mostrar tamaño");
		    System.out.println("5. Mostrar pila");
		    System.out.println("6. Salir");

		    int operacion = scanner.nextInt();

		    try {
		        switch (operacion) {
		            case 1:
		                System.out.println("Ingrese el elemento a agregar:");
		                int elementoPush = scanner.nextInt();
		                pila.push(elementoPush);
		                break;

		            case 2:
		                int elementoPop = pila.pop();
		                System.out.println("Elemento pop: " + elementoPop);
		                break;

		            case 3:
		                System.out.println("Top de la pila: " + pila.top());
		                break;

		            case 4:
		                System.out.println("Tamaño de la pila: " + pila.size());
		                break;

		            case 5:
		                System.out.println("Contenido de la pila: " + pila.toString());
		                break;

		            case 6:
		                System.out.println("Saliendo del programa");
		                scanner.close();
		                return;

		            default:
		                System.out.println("Opción no válida");
		        }
		    } catch (MatrizLlena | PilaVacia e) {
		        System.out.println(e.getMessage());
		    }
		}

	}
	
}
