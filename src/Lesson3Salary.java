import java.util.Scanner;

public class Lesson3Salary {
    public static void main(String[] args) {
        numberOfSale(numbSel);
    }
    public static Scanner sc = new Scanner(System.in);

    private static int salaryBase = 1000;
    private static int bonus = 250;
    private static int numbSel = sc.nextInt();
    private static int total;

    public static void numberOfSale(int x) {
        if (x > 10) {
            System.out.println(total = salaryBase + bonus);
        }
        if (x <= 10) {
            System.out.println(salaryBase);
        }
    }
}
