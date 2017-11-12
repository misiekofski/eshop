package accesory;

public abstract class Accessory {
    protected Double price;
    protected int ID;

    public Accessory(int ID) {
        this.ID=ID;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getPrice() {
        return price;
    }
}
