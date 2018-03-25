package bsr.rmi;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;

public class MyRMIServer {
	public static void main(String[] args) {
		try {
			//Object x = new Object();
			//Naming.rebind("x", x);
		} catch (RemoteException e) {
			e.printStackTrace();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}
}
