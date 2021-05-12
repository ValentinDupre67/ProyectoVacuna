package TDALista;

public class DNodo<E> implements Position<E> {

	@Override
	public E element() {
		return elemento;
	}
	
	//atributos
	private E elemento;
	private DNodo<E> previo, siguiente;
	
	//constructor
	/**
	 *  Crea un nodo, orden de los params: Elem, Prev, Sig
	 * @param element Elemento del nodo
	 * @param prev Nodo Previo
	 * @param sig Nodo siguiente
	 */
	public DNodo(E element, DNodo<E> prev, DNodo<E> sig) {
		elemento = element;
		previo = prev;
		siguiente = sig;
	}
	
	public DNodo(E element) {
		elemento = element;
		previo = null;
		siguiente = null;
	}
	
	//metodos
	
	public DNodo<E> getPrev(){
		return previo;
	}
	
	public DNodo<E> getNext(){
		return siguiente;
	}
	
	public void setElement(E e) {
		elemento = e;
	} 
	
	public void setPrev(DNodo<E> p) {
		previo = p;
	}
	
	public void setNext(DNodo<E> n) {
		siguiente = n;
	}
	
	/*public DNodo<E> clone(){
		DNodo<E> clon = new DNodo<E>(elemento,previo.clone(),siguiente.clone());
		return clon;
	}*/
	
}
