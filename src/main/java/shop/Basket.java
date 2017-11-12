package shop;

import product.Product;
import accesory.*;

import java.util.Collection;
import java.util.HashSet;

public class Basket {
    protected Collection<Product> basket = new HashSet();
    Double vat = 0.23;

    public void add(Product product) {
        basket.add(product);
    }
    public void del(Product product) { basket.remove(product); }

    public Double getTotalNetPrice(){
        Double netPrice = 0.0;
        for (Product p : basket) {
           netPrice += p.getPrice() + p.getTotalAccessoriesPrice();
        }
        return netPrice;
    }

    public Double getTotalPriceWithTax(){
        return getTotalNetPrice()+getTotalNetPrice()*vat;
    }

    public void clearBasket(){
        basket.clear();
    }

}
