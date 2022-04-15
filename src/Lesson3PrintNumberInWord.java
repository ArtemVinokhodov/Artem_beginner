import java.util.Scanner;

public class Lesson3PrintNumberInWord {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        printNumberInWordIf(sc.nextInt());
        printNumberInWordSwitch(sc.nextInt());
    }
    public static void printNumberInWordIf(int number1) {
        if (number1 == 1) {
            System.out.println("ONE");
        } else if (number1 == 2) {
            System.out.println("TWO");
        } else if (number1 == 3) {
            System.out.println("TREE");
        } else if (number1 == 4) {
            System.out.println("FOUR");
        } else if (number1 == 5) {
            System.out.println("FIVE");
        } else if (number1 == 6) {
            System.out.println("SIX");
        } else if (number1 == 7) {
            System.out.println("SEVEN");
        } else if (number1 == 8) {
            System.out.println("EIGHT");
        } else if (number1 == 9) {
            System.out.println("NINE");
        } else if (number1 <= 0 || number1 > 9) {
            System.out.println("OTHER");
        }
    }
    public static void printNumberInWordSwitch (int number2){
        switch (number2) {
            case 1: System.out.println("ONE"); break;
            case 2: System.out.println("TWO"); break;
            case 3: System.out.println("TREE"); break;
            case 4: System.out.println("FOUR"); break;
            case 5: System.out.println("FIVE"); break;
            case 6: System.out.println("SIX"); break;
            case 7: System.out.println("SEVEN"); break;
            case 8: System.out.println("EIGHT"); break;
            case 9: System.out.println("NINE"); break;
            default: System.out.println("OTHER"); break;
        }
    }
}
