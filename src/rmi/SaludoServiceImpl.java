package rmi;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class SaludoServiceImpl extends UnicastRemoteObject implements SaludoService {
    
    public SaludoServiceImpl() throws RemoteException {
        super();
    }

    @Override
    public String saludar(String nombre) throws RemoteException {
        System.out.println("[Servidor] Petición recibida para el nombre: " + nombre);
        return "¡Hola, " + nombre + "! Saludos desde el servidor RMI.";
    }
}