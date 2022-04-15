public class Lesson4MinimumValue {


    public static void main(String[] args) {
        int [] array1 = new int[]{2, -4, 6, 5, 7, -2, 1, 4, 9, 8};
        int min = 0;
        for (int i = 0; i < array1.length; i++) {
            if (min > array1[i]) {
                min = array1[i];
            }
        }
        System.out.println(min);
    }
}
