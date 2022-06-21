public class PhoneBill3 {
    public static void main(String[] args) {
        PhoneBill2 phoneBill2 = new PhoneBill2(10, 400, 55, 20, 40);

        System.out.println((phoneBill2.getAmountPlusTax() * 0.07) + phoneBill2.getAmountPlusTax());

    }
}
