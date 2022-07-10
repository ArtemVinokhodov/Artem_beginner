package superCake;

public class BirthdayCake extends Cake{
    private int candles;

    public BirthdayCake(String taste, int price, int candles) {
        super(taste, price);
        this.candles = candles;
    }


    public int getCandles() {
        return candles;
    }

    public void setCandles(int candles) {
        this.candles = candles;
    }

    @Override
    public String toString() {
        return "BirthdayCake{" +
                "candles=" + candles +
                '}';
    }
}
