package rmi;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class BancoServiceImpl extends UnicastRemoteObject implements BancoService {
    
    public BancoServiceImpl() throws RemoteException {
        super();
    }

    @Override
    public Transaccion procesarTransaccion(Transaccion tx) throws RemoteException {
        System.out.println("[Servidor] Objeto Transacción recibido: " + tx);
        
        // Modificamos el objeto para simular un procesamiento en el servidor
        Transaccion txProcesada = new Transaccion(
            tx.getIdTransaccion() + "-APROBADA", 
            tx.getMonto() * 1.15 // Aplicamos un cargo o cálculo
        );
        
        System.out.println("[Servidor] Enviando objeto procesado de vuelta al cliente...");
        return txProcesada;
    }
}