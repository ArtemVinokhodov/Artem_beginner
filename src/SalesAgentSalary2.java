public class SalesAgentSalary2 {
    private double sumOfSalary;

    public SalesAgentSalary2(int houseWorked, double baseRate) {
        setSumOfSalary(hoursWorkedAndBaseBid(houseWorked, baseRate));
    }

    public SalesAgentSalary2(int houseWorked, double baseRate, int coefficientOnBaseHours, int enterNumberOfSales, double enterSalesAmount) {
        double a = hoursWorkedAndBaseBid(houseWorked, baseRate);
        double b = workExperience(coefficientOnBaseHours);
        double c = numberOfSales(enterNumberOfSales);
        double d = salesAmount(enterSalesAmount);
        setSumOfSalary((a + c + d) * b);
    }

    public double getSumOfSalary() {
        return sumOfSalary;
    }

    public void setSumOfSalary(double sumOfSalary) {
        this.sumOfSalary = sumOfSalary;
    }

    public static final int BASE_HOURS = 160;
    public static final int BONUS = 250;
    public static final int SALES_LIMIT = 15000;

    public static double hoursWorkedAndBaseBid(int houseWorked, double baseRate) {
        double salary;
        if (houseWorked > BASE_HOURS) {
            //salary = houseWorked * baseRate * 1.5 - BASE_HOURS;
            salary = (houseWorked - BASE_HOURS) * baseRate * 1.5 + BASE_HOURS * baseRate;
        } else {
            salary = houseWorked * baseRate;
        }
        //System.out.println("Ваш доход составил: " + salary);
        return salary;
    }

    public static double workExperience(int coefficientOnBaseHours) {
        double coefficient = 0;
        if (coefficientOnBaseHours < 2) {
            coefficient = (double) coefficientOnBaseHours * 1;
        } else if (coefficientOnBaseHours < 4) {
            coefficient = (double) coefficientOnBaseHours * 1.2;
        } else if (coefficientOnBaseHours < 7) {
            coefficient = (double) coefficientOnBaseHours * 1.3;
        } else {
            coefficient = (double) coefficientOnBaseHours * 1.4;
        }
        return coefficient;
    }

    public static double numberOfSales(int enterNumberOfSales) {
        double bonus = 0;
        if (enterNumberOfSales > 20) {
            return BONUS;
        } else if (enterNumberOfSales < 10) {
            return -150;
        }
        return bonus;
    }

    public static double salesAmount(double enterSalesAmount) {
        if (enterSalesAmount > SALES_LIMIT) {
            return BONUS;
        } else {
            return 0;
        }
    }
}

class SalaryCalculation{
    public static void main(String[] args) {
        SalesAgentSalary2 salesAgentSalaryOne = new SalesAgentSalary2(55, 5);
        SalesAgentSalary2 salesAgentSalaryTwo = new SalesAgentSalary2(165, 5, 55, 1000, 100.5);

        System.out.println(salesAgentSalaryOne.getSumOfSalary());
        System.out.println(salesAgentSalaryTwo.getSumOfSalary());
    }
}


