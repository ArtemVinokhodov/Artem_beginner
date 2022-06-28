public class Banana extends Fruit{
    public Banana() {
        super.setCalories(5);
    }

    public String peel(){
        return "сейчас происходит очистка банана";
    }

    @Override
    public String makeJuice(){
        return "сок сделан из банана";
    }
}
