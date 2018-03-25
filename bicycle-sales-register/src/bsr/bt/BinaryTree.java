package bsr.bt;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class BinaryTree<T> extends UnicastRemoteObject implements IBinaryTree<T> {
	private BTNode<T> head;
	private BTNode<T> tail;
	
	public BinaryTree() throws RemoteException {
		this.tail = new BTNode<T>(0, null, null, null);
		this.head = new BTNode<T>(-1, null, null, this.tail);
	}
	
	@Override
	public void insert(int k, T nv)throws RemoteException {
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
