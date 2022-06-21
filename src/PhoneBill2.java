public class PhoneBill2 {
private double amountPlusTax;

    public PhoneBill2(double a, double b, double c, double d, double e) {
        double first = internetCost(a);
        double second = callsWithinUkraine(b);
        double third = sms(c);
        double fourth = callsAbroadZone1(d);
        double fifth = callsAbroadZone2(e);
        setAmountPlusTax(first + second + third + fourth + fifth);
    }

    public double getAmountPlusTax() {
        return amountPlusTax;
    }

    public void setAmountPlusTax(double amountPlusTax) {
        this.amountPlusTax = amountPlusTax;
    }

    public static double internetCost(double a){
        double costOfInternetUnderStandardPackage = 0;
        if (a > 8){
            costOfInternetUnderStandardPackage = (a - 8) * 1000/500 * 50;
        }
        return costOfInternetUnderStandardPackage;
    }

    public static double callsWithinUkraine (double b) {
        return b <= 500 ? 0.5 * b : 0.75 * b;
    }

    public static double sms (double c) {
        return c <= 50 ? 1 * c : 1.5 * c;
    }

    public static double callsAbroadZone1 (double d) {
        return d * 1.5;
    }

    public static double callsAbroadZone2 (double e) {
        return e * 2;
    }
}
