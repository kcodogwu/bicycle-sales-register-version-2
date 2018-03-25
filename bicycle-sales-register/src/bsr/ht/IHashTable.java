package bsr.ht;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface IHashTable<T> extends Remote {
	public int hash(int id) throws RemoteException;
	public void insert(int k, T nv) throws RemoteException;
	public HTNode<T> search(int k) throws RemoteException;
}
