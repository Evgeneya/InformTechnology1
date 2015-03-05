package Main;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 * Created by 1 on 05.03.2015.
 */
    public class Client{

        public static void main(String[] args) throws Exception {
            System.out.println("Starting...");
            // создание строки, содержащей URL удаленного объекта
            String objectName = "rmi://localhost/sum";
            // соединение с реестром RMI
            Registry registry= LocateRegistry.getRegistry();
            //  получение ссылки на удаленный объект
            SumServer server = (SumServer) registry.lookup(objectName);
            //System.out.println(server.getSum(5,6));
            System.out.println("Running...");
            System.out.println(server.getSum(1,2,3,4,5));

            System.out.println(server.getApples());
        }
    }

