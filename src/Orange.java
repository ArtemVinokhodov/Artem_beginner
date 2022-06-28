public class Orange extends Fruit{
    public Orange() {
        super.setCalories(2);
    }

   public String cuttingSlices(){
        return "сейчас происходит нарезание долек апельсина";
    }

    @Override
    public String makeJuice(){
        return "сок сделан из апельсина";
    }
}
