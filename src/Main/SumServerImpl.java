package Main;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by 1 on 05.03.2015.
 */
public class SumServerImpl  implements SumServer {

    public SumServerImpl() throws RemoteException {
        super();
    }
    List<Apple> apples = new LinkedList();
    public int getSum(int... values) throws RemoteException {
        int sum = 0;
        for(int value: values) {
            sum += value;
        }
        return sum;
    }

    @Override
    public List<Apple> getApples() throws RemoteException {
        return apples;
    }

    @Override
    public void addApple(Apple apple) {
        apples.add(apple);

    }

    @Override
    public List<Apple> findBySort(String sort) {
        List<Apple> ret = new ArrayList<Apple>();
        for (Apple apple : apples){
            if (sort.equals(apple.getSort())){
                ret.add(apple);
            }
        }
        return ret;

    }
}

