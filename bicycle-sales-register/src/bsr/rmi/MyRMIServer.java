package bsr.rmi;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import bsr.entity.Bicycle;
import bsr.entity.Sale;
import bsr.bt.BinaryTree;
import bsr.ht.HashTable;

public class MyRMIServer {
	public static void main(String[] args) {
		try {
			BinaryTree<Sale> btSales = new BinaryTree<Sale>();
			BinaryTree<Bicycle> btBicycles = new BinaryTree<Bicycle>();
			HashTable<Sale> htSales = new HashTable<Sale>(1000);
			HashTable<Bicycle> htBicycles = new HashTable<Bicycle>(1000);
			
			Naming.rebind("bt_sales", btSales);
			Naming.rebind("bt_bicycles", btBicycles);
			Naming.rebind("ht_sales", htSales);
			Naming.rebind("ht_bicycles", htBicycles);
		} catch (RemoteException e) {
			e.printStackTrace();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}
}
