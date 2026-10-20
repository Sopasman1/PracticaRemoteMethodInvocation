package rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface SaludoService extends Remote {
    String saludar(String nombre) throws RemoteException;
}