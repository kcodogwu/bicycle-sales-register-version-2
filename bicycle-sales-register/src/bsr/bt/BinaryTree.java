package bsr.bt;

public class BinaryTree<T> {
	private BTNode<T> head;
	private BTNode<T> tail;
	
	public BinaryTree() {
		this.tail = new BTNode<T>(0, null, null, null);
		this.head = new BTNode<T>(-1, null, null, this.tail);
	}
	
	public void insert(int k, T nv) {
		BTNode<T> p, x;

		p = this.head; 
		x = this.head.right;

		while (x != this.tail) {
			p = x;
			x = (k < x.key) ? x.left : x.right;
		}

		x = new BTNode<T> (k, nv, this.tail, this.tail);

		if (k < p.key) 
			p.left = x
		; else
			p.right = x
		;
	}
}
