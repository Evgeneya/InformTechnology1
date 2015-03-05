package Main;

import Main.SumServer;
import Main.SumServerImpl;

import java.net.MalformedURLException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by 1 on 05.03.2015.
 */
public class Server {



    public static void main(String[] args) throws RemoteException, MalformedURLException {
        System.out.println("Initializing...");
        // создание удаленного объекта
        SumServer service = new SumServerImpl();
        // задание имени удаленного объекта
        String serviceName = "rmi://localhost/sum";
        // регистрация удаленного объекта в реестре rmiregistry
        Registry registry = LocateRegistry.createRegistry(1099);
        registry.rebind(serviceName, service);
        System.out.println("Running...");
        service.addApple(new Apple(1.8, 2, "antonovka"));
        System.out.println("Running");
    }
}

