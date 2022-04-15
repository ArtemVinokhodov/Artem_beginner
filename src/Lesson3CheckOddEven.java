import java.util.Scanner;

public class Lesson3CheckOddEven {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        checkOddEven(sc.nextInt());
    }

    public static void checkOddEven(int number) {
        String checkOddOrFail = (number % 2 == 0) ? "Even Number" : "Odd Number";
        System.out.println("BAY " + checkOddOrFail);
    }
}
