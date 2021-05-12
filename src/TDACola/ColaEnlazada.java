package TDACola;

public class ColaEnlazada<E> implements Queue<E>{

	//atributos
	Nodo<E> header;
	Nodo<E> trailer;
	int size;
	
	@Override
	public int size() {
		return size;
	}

	@Override
	public boolean isEmpty() {
		return size == 0;
	}

	@Override
	public E front() throws EmptyQueueException {
		if(isEmpty())
			throw new EmptyQueueException("front()::Lista Vacia");
		return header.getElemento();
	}

	@Override
	public void enqueue(E element) {
		Nodo<E> nuevo = new Nodo<E>(element);
		trailer.setSiguiente(nuevo);
		trailer = nuevo;
		size++;
	}

	@Override
	public E dequeue() throws EmptyQueueException {
		if(isEmpty())
			throw new EmptyQueueException("dequeue()::Lista Vacia");
		Nodo<E> pos = header;
		Nodo<E> toReturn = trailer;
		while(pos.getSiguiente()!=trailer) {
			pos = pos.getSiguiente();
		}
		trailer = null;
		trailer = pos;
		size--;
		return toReturn.getElemento();
		
		
		
		
		
	}
	
}
