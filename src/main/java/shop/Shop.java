package shop;

import product.*;
import accesory.*;

public class Shop {

    public static void main(String[] args) {
        Product biurko = new Desktop(123);
        biurko.setColor("white-oak");
        biurko.setName("White oak desk");
        biurko.setPrice(120.0);

        Accessory podstawka = new DesktopSupport(124);
        podstawka.setPrice(25.0);
        biurko.addAccessory(podstawka);

        Product error = new Desktop(1);

        Basket basket = new Basket();
        basket.add(biurko);
        basket.add(error);
        basket.del(error);

        System.out.println("Wartość koszyka = " + basket.getTotalNetPrice());
    }

}
