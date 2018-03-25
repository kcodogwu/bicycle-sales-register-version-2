package bsr.bt;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface IBinaryTree<T> extends Remote {
	public void insert(int k, T nv) throws RemoteException;
}
