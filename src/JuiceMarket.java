public class JuiceMarket {
    public static void main(String[] args) {
        Apple apple = new Apple();
        System.out.println(apple.removeSeeds());
        System.out.println(apple.makeJuice());
        System.out.println(apple.getCalories() + " калорий");

        Banana banana = new Banana();
        System.out.println(banana.peel());
        System.out.println(banana.makeJuice());
        System.out.println(banana.getCalories() + " калорий");

        Lemon lemon = new Lemon();
        System.out.println(lemon.removeKozhuru());
        System.out.println(lemon.makeJuice());
        System.out.println(lemon.getCalories() + " калорий");

        Orange orange = new Orange();
        System.out.println(orange.cuttingSlices());
        System.out.println(orange.makeJuice());
        System.out.println(orange.getCalories() + " калорий");
    }
}
