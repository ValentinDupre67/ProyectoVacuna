package TDAPila;

public class PilaEnlazada<E> implements Stack<E>{
	//atributos de instancia
		protected Nodo<E> head;
		protected int tama�o;
		
		public PilaEnlazada() {
			head = null;
			tama�o = 0;
		}
		
		@Override
		public int size() { //O(1)
			return tama�o;
		}

		@Override
		public boolean isEmpty() { //O(1)
			return tama�o == 0;
		}

		@Override
		public E top() throws EmptyStackException { //O(1)
			if(isEmpty()) {
				throw new EmptyStackException("Pila Vacia");
			}
			return head.getElemento();
		}

		@Override
		public void push(E element) { //O(1)
			Nodo<E> aux = new Nodo<E>(element,head);
			head = aux;
			tama�o++;
		}

		@Override
		public E pop() throws EmptyStackException { //O(1)
			if(isEmpty()) {
				throw new EmptyStackException("Pila Vacia");
			}
			E aux = head.getElemento();
			head = head.getSiguiente();
			tama�o--;
			return aux;
		}
		
		public void invertir() {
			Stack<E> otraPila1, otraPila2;
			otraPila1 = new PilaEnlazada<E>();
			otraPila2 = new PilaEnlazada<E>();
			pasar( this, otraPila1 );
			pasar( otraPila1, otraPila2 );
			pasar( otraPila2, this );
		}
		
		private void pasar( Stack<E> p1, Stack<E> p2 ) {
			// Pasa el contenido de p1 a p2
			try {
			while( !p1.isEmpty() ) p2.push(p1.pop());
			} catch( EmptyStackException e ) { e.printStackTrace(); }
		}
}
