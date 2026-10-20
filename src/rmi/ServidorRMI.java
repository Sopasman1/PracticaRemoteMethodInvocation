package rmi;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class ServidorRMI {
    public static void main(String[] args) {
        try {
            // 1. Crear el registro RMI en el puerto 1100
            Registry registry = LocateRegistry.createRegistry(1100);
            
            // 2. Instanciar y registrar el servicio de Saludo
            SaludoService saludoService = new SaludoServiceImpl();
            registry.rebind("SaludoService", saludoService);
            
            // 3. Instanciar y registrar el servicio de Banco (Serialización)
            BancoService bancoService = new BancoServiceImpl();
            registry.rebind("BancoService", bancoService);
            
            System.out.println("[Servidor] Servidor RMI iniciado correctamente con todos los servicios.");
        } catch (Exception e) {
            System.err.println("[Servidor] Error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}