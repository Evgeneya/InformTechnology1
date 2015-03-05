package Main;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

/**
 * Created by 1 on 05.03.2015.
 */
public interface SumServer extends Remote {
    public int getSum (int... value) throws RemoteException;
    public List<Apple> getApples() throws RemoteException;
    public void addApple(Apple apple);
    public List<Apple> findBySort(String sort);
}
