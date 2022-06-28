public class Apple extends Fruit {
    public Apple() {
        super.setCalories(7);
    }

    public String removeSeeds(){
        return "сейчас происходит удаление косточек яблока";
    }

    @Override
    public String makeJuice(){
       return "сок сделан из яблока";
    }
}
