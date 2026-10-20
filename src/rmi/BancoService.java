package rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface BancoService extends Remote {
    Transaccion procesarTransaccion(Transaccion tx) throws RemoteException;
}