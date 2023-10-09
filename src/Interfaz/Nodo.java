package Interfaz;

//nodo generico
public class Nodo <T> {
	
	private T elemento;
	private Nodo<T> siguiente;//un objeto que va a decir cual es el siguiente
	
	//constructor
	public Nodo(T elemento, Nodo<T> siguiente) {
		this.elemento =  elemento;
		this.siguiente = siguiente;
	}
	
	//metodos get/ set
	public T getElemento() {
		return elemento;
	}
	public void setElemento(T elemento) {
		this.elemento = elemento;
	}
	public Nodo<T> getSiguiente() {
		return siguiente;
	}
	public void setSiguiente(Nodo<T> siguiente) {
		this.siguiente = siguiente;
	}

}
