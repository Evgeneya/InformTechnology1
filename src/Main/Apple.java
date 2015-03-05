package Main;

import java.io.Serializable;

/**
 * Created by 1 on 05.03.2015.
 */
public class Apple implements Serializable {

    private double weight;
    private int price;
    private String sort;

    public Apple(double v, int i, String s) {
        this.weight = v;
        this.price = i;
        this.sort = s;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }
    public int getPrice() {
        return price;
    }

    public void setPrice(int price){
        this.price = price;
    }

}
