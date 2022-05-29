import java.util.Scanner;

public class PhoneBill {
public static Scanner scanner = new Scanner(System.in);
    public static double internetCost(double a){
        double costOfInternetUnderStandardPackage = 0;
        if (a > 8){
            costOfInternetUnderStandardPackage = (a - 8) * 1000/500 * 50;
        }
        return costOfInternetUnderStandardPackage;
    }

    public static double callsWithinUkraine (double a) {
    return a <= 500 ? 0.5 * a : 0.75 * a;
    }

    public static double sms (double a) {
        return a <= 50 ? 1 * a : 1.5 * a;
    }

    public static double callsAbroadZone1 (double a) {
        return a * 1.5;
    }

    public static double callsAbroadZone2 (double a) {
        return a * 2;
    }


    public static void main(String[] args) {
        System.out.println("Введите кол-во потраченных гб");
    double first = internetCost (scanner.nextDouble());
        System.out.println(first);
        System.out.println("Введите кол-во минут потраченных на звонки по Украние");
    double second = callsWithinUkraine (scanner.nextDouble());
        System.out.println(second);
        System.out.println("Введите кол-во смс потраченных на звонки по Украние");
    double third = sms (scanner.nextDouble());
        System.out.println(third);
        System.out.println("Введите кол-во минут потраченных на звонки за рубеж зона 1");
    double fourth = callsAbroadZone1 (scanner.nextDouble());
        System.out.println(fourth);
        System.out.println("Введите кол-во минут потраченных на звонки за рубеж зона 2");
    double fifth = callsAbroadZone2 (scanner.nextDouble());
        System.out.println(fifth);

    double amountPlusTax = first + second + third + fourth + fifth;
        System.out.println("Общие затараты с учетом налога: " + (amountPlusTax * 0.07) + amountPlusTax);
    }
}
