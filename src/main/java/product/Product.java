package product;

import accesory.*;

import java.util.Collection;
import java.util.HashSet;

public abstract class Product {
    protected int ID;
    protected String name;
    protected String color;
    protected Double price;
    protected Collection<Accessory> basket = new HashSet();

    public void setColor(String color) {
        this.color = color;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }


}
