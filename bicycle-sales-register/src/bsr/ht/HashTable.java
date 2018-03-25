package bsr.ht;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class HashTable<T> extends UnicastRemoteObject implements IHashTable<T> {
	private int limit;
	private Object[] head;
	
	public HashTable()throws RemoteException {
		super();
	}
	
	public HashTable(int l) throws RemoteException {
		this.limit = l;
		this.head = new Object[this.limit];
		
		for (int i = 0; i < limit; i++)
			head[i] = null
		;
	}
	
	@Override
	public int hash(int id) throws RemoteException {
		return id % this.limit;
	}
	
	@Override
	@SuppressWarnings("unchecked")
	public void insert(int k, T nv) throws RemoteException {
		HTNode<T> temp = new HTNode<T>(k, nv);
		int index = hash(k);
		
		temp.next = (HTNode<T>) head[index];
		head[index] = temp;
	}

	@Override
	@SuppressWarnings("unchecked")
	public HTNode<T> search(int k) throws RemoteException {
		int index = hash(k);
		HTNode<T> temp = (HTNode<T>) head[index];
		boolean found = false;
		
		while (temp != null && found == false) {
			if (temp.key == k) {
				found = true;
				break;
			}
			
			temp = temp.next;
		}
		
		return temp;
	}

}
