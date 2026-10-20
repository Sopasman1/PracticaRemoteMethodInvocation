package rmi;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class ClienteBanco {
    public static void main(String[] args) {
        try {
            // 1. Conectar al registro
            Registry registry = LocateRegistry.getRegistry("localhost", 1100);
            
            // 2. Buscar el servicio de banco
            BancoService banco = (BancoService) registry.lookup("BancoService");
            
            // 3. Crear el objeto local que será serializado y enviado por la red
            Transaccion txLocal = new Transaccion("TX-9988", 2500.00);
            System.out.println("[Cliente] Objeto creado localmente: " + txLocal);
            
            // 4. Invocar el método remoto pasando el objeto como parámetro
            Transaccion txRespuesta = banco.procesarTransaccion(txLocal);
            
            // 5. Imprimir el objeto devuelto por el servidor
            System.out.println("[Cliente] Objeto recibido del servidor: " + txRespuesta);
            
        } catch (Exception e) {
            System.err.println("[Cliente] Error en el cliente de banco: " + e.getMessage());
            e.printStackTrace();
        }
    }
}