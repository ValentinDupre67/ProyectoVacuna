package TDAMapeo;

public class Entrada<K, V> implements Entry<K, V> {

	private K k;
	private V v;
	
	public Entrada(K key, V value) {
		k = key;
		v = value;
	}
	
	@Override
	public K getKey() {
		return k;
	}

	@Override
	public V getValue() {
		return v;
	}

	public void setKey(K key) {
		k = key;
	}

	public V setValue(V value) {
		V old = v;
		v = value;
		return old;
	}
	
	public String toString() {
		String s = " ";
		s+="[K: "+ k +" V: "+v+" ]";
		return s;
	}

}
