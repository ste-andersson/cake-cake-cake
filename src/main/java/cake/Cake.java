package cake;

public class Cake {

    private String flavor;
    private double price;

    public String getFlavor() {
        return flavor;
    }

    public double getPrice() {
        return price;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Cake(String flavor) {
        this.flavor = flavor;
    }

}
