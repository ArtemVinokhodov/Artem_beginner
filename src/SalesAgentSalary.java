import java.util.Scanner;

    public class SalesAgentSalary {
        public static Scanner scanner = new Scanner(System.in);
        public static final int BASE_HOURS = 160;
        public static final int BONUS = 250;
        public static final int SALES_LIMIT = 15000;


    public static double hoursWorkedAndBaseBid (int houseWorked, double baseRate) {
        double salary;
        if (houseWorked > BASE_HOURS) {
            //salary = houseWorked * baseRate * 1.5 - BASE_HOURS;
            salary = (houseWorked - BASE_HOURS) * baseRate * 1.5 + BASE_HOURS * baseRate;
        } else {
            salary = houseWorked * baseRate;
        }
        System.out.println("Ваш доход составил: " + salary);
        return salary;

    }
    public static double workExperience (int coefficientOnBaseHours){
        double coefficient = 0;
        if (coefficientOnBaseHours < 2) {
            coefficient = (double) coefficientOnBaseHours * 1;
        } else if (coefficientOnBaseHours < 4){
            coefficient = (double) coefficientOnBaseHours * 1.2;
        } else if (coefficientOnBaseHours < 7){
            coefficient = (double) coefficientOnBaseHours * 1.3;
        } else {
            coefficient = (double) coefficientOnBaseHours * 1.4;
        }
        System.out.println("Ваш коэф составил: " + coefficient);
        return coefficient;
    }

        public static double numberOfSales (int enterNumberOfSales) {
            double bonus = 0;
            if (enterNumberOfSales > 20) {
                return BONUS;
            } else if (enterNumberOfSales < 10) {
                return -150;
            }
            System.out.println("Ваш доход составил: " + bonus);
            return bonus;
        }

        public static double salesAmount (double enterSalesAmount) {
            if (enterSalesAmount > SALES_LIMIT) {
                System.out.println("Ваш доход составил: " + BONUS);
                return BONUS;
            }
            else {
                System.out.println("Ваш бонус отсутствует");
                return 0;
            }
        }

        public static void main(String[] args) {
            System.out.println("Введите количество отработанных часов и базовую\n" +
                    "ставку: ");
            double a = hoursWorkedAndBaseBid(scanner.nextInt(), scanner.nextDouble());

            System.out.println("Введите стаж работы");
            double b = workExperience(scanner.nextInt());

            System.out.println("Введите количество продаж для рассчета запраты с учетом бонуса");
            double c = numberOfSales(scanner.nextInt());

            System.out.println("Введите сумму продаж для рассчета запраты с учетом бонуса");
            double d = salesAmount(scanner.nextInt());

            double sumOfSalary = (a + c + d) * b;
            System.out.println("Ваша запрлата составляет: " + sumOfSalary);
        }
    }
