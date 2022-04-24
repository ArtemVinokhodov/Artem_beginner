import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class DaceGame {
    public static  Random random = new Random();
    //List <Integer> arr = new ArrayList<>(20);
    public static final int CHECKWIN = 20;
    public static int count = 0;

    
    public static void shafle() {
        for (int i = 0; i < 5; i++) {
            int die = random.nextInt(6) + 1;
            System.out.println("You threw out a number " + die);
            count = count + die;
        }
            if(count < CHECKWIN){
                System.out.println("You are lose " + count);
            }
            if(count == CHECKWIN){
                System.out.println("You are win " + count);
            }
            if(count > CHECKWIN){
                System.out.println("You are lose " + count);
            }
        }

    public static void main(String[] args) {
        shafle();
    }
    
}
