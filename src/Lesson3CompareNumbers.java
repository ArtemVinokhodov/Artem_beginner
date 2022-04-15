import java.util.Scanner;

public class Lesson3CompareNumbers {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int x = sc.nextInt();
        int y = sc.nextInt();
        compareNumbers(x, y);
    }
    public static void compareNumbers(int number1, int number2) {
        if (number1 > number2) System.out.println("The number " +
                number1 + " has the greatest value " + number2);
        if (number1 < number2) System.out.println("The number " +
                number2 + " has the greatest value " + number1);
        if (number1 == number2) System.out.println("The number " +
                number1 + " has the same value " + number2);
    }
}

