package shop;

import product.Product;

import java.util.Collection;
import java.util.HashSet;

public class Basket {
    protected Collection<Product> basket = new HashSet();

    public void add(Product product) {
        basket.add(product);
    }

    public Double getTotalNetPrice(){
        Double netPrice = 0.0;
        for (Product p : basket) {
           netPrice += p.getPrice();
        }
        return netPrice;
    }

}
