package cake;

public class WeddingCake extends Cake {
    private int tiers = 3;

    public int getTiers() {
        return tiers;
    }

    public void setTiers(int tiers) {
        this.tiers = tiers;
    }

    public WeddingCake(String flavor) {
    super(flavor);
    setPrice(50);
    }
}
