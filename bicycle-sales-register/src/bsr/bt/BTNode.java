package bsr.bt;

public class BTNode<T> {
	int key;
	BTNode<T> left;
	BTNode<T> right;
	T value;
	
	public BTNode(int k, T v, BTNode<T> l, BTNode<T> r) {
		this.key = k;
		this.value = v;
		this.left = l;
		this.right = r;
	};
}
