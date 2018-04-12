
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author P&D
 */
public class ClientRMI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        InterfazOperArit obj;
            String dirIPServer="192.168.64.152";
            int puertoServer = 3232;
        try {            
            Registry registry = LocateRegistry.getRegistry(dirIPServer,puertoServer);
            obj = (InterfazOperArit) (registry.lookup("Servidor1"));
            long fact = obj.factorial(5);
            System.out.println("el factorial de 5: es"+fact);
        } catch (Exception ex) {
            Logger.getLogger(ClientRMI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
