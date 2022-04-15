import java.util.Scanner;

public class Lesson4Count {
    public static void main(String[] args) {
        System.out.println("Enter size arry: ");
        checkCount(input = scanner.nextInt());
    }

    public static int count = 0;
    public static int input;
    public static Scanner scanner = new Scanner(System.in);

    public static void checkCount(int size) {
        int[] mass = new int[size];
        System.out.println("Enter elements: ");
        for (int i = 0; i < size; i++) {
            mass[i] = scanner.nextInt();
            if (mass[i] % 2 == 0) {
                count++;
            }
        }
        System.out.println(count);
    }
}
