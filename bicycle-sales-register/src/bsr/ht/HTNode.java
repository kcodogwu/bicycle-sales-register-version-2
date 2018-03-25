package bsr.ht;

public class HTNode<T> {
	int key;
	HTNode<T> next;
	T value;
	
	public HTNode(int k, T v) {
		this.key = k;
		this.value = v;
		this.next = null;
	};
	
	public int getKey() {
		return key;
	}
}
