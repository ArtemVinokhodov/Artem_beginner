import java.util.Arrays;

public class Lesson4ReversArr {

    public static void main(String[] args) {
        int[] mass = new int[] {2,3,4,5,6,7};
            System.out.println(Arrays.toString(mass));
        for (int i = mass.length - 1; i > mass.length; i--) {
            System.out.println(Arrays.toString(mass));

        }
    }

}
