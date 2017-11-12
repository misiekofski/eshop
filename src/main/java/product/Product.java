package product;

import accesory.*;

import java.util.Collection;
import java.util.HashSet;

public abstract class Product {
    protected int ID;
    protected String name;
    protected String color;
    protected Double price;
    private Double vat = 0.23;
    protected Collection<Accessory> accessories = new HashSet();

    public Product(int ID) {
        this.ID=ID;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return this.price;
    }

    public Double getPriceBrutto() {
        return this.price*vat;
    }

    public String toString(){
        return "Undefined product";
    }

    public void addAccessory(Accessory accessory) {
        accessories.add(accessory);
    }

}
