package rmi;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class ClienteRMI {
    public static void main(String[] args) {
        try {
            Registry registry = LocateRegistry.getRegistry("localhost", 1100);
            SaludoService servicio = (SaludoService) registry.lookup("SaludoService");
            
            String respuesta = servicio.saludar("Estudiante de Sistemas Distribuidos");
            System.out.println("[Cliente] Respuesta del servidor: " + respuesta);
            
        } catch (Exception e) {
            System.err.println("[Cliente] Error en el cliente: " + e.getMessage());
            e.printStackTrace();
        }
    }
}