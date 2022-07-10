package superCake;

public class WeddingCake extends Cake{
private int tiers;

    public WeddingCake(String taste, int price, int tiers) {
        super(taste, price);
        this.tiers = tiers;
    }

    public int getTiers() {
        return tiers;
    }

    public void setTiers(int tiers) {
        this.tiers = tiers;
    }

    @Override
    public String toString() {
        return "WeddingCake{" +
                "tiers=" + tiers +
                '}';
    }
}
