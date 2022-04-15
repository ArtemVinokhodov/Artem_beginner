import java.util.Scanner;

public class Lesson3CheckPassFail {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        checkPassFail(sc.nextInt());
        checkPassFail(sc.nextInt());
        checkOddEven(sc.nextInt());
    }
    public static void checkPassFail(int mark) {
        String passOrFail = ((mark) >= 50) ? "PASS" : "FAIL";
        System.out.println("DONE " + passOrFail);
    }
    public static void checkOddEven(int number) {
        String checkOddOrFail = ((number / 2) >= 50) ? "PASS" : "FAIL";
        System.out.println("BAY " + checkOddOrFail);
    }
}
