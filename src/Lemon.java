public class Lemon extends Fruit{
    public Lemon() {
        super.setCalories(10);
    }

   public String removeKozhuru(){
        return "сейчас происходит удаление кожуры лемона";
    }

    @Override
    public String makeJuice(){
        return "сок сделан из лемона";
    }
}
