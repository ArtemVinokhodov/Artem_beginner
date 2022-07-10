package superCake;

public class Cake {
    private String taste;
    private int price;

    public Cake(String taste, int price) {
        this.taste = taste;
        this.price = price;
    }

    public String getTaste() {
        return taste;
    }

    public void setTaste(String taste) {
        this.taste = taste;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Cake{" +
                "taste='" + taste + '\'' +
                ", price=" + price +
                '}';
    }
}
